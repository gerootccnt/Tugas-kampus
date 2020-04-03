package Geroot;
import java.util.Scanner;
class Layanglayang {
  public static void main(String[] args) {
    
    //System.out.println("Hello Codiva");
    Scanner masukan = new Scanner(System.in);
        int d1;
        int d2;
        double luas;
        System.out.println("Program menghiitung luas layang - layang");
        System.out.println("Masukan Diagonal 1 dari Layang - layang : ");
        d1= masukan.nextInt();
        System.out.println("Masukan Diagonal 2 dari Layang - layang : ");
        d2 = masukan.nextInt();
        luas = (d1+d2)*0.5;
        System.out.println("luas layang - layang adalah : "+luas);
  }
}
