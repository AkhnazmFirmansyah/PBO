/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Leo";
        kucing.usia = 2;
        kucing.jenis = "Anggora";
        kucing.warnabulu = "Putih";
        kucing.tampilkaninfo();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Kupa";
        anjing.usia = 3;
        anjing.jenis = "Golden Retriever";
        anjing.ukuran = 60;
        anjing.tampilkaninfo();
    }
}
