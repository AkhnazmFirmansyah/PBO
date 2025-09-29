/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.tugas;

/**
 *
 * @author Acer
 */
class Pakaian extends Produk {
    private String ukuran;
    
    public Pakaian(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }
    @Override
    public double hitungDiskon() {
        if (this.harga > 200000.0) {
            return this.harga * 0.15;
        } else{
            return this.harga * 0.05;
        }
    }
}
