/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 * @author carre
 * GuiLogic is a class that provides various methods for manipulating and processing data related to rooms and users.
 * It includes methods for sorting, searching, adding users to a hash table, performing check-in and check-out operations,
 * and retrieving information about users and room history.
 */
/**
     * Constructs and returns an ABB (binary search tree) based on the given rooms and historical data.The method initializes the ABB with rooms in a specific order and adds historical data to each room.
     *
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
      /**
     * Sorts the given list of users using the bubble sort algorithm.
     *
     * @param list a Lista of User objects to be sorted
     */
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
  /**
     * Performs a binary search in the given list of users to find a user with the specified ID.
     *
     * @param list a Lista of User objects to be searched
     * @param id   the ID of the user to search for
     * @return the User object with the specified ID if found, otherwise null
     */
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
  /**
     * Adds a user to the specified hash table based on their name's hash code.
     *
     * @param tabla the TablaHash object representing the hash table
     * @param user  the User object to be added to the hash table
     */
  public void addUser(TablaHash<User> tabla, User user){
      int key = Math.abs(user.getName().hashCode()) % 1000;
      tabla.table[key].addAtTheEndT(user);
  }
  /**
     * Initializes and returns a hash table with a specific size based on the given array of current users.
     *
     * @param current an array of User objects representing the current users
     * @return a TablaHash object representing the initialized hash table
     */
  public TablaHash<User> initializeHash(User[] current){
      TablaHash<User> tabla = new TablaHash<>(1000);
      for(int i=0; i<1000; i++){
          Lista<User> lista = new Lista<>();
          tabla.table[i] = lista;
      }
      for(int x=0; x<current.length; x++){
          if(current[x] != null){
          int key = Math.abs(current[x].getName().hashCode()) % 1000;
          tabla.addElementK(current[x], key);
      }
}
/**
     * Finds and returns a user with the specified name from the specified hash table.
     *
     * @param name  the name of the user to search for
     * @param tabla the TablaHash object representing the hash table
     * @return the User object with the specified name if found, otherwise null
     */      
  return tabla;}
  public User findUser(String name, TablaHash<User> tabla){
       int key = Math.abs(name.hashCode()) % 1000;
       System.out.println(key);
       for(int i = 0; i<tabla.table[key].getSize(); i++){
           if (tabla.table[key].accessElement(i).getName().equals(name)){
               User user = tabla.table[key].accessElement(i);
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
    /**
     * Finds and returns a user with the specified ID from the specified hash table.
     *
     * @param id    the ID of the user to search for
     * @param tabla the TablaHash object representing the hash table
     * @return the User object with the specified ID if found, otherwise null
     */
  public int checkIn(int id, Lista<User> reservaciones, Room[] rooms, TablaHash<User> tabla){

   User user = this.binarySearch(reservaciones, id);
   for(int i = 0; i < rooms.length; i++){
       if(user.getRoom() == rooms[i].getType()){
           if(rooms[i].isState()){
               user.setRoom(String.valueOf(i));
               rooms[i].setState(false);
               return i;
           }
      reservaciones.deleteIntN(user);
      this.addUser(tabla, user);
      
  }
  }return -1;
  }

 /**
     * Performs the check-out operation for a user with the specified name.
     *
     * @param name   the name of the user to check out
     * @param tabla  the TablaHash object representing the hash table
     * @param arbolito the ABB object representing the binary search tree
     */
  public void checkOut(String name,TablaHash<User> tabla, ABB arbolito){
      User user = this.findUser(name, tabla);
      Room room = arbolito.contains(Integer.parseInt(user.getRoom())).getRoom();
      room.addHistory(user);
      room.setState(true);
  }
  /**
     * Retrieves and returns specific attributes of a user with the specified name from the hash table.
     *
     * @param name  the name of the user
     * @param tabla the TablaHash object representing the hash table
     * @return an array of strings representing the attributes of the user
     */
  public String[] function1(String name, TablaHash<User> tabla){

      User user = this.findUser(name, tabla);
      return user.showAttributes();
  }
  /**
     * Retrieves and returns specific attributes of a user with the specified ID from the reservations.
     *
     * @param id            the ID of the user
     * @param reservaciones a Lista of User objects representing the reservations
     * @return an array of strings representing the attributes of the user
     */
  public String[] function2(int id, Lista<User> reservaciones){

      User user = this.binarySearch(reservaciones, id);
      return user.showAttributes2();
  }
  /**
     * Retrieves and returns the history of a room with the specified room number from the binary search tree.
     *
     * @param roomNumber the room number
     * @param arbolito   the ABB object representing the binary search tree
     * @return a Lista of User objects representing the room history
     */
  public Lista<User> function3(int roomNumber, ABB arbolito){
      return arbolito.contains(roomNumber).getRoom().getHistory(); 
  }
}
