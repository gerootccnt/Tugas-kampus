//Geroot
pekage Geroot;
public class Input {
    
    public  String matakuliah;
    public  String namadosen;
    
    //ini Constructor
    public Input(String matakuliah, String namadosen)
    {
        this.matakuliah = matakuliah;
        this.namadosen = namadosen;
    }
  
	//Mathod untuk menetapkan nama Matakuliah
  	public void setmataKuliah (String nama){
   		matakuliah = nama ; //Menyimpan nama Matakuliah
   	}
  	
  	//Mathod untuk menetapkan NamaDosen
  	public void setNamadosen (String nama){
   		namadosen = nama ; //Menyimpan nama Dosen
    }
  	
  	//Method mengambil matakuliah
    public String getMatakuliah() {
        return matakuliah;
    }

  	//Method mengambil Nama Dosen
    public String getNamadosen() {
        return namadosen;
    }

  	//Menampilkan pesan Selamat Datang Kepada Input dari method matakuliah dan nama dosen
   	public void tampilpesan(){
      
    	//Mengambil getMatakuliah dan getNamadosen
       	System.out.printf("Selamat Datang Di Aplikasi Buku Nilai Matakuliah :\n%s!\n" ,getMatakuliah());
       	System.out.printf("Disusun Oleh                                     :\n%s!\n",getNamadosen  ());    
   	}//Akhir Metode tampil pesan
}
