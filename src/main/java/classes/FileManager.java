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
 *
 * @author kraik
 */
public class FileManager {
    
    String line = "";
    BufferedReader reader = null;
    PrintWriter writer = null;
    
    public static final String ESTADOPATH = "database\\Estado.csv";
    public static final String HABITACIONESPATH = "database\\Habitaciones.csv";
    public static final String HISTORICOPATH = "database\\Historico.csv";
    public static final String RESERVASPATH = "database\\Reservas.csv";
      
    public Lista<User> readReservations() {
        Lista<User> reservationsUsers = new Lista<User>();
        try {
            reader = new BufferedReader(new FileReader(RESERVASPATH));

            while ((line = reader.readLine()) != null ) {              
                
                line = reader.readLine();
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
    
    public Room initializeRooms(String[] data) {
        int id = Integer.parseInt(data[0]);
        String type = data[1];
        String level = data[2];
        Lista<User> historico = new Lista<>();
        Room room = new Room(id, type, level, true,historico);
        return room;
    }
    
    
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