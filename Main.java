/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasPBO12;

/**
 *
 * @author Acer
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    private static final String FILE_TEXT = "buku.txt";
    private static final String FILE_SERIAL = "buku.ser";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU BUKU ===");
            System.out.println("1. Tambah Buku Baru (Simpan ke buku.txt)");
            System.out.println("2. Serialisasi Objek Buku (Simpan ke buku.ser)");
            System.out.println("3. Tampilkan Daftar Buku dari buku.txt");
            System.out.println("4. Tampilkan Daftar Buku dari buku.ser");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    tambahBukuText(input);
                    break;
                case 2:
                    simpanSerial(input);
                    break;
                case 3:
                    tampilkanDariText();
                    break;
                case 4:
                    tampilkanDariSerial();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        input.close();
    }

 
    private static void tambahBukuText(Scanner input) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_TEXT, true))) {
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Pengarang: ");
            String pengarang = input.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();
            input.nextLine();

            writer.write(judul + ";" + pengarang + ";" + tahunTerbit);
            writer.newLine();
            System.out.println("Buku berhasil disimpan ke buku.txt!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 
    private static void simpanSerial(Scanner input) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_SERIAL))) {
            System.out.print("Judul: ");
            String judul = input.nextLine();
            System.out.print("Pengarang: ");
            String pengarang = input.nextLine();
            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();
            input.nextLine();

            Buku buku = new Buku(judul, pengarang, tahunTerbit);
            oos.writeObject(buku);

            System.out.println("Objek buku berhasil diserialisasi ke buku.ser!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

 
    private static void tampilkanDariText() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_TEXT))) {
            String line;
            System.out.println("\nDaftar Buku (File Text):");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(";");
                System.out.println("Judul: " + data[0] + ", Pengarang: " + data[1] + ", Tahun Terbit: " + data[2]);
            }
        } catch (IOException e) {
            System.out.println("Tidak ada data!");
        }
    }

    
    private static void tampilkanDariSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_SERIAL))) {
            Buku buku = (Buku) ois.readObject();
            System.out.println("\nData Buku dari Serialisasi:");
            System.out.println(buku);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak ada data serialisasi!");
        }
    }
}
