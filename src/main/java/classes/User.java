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
public class User {
    private String name;
    private int dni;
    private String phone;
    private String email;
    private String gender;
    private String arrival;
    private String departure;
    private String room;

    public User(String name, int dni, String phone, String email, String gender, String room, String arrival, String departure) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.room = room;
        this.arrival = arrival;
        this.departure = departure;   
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }  

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return the room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room the room to set
     */
    public void setRoom(String room) {
        this.room = room;
    }
    public String[] showAttributes(){
        String[] user = new String[4];
        user[0] = this.name;
        user[1] = this.gender;
        user[2] = this.phone;
        user[3] = String.valueOf(this.room);
        return user;
    }
    public String[] showAttributes2(){
        String[] user = new String[5];
        user[0] = this.name;
        user[1] = String.valueOf(dni);
        user[2] = this.gender;
        user[3] = this.phone;
        user[4] = this.room;
        return user;
    }
}
