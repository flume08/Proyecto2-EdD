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
import classes.TablaHash;

/**
 *
 * @author carre
 */
public class Project2 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        
        User[] currentState = fileManager.readCurrentState();
        Room[] rooms = fileManager.readRooms();
        for(int i = 0; i<currentState.length;i++){
            if(currentState[i]!=null){
            rooms[Integer.parseInt(currentState[i].getRoom())-1].setState(false);
        }}
        Lista<User> roomsHistoric = fileManager.readHistoric();
        Lista<User> reservationsUsers = fileManager.readReservations();
        GuiLogic logic = new GuiLogic();
        ABB arbolito = logic.Rooms1(rooms,roomsHistoric);
        logic.bubbleSort(reservationsUsers);
        TablaHash<User> tabla=logic.initializeHash(currentState);
        Principal gui = new Principal(currentState, rooms, roomsHistoric, reservationsUsers, arbolito, tabla);
        gui.setVisible(true);
    }
}
