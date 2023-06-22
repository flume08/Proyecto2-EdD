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
      
    public void readCSV(String path) {   
        try {
            reader = new BufferedReader(new FileReader(path));
            while (reader.readLine() != null) {
                line = reader.readLine();
                String[] row = line.split(",");
                for(String data: row) {
                    System.out.println(data.strip()); // luego aqui convertir a clase y guardar en alguna EDD.                    
                }
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
    }   
}
