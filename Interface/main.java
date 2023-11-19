/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        Phone Redmi3Pro = new Xiaomi();
        
        PhoneUser Libri = new PhoneUser(Redmi3Pro);
        
        Libri.turnOnThePhone();
        
        Scanner input = new Scanner(System.in);
        String aksi = null;
        
        while (true){
            System.out.println("=====APLIKASI INTERFACE=====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar Volume");
            System.out.println("[4] Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("Pilih Aksi");
            aksi = input.nextLine();
            if(aksi.equals("1")){
                Libri.turnOnThePhone();
            }else if(aksi.equals("2")){
                Libri.turnoffThePhone();
            }
            else if(aksi.equals("3")){
                Libri.makePhoneLouder();
            }
            else if(aksi.equals("4")){
                Libri.makePhoneSilent();
            }
            else if(aksi.equals("0")){
                System.exit(0);
            }
            else{
                System.out.println("SALAH WOYYY");
            }
        }
    }
}
