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
    private Nodo <T> leftSon;
    private Nodo <T> rightSon;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Nodo<T> getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Nodo<T> leftSon) {
        this.leftSon = leftSon;
    }

    public Nodo<T> getRightSon() {
        return rightSon;
    }

    public void setRightSon(Nodo<T> rightSon) {
        this.rightSon = rightSon;
    }
    
}
