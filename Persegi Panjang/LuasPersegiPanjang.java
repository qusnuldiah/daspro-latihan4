import java.util.Scanner;

public class LuasPersegiPanjang {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int panjang;
    int lebar;
    float luas;

    System.out.println("- Hitung Luas Persegi Panjang -");
    System.out.print("Masukkan panjang: ");
    panjang = input.nextInt();

    System.out.print("Masukkan lebar: ");
    lebar = input.nextInt();

    luas = 2 * (panjang * lebar);

    System.out.println("luas persegi panjang = " + luas + "cm");
    input.close();
    }
}