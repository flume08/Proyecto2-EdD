/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class SearchBinnaryTree {
    private NodoTree root;
    public SearchBinnaryTree(){
        this.root = null;
    }
    public NodoTree getRoot() {
        return root;
    }
    public NodoTree search(NodoTree root,int element){
        if(root == null){
            return null;
        }
        else{
            if(root.getElement() == element){
                return root;
            }
            else{
                if(root.getElement() > element){
                    search(root.getLeftSon(),element);
                }
                else{
                    search(root.getRightSon(),element);
                }
            }
        }
        return null;
    } 
    public void insert(NodoTree root,Room element){
        NodoTree nodoNew = new NodoTree(element);
        if(root == null){
            root = nodoNew;
        }else{
            if(root.getElement() >  element.getId()){
                insert(root.getLeftSon(),element);
            }
            else{
                insert(root.getRightSon(),element);
            }
        }
    }
    public NodoTree searchMinimun(NodoTree nodo){
        if (nodo == null) {
        return null;
    } else if (nodo.getLeftSon() == null) {
        return nodo;
    } else {
        return searchMinimun(nodo.getLeftSon());
    }
    }
}
