/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author David Mavares
 */
public class Room {
    private int id;
    private String type;
    private String level;
    private boolean state;
    private Lista<User> history;


    public Room(int id, String type, String level, boolean state,Lista<User> history) {

        this.id = id;
        this.type = type;
        this.level = level;
        this.state = state;
        this.history = history;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

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
    public Lista<String> showHistory(){
        Lista<String> user = new Lista<>();
        for(int i =0; i<this.history.getSize(); i++){
           user.addAtTheEndT(history.accessElement(i).getName());
        }
        return user;
    }
}
