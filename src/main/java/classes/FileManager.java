/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author kaik
 * FileManager is a class that provides methods to read and initialize data from CSV files.
 * It can read reservations, rooms, current state, and historic data from specific CSV files.
 */
public class FileManager {
    
    String line = "";
    BufferedReader reader = null;
    PrintWriter writer = null;
    /**
     * Path to the CSV file containing reservations data.
     */
    public static final String ESTADOPATH = "database\\Estado.csv";
    /**
     * Path to the CSV file containing rooms data.
     */
    public static final String HABITACIONESPATH = "database\\Habitaciones.csv";
    /**
     * Path to the CSV file containing current state data.
     */
    public static final String HISTORICOPATH = "database\\Historico.csv";
     /**
     * Path to the CSV file containing historic data.
     */
    public static final String RESERVASPATH = "database\\Reservas.csv";
    /**
     * Reads reservations data from the reservations CSV file.
     *
     * @return a Lista of User objects representing the reservations
     */  
    public Lista<User> readReservations() {
        Lista<User> reservationsUsers = new Lista<User>();
        try {
            reader = new BufferedReader(new FileReader(RESERVASPATH));

            while ((line = reader.readLine()) != null ) {              
                
                String[] row = line.split(","); 
                reservationsUsers.addAtTheEndT(initializeReservas(row));               
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        return reservationsUsers;
    }  
    /**
     * Initializes a User object using data from a reservations row.
     *
     * @param data an array of strings representing the reservations row data
     * @return a User object initialized with the reservations data
     */
    public User initializeReservas(String[] data) {
        int id = Integer.parseInt(data[0].replace(".", ""));
        String name = data[1] + " " + data[2];
        String email = data[3];
        String gender = data[4];
        String room = data[5];
        String phone = data[6];
        String arrival = data[7];
        String departure = data[8];
        User user = new User(name, id, phone, email, gender, room, arrival, departure);
        return user;
    }
    /**
     * Reads rooms data from the rooms CSV file.
     *
     * @return an array of Room objects representing the rooms
     */
    public Room[] readRooms() {
        Room[] rooms = new Room[300];
        try {
            reader = new BufferedReader(new FileReader(HABITACIONESPATH));
            for (int i = 0; i < 300; i++) {
                
                line = reader.readLine();
                String[] row = line.split(","); 
                rooms[i] = initializeRooms(row);               
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        return rooms;
    }
    /**
     * Initializes a Room object using data from a rooms row.
     *
     * @param data an array of strings representing the rooms row data
     * @return a Room object initialized with the rooms data
     */
    public Room initializeRooms(String[] data) {
        int id = Integer.parseInt(data[0]);
        String type = data[1];
        String level = data[2];
        Lista<User> historico = new Lista<>();
        Room room = new Room(id, type, level, true,historico);
        return room;
    }
    /**
     * Reads current state data from the current state CSV file.
     *
     * @return an array of User objects representing the current state
     */
    public User[] readCurrentState() {
        int i = 0;
        User[] currentState = new User[300];
        try {
            reader = new BufferedReader(new FileReader(ESTADOPATH));
            while ((line = reader.readLine()) != null) {
                
                String[] row = line.split(","); 
                currentState[i] = initializeCurrentState(row);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        return currentState;
    }
    /**
     * Initializes a User object using data from a current state row.
     *
     * @param data an array of strings representing the current state row data
     * @return a User object initialized with the current state data
     */
    public User initializeCurrentState(String[] data) {
        String room = data[0];
        String name = data[1] + " " + data[2];
        String email = data[3];
        String gender = data[4];
        String phone = data[5];
        String arrival = data[6];
        
        User user = new User(name, 0, phone, email, gender, room, arrival, null);
        return user;
    }
    /**
     * Reads historic data from the historic CSV file.
     *
     * @return a Lista of User objects representing the historic data
     */
    public Lista<User> readHistoric() {
        Lista<User> roomsHistoric = new Lista<User>();
        try {
            reader = new BufferedReader(new FileReader(HISTORICOPATH));
            while ((line = reader.readLine()) != null) {
                
                String[] row = line.split(","); 
                roomsHistoric.addAtTheEndT(initializeHistoric(row));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
        return roomsHistoric;
    }
    /**
     * Initializes a User object using data from a historic row.
     *
     * @param data an array of strings representing the historic row data
     * @return a User object initialized with the historic data
     */
    public User initializeHistoric(String[] data) {
        int id = Integer.parseInt(data[0].replace(".", ""));
        String name = data[1] + " " + data[2];
        String email = data[3];
        String gender = data[4];
        String arrival = data[5];
        String room = data[6];
        
        User user = new User(name, id, null, email, gender, room, arrival, null);
        return user;
    }
}