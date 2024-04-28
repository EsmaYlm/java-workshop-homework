//soru 1

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girilen sayı çifttir.");
        } else {
            System.out.println("Girilen sayı tektir.");
        }
    }
}
