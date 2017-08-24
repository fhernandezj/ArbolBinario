/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbilbinario;

import java.util.Scanner;

/**
 *
 * @author fhernandez
 */
public class ArbilBinario {

    /**
     * @param args the command line arguments
     */
    static Tree tree;
            
    public static void main(String[] args) {
        // TODO code application logic here
        createTree();
        System.out.println("Inorder");
        tree.Inorder(tree.nodes.get(0));
        System.out.println("Preorden");
        tree.Preorder(tree.nodes.get(0));
        System.out.println("Postorder");
        tree.Postorder(tree.nodes.get(0));
        System.out.println("Order Level");
        tree.OrderLevel(tree.nodes.get(0));
        System.out.println("Inverted Order Level");
        tree.OrderLevelInv(tree.nodes.get(0));
    }
    
    public static void createTree(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Menu:");
        System.out.println("1. Create Tree");
        System.out.println("2. Exit");
        System.out.print("Type an option: ");
        int option = sc.nextInt();
        
        if(option == 1){
            System.out.print("Type node key: ");
            String key = sc.next();
            tree = new Tree(key);
            while(option != 3){
                System.out.println("Menu:");
                System.out.println("1. Insert Right Node");
                System.out.println("2. Insert Left Node");
                System.out.println("3. Exit");
                System.out.print("Type an option: ");
                option = sc.nextInt();
                
                if(option==1 || option==2){
                    System.out.print("Type father's key: ");
                    String father = sc.next();
                    System.out.print("Type node's key: ");
                    String newKey = sc.next();
                    if(option==1){
                        tree.addNode(father, newKey, true);
                    }else{
                        tree.addNode(father, newKey, false);
                    }
                }
            }
        }
    }
    
}
