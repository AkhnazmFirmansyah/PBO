/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspraktikum3;

/**
 *
 * @author Acer
 */
public class Main {
   public static void main(String[] args) {
       // Membuat objek pekerja
       Pekerja pekerja1 = new Pekerja("Kamit", 25, "Kuli Proyek", 300000);
       
       // Menampilkan Informasi Pekerja
       System.out.println("Informasi Awal");
       System.out.println(pekerja1.toString());
       System.out.println();
       
       // Mengubah Nama Menggunakan Setter
       pekerja1.setNama("Kuproy");
       
       // Menampilkan Informasi Setelah Diubah
       System.out.println("Informasi Pekerja");
       System.out.println(pekerja1.toString());
       
       // Akses Langsung nama, usia, dan gaji
       System.out.println(pekerja1.nama);
       System.out.println(pekerja1.usia);
       System.out.println(pekerja1.gaji);
   } 
}
