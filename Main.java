/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dell
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Suzuki", "Katana", 1990, "Putih");
        Mobil mobil2 = new Mobil("Chevrolet", "Camaro", 2010, "Kuning");
        
        mobil1.info();
        mobil1.startEngine();
        
        mobil2.info();
        mobil2.startEngine();
    }
}
