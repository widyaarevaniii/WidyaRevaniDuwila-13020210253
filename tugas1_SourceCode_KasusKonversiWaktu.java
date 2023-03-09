/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversiwaktu;

/**
 * Nama : Widya Revani Duwila
 *  NIM : 13020210253
 * Hari/Tggl : Jum'at/03-03-2023
 * 
 */
//penjelasan program :
//program dibawah ini adalah sebuah program java yang melakukan konversi waktu
//dari jjam,menit dan detik dengan format jam:menit:detik.
//program ini terdiri dari satu class yaitu KonversiWaktu.
//program ini menggunakan class scanner yang terdapat pada package 'java.util' untuk meminta masukkan dari detik dari pengguna.
//program ini menampilakn hasil konversi waktu dalam format jam:menit:detik denagan mengguakan class 'system.out'

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        //'input' objek dari kelas scanner yang digunakan untuk membaca masukkan dari pengguna
        Scanner input = new Scanner(System.in);

        // varibel 'totalDetik' untuk Meminta masukan detik dari pengguna
        System.out.print("Masukkan jumlah detik: ");
        long totalDetik = input.nextLong();

        // variabel 'detikSaatIni' untuk Menghitung detik saat ini
        long detikSaatIni = totalDetik % 60;

        // Menghitung total menit
        long totalMenit = totalDetik / 60;

        // Menghitung menit saat ini
        long menitSaatIni = totalMenit % 60;

        // Menghitung total jam
        long totalJam = totalMenit / 60;

        // Menghitung jam saat ini
        long jamSaatIni = totalJam % 24;

        // Menampilkan hasil konversi waktu dalam format jam:menit:detik
        System.out.println("Waktu dalam format jam:menit:detik adalah "
                + jamSaatIni + ":" + menitSaatIni + ":" + detikSaatIni);
    }
}
 //program diatas menggunakan tipe data long untuk memastikan bahwa varibael dapat menamoung nila yang besar 
//karena program tersebut menangani konversi waktu yang melibatkan nilai yang cukup besar seperti,
//jumlah detik yang mungking mencapai puluuhan atau baahkan ratusan ribu.