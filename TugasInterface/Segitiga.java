/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author WINDOWS 10
 */
public class Segitiga extends BangunDatar{
    public int alas;
    public int tinggi;
    

    @Override
    public double hitungluas() {
        return this.alas * this.tinggi / 2.0;    }

    @Override
    public void tampilhasil() {
        System.out.println("\nSegitiga");
        System.out.println("Luasnya : " + this.hitungluas());    }
}
