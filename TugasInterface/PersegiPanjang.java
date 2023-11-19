/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasInterface;

/**
 *
 * @author WINDOWS 10
 */
public class PersegiPanjang extends BangunDatar implements Keliling, simetri{
    public int panjang;
    public int lebar;

    @Override
    public double hitungluas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double hitungkeliling() {
        return 2 * (this.panjang + this.lebar);    }

    @Override
    public double hitungSimPutar() {
        return 2.0;
    }

    @Override
    public double hitungSimLipat() {
        return 2.0;
    }
    
      @Override
    public void tampilhasil() {
          System.out.println("\nPersegi Panjang");
          System.out.println("Luasnya : " + this.hitungluas());
          System.out.println("Kelilingnya : " + this.hitungkeliling());
          System.out.println("Simetri Lipat : " + this.hitungSimLipat() );
          System.out.println("Simetri Putar : " + this.hitungSimPutar());
    }
}
