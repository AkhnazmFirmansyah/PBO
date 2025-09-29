/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.tugas;

/**
 *
 * @author Acer
 */
public class Main {
    public static void main(String[] args) {
        // Inisialisasi Produk
        Produk buku1 = new Buku("One Piece", 100000.0, "Eichiro Oda");
        Produk elektronik1 = new Elektronik("Speaker", 300000.0, "JBL");
        Produk pakaian1 = new Pakaian("Hemtek", 120000.0, "M");
        
        // Buat Keranjang Belanja
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        // Tambahkan produk
        keranjang.tambahProduk(buku1);
        keranjang.tambahProduk(elektronik1);
        keranjang.tambahProduk(pakaian1);
        
        System.out.println("\n--- Rincian Belanja ---"); // Tambahkan pemisah
        
        for (Produk produk : keranjang.getDaftarProduk()) {
            double diskon = produk.hitungDiskon();
            double hargaAkhir = produk.getHargaDiskon();
            
            // Perbaikan Baris 27 (sekarang 26) - Menggunakan printf untuk formatting
            // Menggabungkan string dan double
            // Catatan: Baris ini terlihat seperti Anda ingin mencetak:
            // "- Nama Produk (Harga Awal: Rp xxx.xx)"
            System.out.printf("- %s (Harga Awal: Rp %.2f)%n", produk.getNama(), produk.getHarga());
            
            // Perbaikan Baris 28 (sekarang 27) - Menggunakan printf
            System.out.printf("   Diskon: Rp %.2f%n", diskon);
            
            // Perbaikan Baris 29 (sekarang 28) - Menggunakan printf
            System.out.printf("   Harga Setelah Diskon: Rp %.2f%n", hargaAkhir);
        }
        
        double totalHarga = keranjang.hitungTotal();
        
        System.out.println("\n-----------------------");
        // Perbaikan Baris 33 (sekarang 33) - Menggunakan printf
        System.out.printf("Total Harga Keseluruhan: Rp %.2f%n", totalHarga);
        System.out.println("-----------------------");
    }
}
