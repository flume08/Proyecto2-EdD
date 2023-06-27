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
            while (reader.readLine() != null) {
                line = reader.readLine();
                String[] row = line.split(","); 
                User user = initializeReservas(row);
                reservationsUsers.addAtTheEndT(user);               
                System.out.println("------------------------");
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
        System.out.println(user.getDni());
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
        Room room = new Room(id, type, level, false);
        return room;
    };          
}
