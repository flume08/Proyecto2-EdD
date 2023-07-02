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
        
        User[] currentState = fileManager.readCurrentState();
        Room[] rooms = fileManager.readRooms();
        Lista<User> roomsHistoric = fileManager.readHistoric();
        Lista<User> reservationsUsers = fileManager.readReservations();
        GuiLogic logic = new GuiLogic();
        ABB arbolito = logic.Rooms1(rooms,roomsHistoric);
        arbolito.printInOrder();
        System.out.println(currentState[10].getName());
        System.out.println(roomsHistoric.accessElement(0).getEmail());

        
        Principal gui = new Principal();
        gui.setVisible(false);
    }
}
