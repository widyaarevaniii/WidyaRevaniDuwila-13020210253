/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operator;

/**
 * Nama : Widya Revani Duwila
 * NIM : 13020210253
 * Hari/Tnggl : Senin/27-02-2023 
 */
/* Contoh pengoperasian variabel bertype dasar */
public class Operator {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        boolean Bool1, Bool2, TF ; 
        int i,j, hsl ;
        float x,y,res;
        
        /* algoritma */
        System.out.println("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
        Bool1 = true; Bool2 = false;
        TF = Bool1 && Bool2 ; /* Boolean AND */ 
        TF = Bool1 || Bool2 ; /* Boolean OR */ 
        TF = ! Bool1 ; /* NOT */
        TF = Bool1 ^Bool2; /* XOR */
        
         /* operasi numerik */
         i = 5; j = 2 ;
        hsl = i+j; 
        hsl = i - j; 
        hsl = i / j; 
        hsl = i * j; 
        hsl = i /j ; /* pembagian bulat */
        hsl = i%j ; /* sisa modulo */
       /* Menampilkan hasil dari operasi Boolean */
        System.out.println("Hasil operasi boolean AND: " + (Bool1 && Bool2));
        System.out.println("Hasil operasi boolean OR: " + (Bool1 || Bool2));
        System.out.println("Hasil operasi boolean NOT: " + (!Bool1));
        System.out.println("Hasil operasi boolean XOR: " + (Bool1 ^ Bool2));
       /* Menampilkan hasil dari operasi  numerik */
        System.out.println("Hasil operasi numerik penjumlahan: " + (i+j));
        System.out.println("Hasil operasi numerik pengurangan: " + (i-j));
        System.out.println("Hasil operasi numerik pembagian: " + (i/j));
        System.out.println("Hasil operasi numerik perkalian: " + (i*j));
        System.out.println("Hasil operasi numerik pembagian bulat: " + (i/j));
        System.out.println("Sisa hasil operasi numerik modulo: " + (i%j));
        
        /* operasi numerik */ 
        x = 5 ; y = 5 ;
        res = x + y; 
        res = x - y; 
        res = x / y; 
        res = x * y;
        /* Menampilkan hasil dari operasi Boolean  */
        System.out.println("Hasil operasi boolean AND: " + (Bool1 && Bool2));
        System.out.println("Hasil operasi boolean OR: " + (Bool1 || Bool2));
        System.out.println("Hasil operasi boolean NOT: " + (!Bool1));
        System.out.println("Hasil operasi boolean XOR: " + (Bool1 ^ Bool2));
         /* Menampilkan hasil dari operasi  numerik */
        System.out.println("Hasil operasi numerik Penjumlahan: " + (x + y));
        System.out.println("Hasil operasi numerik Pengurangan: " + (x - y));
        System.out.println("Hasil operasi numerik Pembagian: " + (x / y));
        System.out.println("Hasil operasi numerik Perkalian: " + (x * y));
        
        /* operasi relasional numerik */
         TF = (i==j); 
         TF = (i!=j);
         TF = (i < j); 
         TF = (i > j); 
         TF = (i <= j); 
         TF = (i >= j);
        /*menampilkan operasi relasional numerik */
        System.out.println("Hasil dari i==j adalah " + (i==j));
        System.out.println("Hasil dari i!=j adalah " + (i!=j));
        System.out.println("Hasil dari i < j adalah " + (i < j));
        System.out.println("Hasil dari i > j adalah " + (i > j));
        System.out.println("Hasil dari i <= j adalah " + (i <= j));
        System.out.println("Hasil dari i >= j adalah " + (i >= j));
    
        /* operasi relasional numerik */ 
        TF = (x != y);
        TF = (x < y); 
        TF = (x > y); 
        TF = (x <= y); 
        TF = (x >= y);
      /*menampilkan operasi relasional numerik */
       System.out.println("Hasil dari x != y adalah " + (x != y));
       System.out.println("Hasil dari x != y adalah " + (x < y));
       System.out.println("Hasil dari x != y adalah " + (x > y));
       System.out.println("Hasil dari x != y adalah " + (x <= y));
       System.out.println("Hasil dari x != y adalah " + (x >= y));
    }
    
}
