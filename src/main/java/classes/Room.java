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
    private String arrive;
    private String leave;
    private boolean state;
    private Lista<User> history;

    public Room(int id, String type, String level, String arrive, String leave) {
        this.id = id;
        this.type = type;
        this.level = level;
        this.arrive = arrive;
        this.leave = leave;
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

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }
    
    
    
}
