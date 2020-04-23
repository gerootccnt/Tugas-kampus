
package com.mycompany.getter_cons;

/**
 *
 * @author Geroot
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("-- Masukan Mata Kuliah  = ");
        String matakuliah = input.nextLine();
        System.out.print("-- Masukan Nama Dosen = ");
        String namadosen = input.nextLine();
        
        // membuat objek sekaligus memanggil constructon untuk mengisi value 
        Input panggil = new Input(matakuliah, namadosen);
        
        System.out.println("-- Selamat Datang");
        System.out.println(panggil.getMatakuliah());
        System.out.println("-- Penyusun");
        System.out.println(panggil.getNamadosen());
    }
}
