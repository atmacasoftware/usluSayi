import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, sonuc = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı : ");
        sayi1 = input.nextInt();

        System.out.print("Üs olacak sayı : ");
        sayi2 = input.nextInt();

        if (sayi1 > 0 && sayi2 > 0) {
            for (int i = 1; i <= sayi2; i++) {
                sonuc *= sayi1;
            }

            System.out.println("Sonuç : " + sonuc);
        } else{
            System.out.println("Hatalı değer girdiniz.");
        }

    }
}