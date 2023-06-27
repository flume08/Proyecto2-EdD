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
    private String lastname;
    private String email;
    private String genre;
    private int hab;

    public User(String name, int dni, String phone, String lastname, String email, String genre) {
        this.name = name;
        this.dni = dni;
        this.phone = phone;
        this.lastname = lastname;
        this.email = email;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
}
