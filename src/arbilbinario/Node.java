/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbilbinario;

/**
 *
 * @author fhernandez
 */
public class Node {
    String key;
    Node RightNode;
    Node LeftNode;

    public Node(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Node getRightNode() {
        return RightNode;
    }

    public void setRightNode(Node RightNode) {
        this.RightNode = RightNode;
    }

    public Node getLeftNode() {
        return LeftNode;
    }

    public void setLeftNode(Node LeftNode) {
        this.LeftNode = LeftNode;
    }
}
