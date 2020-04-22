//Geroot
pekage Geroot;
import java.util.Scanner;
public class Main {
  
  public static void main(String[] args) {
        
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Code nama matakuliah dan nama dosen");
    	System.out.println("=====================================================================");
    	//Menciptakan suatu objek dan menetapkan isi (matakulian dan dosen) construtor
    	Input panggilcons=new Input("PBO","Iin");{
    	System.out.println("Mata Kuliah  :" + panggilcons.matakuliah);
    	System.out.println("Nama Dosen   :" + panggilcons.namadosen);       
      	System.out.println("=====================================================================");
        
        System.out.println("masukan kode Mata Kuliah dan nama Dosen");
        System.out.println("=====================================================================");
        //Mengimput nilai dan mengantikan isi variabel yang di tetapkan matakuliah
        System.out.print("-- Masukan Mata Kuliah  = ");
        String matakuliah = input.nextLine();
        panggilcons.setmataKuliah (matakuliah);//menetapkan isi matakuliah dengan yg di inputkan
        
        //Mengimput nilai dan mengantikan isi variabel yang di tetapkan matakuliah
        System.out.print("-- Masukan Nama Dosen = ");
        String namadosen = input.nextLine();
        panggilcons.setNamadosen (namadosen);//menetapkan isi namadose dengan yg di inputkan
        System.out.println("=====================================================================");
        
        System.out.println("Hasil Code mata kuliah dan nama dosen yang di masukan");
        System.out.println("=====================================================================");
        //memanggil dan Menampilkan isi tampil pesan
      	panggilcons.tampilpesan();
        System.out.println("=====================================================================");
    }
  } 
  
}
