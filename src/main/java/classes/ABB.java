/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class ABB {
    
    private NodoTree root = null;
    public void insert(Room key) {
        root = insertHelper(root, key);
    }
    
    private NodoTree insertHelper(NodoTree node, Room key) {
        if (node == null) {
            node = new NodoTree(key);
            return node;
        }
        
        if (key.getId() < node.getElement()) {
            node.setLeftSon(insertHelper(node.getLeftSon(), key));
        } else if (key.getId() > node.getElement()) {
            node.setRightSon(insertHelper(node.getRightSon(), key));
        }
        
        return node;
    }
    
    public boolean contains(Room key) {
        return containsHelper(root, key);
    }
    
    private boolean containsHelper(NodoTree node, Room key) {
        if (node == null) {
            return false;
        }
        
        if (key.getId() == node.getElement()) {
            return true;
        } else if (key.getId() < node.getElement()) {
            return containsHelper(node.getLeftSon(), key);
        } else {
            return containsHelper(node.getRightSon(), key);
        }
    }
    
    public void printInOrder() {
        printInOrderHelper(root);
    }
    
    private void printInOrderHelper(NodoTree node) {
        if (node != null) {
            printInOrderHelper(node.getLeftSon());
            System.out.print(node.getElement() + " ");
            printInOrderHelper(node.getRightSon());
        }
    }
}

