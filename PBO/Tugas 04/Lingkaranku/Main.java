
package com.mycompany.lingkaranku;

/**
 *
 * @author Geroot
 */
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        Lingkaran Lingkaran = new Lingkaran();
        
        System.out.println("-- Program sederhana Lingkaran --");
        System.out.print("-- Masukan panjang Jari-Jari = ");
        double jari = input.nextDouble();
        
        // menampilkan luas lingkaran
        Lingkaran.LuasLingkaran(jari);
        
        // menampilkan keliling lingkaran 
        Lingkaran.KelilingLingkaran(jari);
        
        // menampilkan diameter lingkaran
        System.out.println("-- Diameter lingkaran = "+Lingkaran.DiameterLingkaran());
    }
}
