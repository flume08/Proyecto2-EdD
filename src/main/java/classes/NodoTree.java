/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 * @author carre
 * NodoTree represents a node in a binary search tree used for room management.
 * Each node contains a reference to a Room object and references to its left and right child nodes.
 */
public class NodoTree {
     private Room element;
    private NodoTree  leftSon;
    private NodoTree  rightSon;
  /**
     * Constructs a new NodoTree object with the specified Room element.
     *
     * @param element the Room object associated with the node
     */   
    public NodoTree(Room element){
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }
/**
     * Retrieves the ID of the Room element associated with the node.
     *
     * @return the ID of the Room element
     */
    public int getElement() {
        return element.getId();
    }
    /**
     * Retrieves the Room object associated with the node.
     *
     * @return the Room object
     */
    public Room getRoom(){
        return element;
    }
/**
     * Sets the Room element associated with the node.
     *
     * @param element the Room object to set
     */
    public void setElement(Room element) {
        this.element = element;
    }
/**
     * Retrieves the left child node of the current node.
     *
     * @return the left child node
     */
    public NodoTree getLeftSon() {
        return leftSon;
    }
/**
     * Sets the left child node of the current node.
     *
     * @param leftSon the left child node to set
     */
    public void setLeftSon(NodoTree leftSon) {
        this.leftSon = leftSon;
    }
/**
     * Retrieves the right child node of the current node.
     *
     * @return the right child node
     */
    public NodoTree getRightSon() {
        return rightSon;
    }
/**
     * Sets the right child node of the current node.
     *
     * @param rightSon the right child node to set
     */
    public void setRightSon(NodoTree rightSon) {
        this.rightSon = rightSon;
    }
}
