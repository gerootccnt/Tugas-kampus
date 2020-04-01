
package Geroot;

import java.util.Scanner;


public class Input_Output {

   
    public static void main(String[] args) {
       
        //Membuat objek inputan dari kelas scanneer
        Scanner input = new Scanner(System.in);
        
        // output
        System.out.println("## APLIKASI UNTUK MENGINPUT DAN MENGOUTPUT JAVA ##");
        
        System.out.print("## Masukan NAMA anda = ");
        
        //membuat variabel untuk menyimpan inputan NIM dan memanggil objek input
        String namaanda = input.nextLine();
        
        System.out.print("## Masukan NIM anda = ");
        
        //membuat variabel untuk menyimpan inputan NAMA dan memanggil objek input
        String nim = input.nextLine();
        
        System.out.print("## Masukan tanggal lahir = ");
        
        //membuat variabel untuk menyimpan inputan tangga dan memanggil objek input
        String tgl_lahir = input.nextLine();
        
        System.out.print("## Masukan nama ayah = ");
        
        //membuat variabel untuk menyimpan inputan nama ayah dan memanggil objek input
        String namaayah = input.nextLine();
        
         System.out.print("## Masukan nama ibu = ");
    
           //membuat variabel untuk menyimpan inputan nama ibu dan memanggil objek input
        String namaibu = input.nextLine();
    
          System.out.println("## PENDIDIKAN :");
          System.out.println("- SD");
          System.out.println("- SMP");
          System.out.println("- SMA");
          System.out.print("## Ijasah terakhir = ");
          
           //membuat variabel untuk menyimpan inputan pendidikan dan memanggil objek input
        String pendidikan = input.nextLine();
        
       //menampilkan semua apa yang telah di input
        System.out.println("###########################");
        System.out.println("## Nim = " + nim);
        System.out.println("## Nama = " + namaanda);
        System.out.println("## Tanggal lahir  = "+ tgl_lahir);
        System.out.println("## Nama ayah  = " + namaayah );
        System.out.println("## Nama ibu = " + namaibu);
        System.out.println("## Pendidikan = " + pendidikan);
        System.out.println("###########################");  
    }
    
}
