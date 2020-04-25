package praktikum05;

import java.util.Scanner;
public class BukuNilai {
     private String namaMatkul;
     
     public BukuNilai(String nama) {
         namaMatkul = nama;     
     }

     public void setnamaMatkul(String nama) {
       namaMatkul=nama;
     }

     public String getnamaMatkul() {
         return namaMatkul;
     }

     public void tampilpesan() {
         System.out.printf("Selamat Datang Di Buku Nilai \n%s \n \n", getnamaMatkul());
     }

     public void tentRataKelas() {

         Scanner in = new Scanner(System.in);

         int total,kounternilai,nilai,ratarata;
		 
       	 int nomor = 0;
         total = 0;
         kounternilai = 1;

         while (kounternilai <= 10) {
             nomor = nomor + 1;
             System.out.print(nomor +". Masukkan Nilai: ");
             nilai= in .nextInt();
             total=total+nilai;
             kounternilai=kounternilai+1;
         }      
         ratarata =total/10 ;
         System.out.printf("\n Total dari 10 nilai adalah %d \n", total);
         System.out.printf("Rata - rata Nilai Kelas Adalah %d \n", ratarata);

    } 
}
