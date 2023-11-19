/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author WINDOWS 10
 */
public class Persegi extends BangunDatar implements Keliling, simetri{
    public int sisi;

    @Override
    public double hitungluas() {
        return this.sisi * this.sisi;
    }

    @Override
    public double hitungkeliling() {
        return this.sisi * 4;
    }

    @Override
    public double hitungSimPutar() {
        return 4*0;
    }

    @Override
    public double hitungSimLipat() {
        return 4*0;
    }
    
     @Override
    public void tampilhasil() {
         System.out.println("Persegi");
         System.out.println("Luasnya : " + this.hitungluas());
         System.out.println("Kelilingnya : " + this.hitungkeliling());
         System.out.println("Simetri Lipat : " + this.hitungSimLipat());
         System.out.println("Simetri Putar : " + this.hitungSimPutar());
         
    }
}
