/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class TablaHash<T> {
    private int capacity;
    private Lista<T>[] table;
    private int size;
    
    public TablaHash(int capacity){
        this.capacity = capacity;
        this.table = new Lista[capacity];
    }
    private int hashFunction(Object key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % table.length;
}
    public void addElement(T element){
        int index = hashFunction(element);
        table[index].addAtTheEndT(element);
    }
    public boolean findElement(T element){
        int index = hashFunction(element);
        return table[index].findElement(element);
    }
    public boolean deleteElement(T element){
        int index = hashFunction(element);
        return table[index].deleteIntN(element);
    }
}
