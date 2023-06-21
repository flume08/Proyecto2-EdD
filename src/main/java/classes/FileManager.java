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

/**
 *
 * @author kraik
 */
public class FileManager {
    
    String line = "";
      
    public void readCSV(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            
            while (br.readLine() != null) {
                line = br.readLine();
                String[] row = line.split(",");
                for(String data: row) {
                    System.out.println(data); // luego aqui convertir a clase y guardar en alguna EDD.
                    System.out.println("------------------------"); 
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
