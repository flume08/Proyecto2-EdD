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
            if((int)root.getElement() == element){
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
    public void insert(NodoTree root,int element){
        NodoTree nodoNew = new NodoTree(element);
        if(root == null){
            root = nodoNew;
        }else{
            if((int) root.getElement() >  element){
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
    public void delete(NodoTree root, int element){
        NodoTree aux;
        if(root == null){
            System.out.println("El elemento no existe");
        }
        else{
            if( element < root.getElement()){
                delete(root.getLeftSon(), element);
            }else{
                if( element > root.getElement()){
                    delete(root.getRightSon(), element);
                }else{
                    if(root.getLeftSon()==null){
                        aux = root;
                        root = root.getRightSon();
                    }else{
                        if(root.getRightSon()==null){
                            aux = root;
                            root = root.getLeftSon();
                        }else{
                            aux = searchMinimun(root.getRightSon());
                            root.setElement(aux.getElement());
                            delete(root.getRightSon(),root.getElement());
                        }
                    }
                }
            }
        }
    }
}