import java.util.Scanner;

public class KelilingSegitigaSikuSiku {
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int sisi1;
    int sisi2;
    int sisi3;
    float keliling;

    System.out.println("- Hitung Keliling Segitiga Siku Siku -");
    System.out.print("Masukkan sisi1: ");
    sisi1 = input.nextInt();

    System.out.print("Masukkan sisi2: ");
    sisi2 = input.nextInt();

    System.out.print("Masukkan sisi3: ");
    sisi3 = input.nextInt();


    keliling = sisi1 + sisi2 + sisi3;

    System.out.println("keliling segitiga siku siku = " + keliling + "cm");
    input.close();
    }
}