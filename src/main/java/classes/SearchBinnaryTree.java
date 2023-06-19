/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 * @param <T>
 */
public class SearchBinnaryTree<T> {
    private NodoTree<T> root;
    public SearchBinnaryTree(){
        this.root = null;
    }
    public NodoTree<T> getRoot() {
        return root;
    }
    public NodoTree search(NodoTree root,T element){
        if(root == null){
            return null;
        }
        else{
            if(root.getElement() == element){
                return root;
            }
            else{
                if((int)root.getElement() > (int) element){
                    search(root.getLeftSon(),element);
                }
                else{
                    search(root.getRightSon(),element);
                }
            }
        }
    }
}
