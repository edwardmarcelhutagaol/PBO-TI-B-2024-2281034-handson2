package latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        int[] bilangan = new int[2];
        int total = 0;
        Scanner input = new Scanner(System.in);

        char operator;

        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukan Bilangan ke - " + (i + 1) + " : ");
            bilangan[i] = input.nextInt();
        }

        System.out.println("+ = penjumlahan \n- = pengurangan \n * = Perkalian \n / = Pembagian \n % = modulus");
        System.out.print("Masukan Tipe Operator : ");
        operator = input.next().charAt(0);

        switch (operator) {
            case '+':
                total = bilangan[0] + bilangan[1];
                break;

            case '-':
                total = bilangan[0] - bilangan[1];
                break;

            case '*':
                total = bilangan[0] * bilangan[1];
                break;

            case '/':
                total = bilangan[0] / bilangan[1];
                break;

            case '%':
                total = bilangan[0] % bilangan[1];
                break;

            default:
                System.out.println("Pilihan Anda Salah");
                System.exit(0);
        }

        System.out.println("total = " + total);

    }
}