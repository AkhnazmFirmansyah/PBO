/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        Pengarang p1 = new Pengarang("Tere Liye");
        Pengarang p2 = new Pengarang("Andrea Hirata");

        Buku b1 = new Buku("Hafalan Shalat Delisa", p1);
        Buku b2 = new Buku("Laskar Pelangi", p2);

        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);

        perpustakaan.tampilkanSemuaBuku();
    }
}

