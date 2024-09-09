package latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        int[] bilangan = new int[3];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < bilangan.length; i++){
            System.out.print("Masukan Bilangan Ke - " + (i+1) + " : ");
            bilangan[i] = input.nextInt();
        }

        int bilanganTerbesar = bilangan[0];

        for(int i = 1; i < bilangan.length; i++){
            if(bilanganTerbesar < bilangan[i]){
                bilanganTerbesar = bilangan[i];
            }
        }
        System.out.println("bilangan terbesar adalah : " + bilanganTerbesar);
    }
}