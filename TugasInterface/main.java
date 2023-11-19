/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.sisi = 4;
        persegi.tampilhasil();
        
        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 4;
        persegipanjang.lebar = 8;
        persegipanjang.tampilhasil();
        
        Segitiga segitiga = new Segitiga();
        segitiga.alas = 6;
        segitiga.tinggi = 8;
        segitiga.tampilhasil();
    }
}
