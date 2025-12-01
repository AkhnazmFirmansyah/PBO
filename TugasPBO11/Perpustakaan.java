/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO11;

/**
 *
 * @author Acer
 */
class Perpustakaan {
    private Buku[] daftarBuku;
    private int index;

    public Perpustakaan(int kapasitas) {
        daftarBuku = new Buku[kapasitas];
        index = 0;
    }

    public void tambahBuku(Buku buku) {
        if (index < daftarBuku.length) {
            daftarBuku[index] = buku;
            index++;
            System.out.println("Buku berhasil ditambahkan!");
        } else {
            System.out.println("Perpustakaan penuh!");
        }
    }

    public void tampilkanSemuaBuku() {
        System.out.println("\n=== Daftar Buku di Perpustakaan ===");
        for (int i = 0; i < index; i++) {
            daftarBuku[i].infoBuku();
        }
    }
}
