/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * @author David Mavares
 * The User class represents a user in the system.
 * It stores information such as name, ID, contact details, and assigned room.
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
/**
     * Constructs a new User with the specified information.
     *
     * @param name The name of the user.
     * @param dni The ID number of the user.
     * @param phone The phone number of the user.
     * @param email The email address of the user.
     * @param gender The gender of the user.
     * @param room The assigned room of the user.
     * @param arrival The arrival date of the user.
     * @param departure The departure date of the user.
     */
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
/**
     * Returns the name of the user.
     *
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }
 /**
     * Sets the name of the user.
     *
     * @param name The name to set.
     */
    public void setName(String name) {
        this.name = name;
    }
/**
     * Returns the ID number of the user.
     *
     * @return The ID number of the user.
     */
    public int getDni() {
        return dni;
    }
 /**
     * Sets the ID number of the user.
     *
     * @param dni The ID number to set.
     */
    public void setDni(int dni) {
        this.dni = dni;
    }
 /**
     * Returns the phone number of the user.
     *
     * @return The phone number of the user.
     */
    public String getPhone() {
        return phone;
    }
 /**
     * Sets the phone number of the user.
     *
     * @param phone The phone number to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
/**
     * Returns the email address of the user.
     *
     * @return The email address of the user.
     */
    public String getEmail() {
        return email;
    }
/**
     * Sets the email address of the user.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }
/**
     * Returns the gender of the user.
     *
     * @return The gender of the user.
     */
    public String getGender() {
        return gender;
    }
 /**
     * Sets the gender of the user.
     *
     * @param gender The gender to set.
     */
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
