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
    public ABB Rooms1(Room[] rooms, Lista<User> historico){
        for(int i=0;i<historico.getSize();i++){
            rooms[Integer.parseInt(historico.accessElement(i).getRoom())-1].addHistory(historico.accessElement(i));
        }
        ABB arbolito = new ABB();
        arbolito.insert(rooms[149]);
        for(int i=0;i<150;i++){
            arbolito.insert(rooms[149-i]);
            arbolito.insert(rooms[149+i]);
        }
        arbolito.insert(rooms[299]);
        return arbolito;
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
  public User binarySearch(Lista<User> list, int id){
        int l = 0, r = list.getSize() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (list.accessElement(m).getDni() == id)
                return list.accessElement(m);
 
            // If x greater, ignore left half
            if (list.accessElement(m).getDni() < id)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // If we reach here, then element was
        // not present
        return null;
  }
  public void addUser(TablaHash<User> tabla, User user){
      int key = Math.abs(user.getName().hashCode()) % 1000;
      tabla.table[key].addAtTheEndT(user);
  }
  public TablaHash<User> initializeHash(User[] current){
      TablaHash<User> tabla = new TablaHash<>(1000);
      for(int i=0; i<current.length; i++){
          int key = Math.abs(current[i].getName().hashCode()) % 1000;
          tabla.addElementK(current[i], key);
      }
  return tabla;}
  public User findUser(String name, TablaHash<User> tabla){
       int key = Math.abs(name.hashCode()) % 1000;
       for(int i = 0; i<tabla.table[key].getSize(); i++){
           if (tabla.table[key].accessElement(i).getName() == name){
               return tabla.table[key].accessElement(i);
           }
       }
       return null;
  }
    public User findUserU(Object id, TablaHash<User> tabla){
       int key = Math.abs(id.hashCode()) % 1000;
       for(int i = 0; i<tabla.table[key].getSize(); i++){
           if (tabla.table[key].accessElement(i).getDni() == (int) id){
               return tabla.table[key].accessElement(i);
           }
       }
       return null;
  }
  public void checkIn(int id, Lista<User> reservaciones, Room[] rooms, TablaHash<User> tabla){
   GuiLogic logic = new GuiLogic();
   User user = logic.binarySearch(reservaciones, id);
   for(int i = 0; i < rooms.length; i++){
       if(user.getRoom() == rooms[i].getType()){
           if(rooms[i].isState()){
               user.setRoom(String.valueOf(i));
               rooms[i].setState(false);
           }
      reservaciones.deleteIntN(user);
      logic.addUser(tabla, user);
  }
  }
  }
  public void checkOut(int id,TablaHash<User> tabla, ABB arbolito){
      GuiLogic logic = new GuiLogic();
      User user = logic.findUserU(id, tabla);
      Room room = arbolito.contains(Integer.parseInt(user.getRoom())).getRoom();
      room.addHistory(user);
      room.setState(true);
  }
  public String[] function1(String name, TablaHash<User> tabla){
      GuiLogic logic = new GuiLogic();
      User user = logic.findUserU(name, tabla);
      return user.showAttributes();
  }
  public String[] function2(int id, Lista<User> reservaciones){
      GuiLogic logic = new GuiLogic();
      User user = logic.binarySearch(reservaciones, id);
      return user.showAttributes2();
  }
  public Lista<User> function3(int roomNumber, ABB arbolito){
      return arbolito.contains(roomNumber).getRoom().getHistory(); 
  }
}
