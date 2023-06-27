/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import classes.FileManager;
import GUI.Principal;
import classes.ABB;
import classes.Lista;
import classes.User;
import classes.Room;
import classes.GuiLogic;

/**
 *
 * @author carre
 */
public class Project2 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        
        Room[] rooms = fileManager.readRooms();   
        Lista<User> reservationsUsers = fileManager.readReservations();
        
        System.out.println(reservationsUsers.accessElement(0).getDni());
        System.out.println(rooms[149].getId());
        GuiLogic logic = new GuiLogic();
        ABB arbolito = logic.Rooms1(rooms);
        arbolito.printInOrder();
        Principal gui = new Principal();
        gui.setVisible(false);
    }
}
