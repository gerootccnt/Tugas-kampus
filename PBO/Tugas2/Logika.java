package Geroot;
import java.util.Scanner;
class logika {
  public static void main(String[] args) {
    
    //System.out.println("Hello Codiva");
    Scanner masukan = new Scanner(System.in);
            int x=5; 
            int y=3;
            int z=1;
            boolean hasil;

            System.out.println("Contoh Operator Logika");
            System.out.println("x = 5, y = 3, z = 1 ");
            hasil = (x>y && x == 1);
            System.out.println("x>y && x == 1 : "+ hasil);
            hasil = (x>y || x > 5);
            System.out.println("x>y || x > 5 : "+ hasil);
            hasil = (!(z==1));
            System.out.println("!(z==1) : "+ hasil);

  }
}
