/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import classes.FileManager;

/**
 *
 * @author carre
 */
public class Project2 {
    public static void main(String[] args) {
        
        String estadoPath = "database\\Estado.csv";
        String habitacionesPath = "database\\Habitaciones.csv";
        String historicoPath = "database\\Historico.csv";
        String reservasPath = "database\\Reservas.csv";
        
        FileManager fileManager = new FileManager();
        fileManager.readCSV(estadoPath);
}}
