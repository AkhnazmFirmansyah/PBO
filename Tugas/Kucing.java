/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Acer
 */
class Kucing extends Hewan{
    String warnabulu;
    
    @Override
    public void tampilkaninfo() {
        super.tampilkaninfo();
        System.out.println("Warna Bulu: " + warnabulu);
    }
}
