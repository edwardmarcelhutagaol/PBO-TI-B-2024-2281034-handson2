package latihan;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        Scanner input = new Scanner(System.in);
        System.out.print("masukan Bilangan Pertama : ");
        bilangan[0] = input.nextInt();
        System.out.print("masukan Bilangan kedua : ");
        bilangan[1] = input.nextInt();

        if (bilangan[0] > bilangan[1]) {
            System.out.println("Bilangan Terbesar adalah :" + bilangan[0]);
        } else {
            System.out.println("bilangan terbesar adalah :" + bilangan[1]);
        }
    }
}