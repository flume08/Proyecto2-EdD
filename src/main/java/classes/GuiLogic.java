/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author carre
 */
public class GuiLogic {
    public SearchBinnaryTree Rooms(Room[] rooms){
        SearchBinnaryTree arbolito = new SearchBinnaryTree();
        arbolito.insert(null, rooms[149]);
        for(int i=0;i<150;i++){
            arbolito.insert(arbolito.getRoot(), rooms[149-i]);
            arbolito.insert(arbolito.getRoot(), rooms[149+i]);
        }
        return arbolito;
    }
    
    public Lista<User> sorted(Lista<User> list) {
    if (list.getSize()< 2) {
      return list;
    }
    int mid = list.getSize()/2;
    return merged(
        sorted(list.subList(0, mid)), 
        sorted(list.subList(mid, list.getSize())));
  }

  public Lista<User> merged(Lista<User> left, Lista<User> right) {
    int leftIndex = 0;
    int rightIndex = 0;
    Lista<User> merged = new Lista<>();

    while (leftIndex < left.getSize() && rightIndex < right.getSize()) {
      if (left.accessElement(leftIndex).getDni() < right.accessElement(rightIndex).getDni()) {
        merged.addAtTheEndT(left.accessElement(leftIndex++));
      } else {
        merged.addAtTheEndT(right.accessElement(rightIndex++));
      }
    }
    merged.addAll(left.subList(leftIndex, left.getSize()));
    merged.addAll(right.subList(rightIndex, right.getSize()));
    return merged;
  }
  public void bubbleSort(Lista<User> list){
    int n = list.getSize();
    User temp = null;
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if (list.accessElement(j).getDni() > list.accessElement(j+1).getDni()) {
                temp = list.accessElement(j);
                list.swapElements(j, j+1);
                list.accessElementNodo(j+1).setElement(temp);
            }
        }
    }
    }
  public boolean binarySearch(Lista<User> list, int id){
        int l = 0, r = list.getSize() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (list.accessElement(m).getDni() == id)
                return true;
 
            // If x greater, ignore left half
            if (list.accessElement(m).getDni() < id)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // If we reach here, then element was
        // not present
        return false;
  }
}
