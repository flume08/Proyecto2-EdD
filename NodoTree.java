/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class NodoTree {
    private int element;
    private NodoTree  leftSon;
    private NodoTree  rightSon;
    
    public NodoTree(int element){
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public NodoTree getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoTree leftSon) {
        this.leftSon = leftSon;
    }

    public NodoTree getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoTree rightSon) {
        this.rightSon = rightSon;
    }
    
}