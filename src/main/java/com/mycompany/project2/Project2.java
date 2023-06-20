/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

/**
 *
 * @author carre
 */
public class Project2 {

    public static void main(String[] args) {
    String str = "Hola";
    int[] ascii = new int[str.length()];
    for (int i = 0; i < str.length(); i++){
        ascii[i] = (int)str.charAt(i);
    }
    for(int i = 0; i < ascii.length;i++){
        System.out.println(ascii[i]);
    }
}
}
