/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 * @author carre
 * ABB (Árbol Binario de Búsqueda) is a class representing a Binary Search Tree.
 * It provides methods for inserting, searching, and deleting nodes from the tree.
 */
public class ABB {
    
    private NodoTree root = null;
    /**
     * Inserts a new node with the specified key into the tree.
     *
     * @param key the key of the room to be inserted
     */
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
    /**
     * Searches for a node with the specified key in the tree.
     *
     * @param key the key to search for
     * @return the node with the specified key, or null if not found
     */
    public NodoTree contains(int key) {
        return containsHelper(root, key);
    }
    
    private NodoTree containsHelper(NodoTree node, int key) {
        if (node == null) {
            return null;
        }
        
        if (key == node.getElement()) {
            return node;
        } else if (key < node.getElement()) {
            return containsHelper(node.getLeftSon(), key);
        } else {
            return containsHelper(node.getRightSon(), key);
        }
    }
    /**
     * Prints the elements of the tree in order.
     */
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
    /**
     * Deletes a node with the specified key from the tree.
     *
     * @param key the key of the room to be deleted
     */
    public void delete(Room key) {
    root = deleteHelper(root, key);
}

    private NodoTree deleteHelper(NodoTree node, Room key) {
    if (node == null) {
        return null;
    }

    if (key.getId() < node.getElement()) {
        node.setLeftSon(deleteHelper(node.getLeftSon(), key));
    } else if (key.getId() > node.getElement()) {
        node.setRightSon(deleteHelper(node.getRightSon(), key));
    } else {
        if (node.getLeftSon() == null && node.getRightSon() == null) {
            node = null;
        } else if (node.getLeftSon() == null) {
            node = node.getRightSon();
        } else if (node.getRightSon() == null) {
            node = node.getLeftSon();
        } else {
            NodoTree temp = findSmallest(node.getRightSon());
            node.setElement(temp.getRoom());
            node.setRightSon(deleteHelper(node.getRightSon(), temp.getRoom()));
        }
    }

    return node;
}

    private NodoTree findSmallest(NodoTree node) {
    while (node.getLeftSon() != null) {
        node = node.getLeftSon();
    }

    return node;
}
}

