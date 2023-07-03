/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * @author David Mavares
 * Room represents a room in a hotel with its associated attributes and history of users.
 */
public class Room {
    private int id;
    private String type;
    private String level;
    private boolean state;
    private Lista<User> history;

/**
     * Constructs a new Room object with the specified attributes and history.
     *
     * @param id      the ID of the room
     * @param type    the type of the room
     * @param level   the level of the room
     * @param state   the state of the room (occupied or vacant)
     * @param history the history of users associated with the room
     */
    public Room(int id, String type, String level, boolean state,Lista<User> history) {

        this.id = id;
        this.type = type;
        this.level = level;
        this.state = state;
        this.history = history;
    }
    /**
     * Retrieves the ID of the room.
     *
     * @return the ID of the room
     */

    public int getId() {
        return id;
    }
 /**
     * Sets the ID of the room.
     *
     * @param id the ID of the room to set
     */
    public void setId(int id) {
        this.id = id;
    }
 /**
     * Retrieves the type of the room.
     *
     * @return the type of the room
     */
    public String getType() {
        return type;
    }
/**
     * Sets the type of the room.
     *
     * @param type the type of the room to set
     */
    public void setType(String type) {
        this.type = type;
    }
/**
     * Retrieves the level of the room.
     *
     * @return the level of the room
     */
    public String getLevel() {
        return level;
    }
/**
     * Sets the level of the room.
     *
     * @param level the level of the room to set
     */
    public void setLevel(String level) {
        this.level = level;
    }    

    /**
     * @return the state
     */
    public boolean isState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * @return the history
     */
    public Lista<User> getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(Lista<User> history) {
        this.history = history;
    }
    public void addHistory(User user){
        this.history.addAtTheEndT(user);
    }
    /**
     * Retrieves the list of names of users in the history of the room.
     *
     * @return the list of user names in the history
     */
    public Lista<String> showHistory(){
        Lista<String> user = new Lista<>();
        for(int i =0; i<this.history.getSize(); i++){
           user.addAtTheEndT(history.accessElement(i).getName());
        }
        return user;
    }
}
