/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bacadata;

/**
 * Nama : Widya Revanii Duwila
 * NIM : 13020210253
 * Hari/Tnggl : Senin/27-02-2023
 */
import java.util.Scanner;
/*contoh memebaca integer menggunakan class Scanner*/
public class BacaData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); Apa akibatnya ?*/
        System.out.print ("Nilai yang dibaca : "+ a);
    }
    
}
