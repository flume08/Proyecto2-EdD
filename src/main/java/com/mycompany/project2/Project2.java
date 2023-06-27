/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import classes.FileManager;
import GUI.Principal;

/**
 *
 * @author carre
 */
public class Project2 {
    public static void main(String[] args) {
        
        FileManager fileManager = new FileManager();
        fileManager.readCSV(FileManager.ESTADOPATH);
        Principal gui = new Principal();
        gui.setVisible(true);

}}
