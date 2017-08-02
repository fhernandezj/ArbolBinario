/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbilbinario;

import java.util.ArrayList;

/**
 *
 * @author fhernandez
 */
public class Tree {
    ArrayList<Node> nodes;

    public Tree(String rootKey) {
        nodes = new ArrayList();
        nodes.add(new Node(rootKey));
    }
    
    public void addNode(String father, String key, Boolean isRight){
        for (Node root : nodes) {
            if(root.getKey().equals(father)){
                nodes.add(new Node(key));
                if(isRight){
                    root.RightNode = nodes.get(nodes.size()-1);                    
                }else{
                    root.LeftNode = nodes.get(nodes.size()-1);
                }
                break;
            }
        }
    }
    
    public void Preorder(Node root){
        if(root != null){
            System.out.println(root.getKey());
            Preorder(root.LeftNode);
            Preorder(root.RightNode);
        }
    }
    
    public void Inorder(Node root){
        if(root != null){            
            Inorder(root.LeftNode);
            System.out.println(root.getKey());
            Inorder(root.RightNode);
        }
    }
    
    public void Postorder(Node root){
        if(root != null){           
            Postorder(root.LeftNode);            
            Postorder(root.RightNode);
            System.out.println(root.getKey());
        }
    }
}
