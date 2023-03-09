/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bacakar;

/**
 * Nama : Widya Revani Duwila
 * NIM  : 13020210253
 * Hari/Tnggl : Senin/27-02-2023
 */

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
//import javax.swing.*;
public class Bacakar {a
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /* Kamus */ 
        char cc; int bil;
        InputStreamReader isr = new 
        InputStreamReader(System.in); 
        BufferedReader dataIn = new BufferedReader(isr);
        // atau
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Algoritma */
        System.out.print ("hello\n");
        System.out.print("baca 1 karakter : ");
        
        //perintah baca karakter cc
        cc =dataIn.readLine().charAt(0); 
        System.out.print("baca 1 bilangan : ");
        
        //perintah baca bil
        bil =Integer.parseInt(datAIn.readLine());
        /*String kar = JOptionPane.showInputDialog("Karakter 1 : "); System.out.println(kar);*/
        
        //JOptionPane.showMessageDialog(null,"hello"); 
        System.out.print (cc +"\n" +bil+"\n"); 
        System.out.print ("bye \n");
        
        /* Tambahkan program membaca/input data
        menggunakan Class Scanner, Class Console dan Class 
        JOptionPane */
    }
    
}
