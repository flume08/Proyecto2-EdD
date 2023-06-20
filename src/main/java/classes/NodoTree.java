/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class NodoTree<T> {
    private T element;
    private NodoTree <T> leftSon;
    private NodoTree <T> rightSon;
    
    public NodoTree(T element){
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public NodoTree<T> getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(NodoTree<T> leftSon) {
        this.leftSon = leftSon;
    }

    public NodoTree<T> getRightSon() {
        return rightSon;
    }

    public void setRightSon(NodoTree<T> rightSon) {
        this.rightSon = rightSon;
    }
    
}
