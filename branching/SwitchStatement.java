package branching;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("amsukan nomor hari 1-7 :");
        int nomorHari = input.nextInt();
        String namaHari = "";

        switch(nomorHari){
            case 1:
                namaHari = "minggu";
                break;

            case 2:
                namaHari = "senin";
                break;

            case 3:
                namaHari = "selasa";
                break;

            case 4:
                namaHari = "rabu";
                break;

            case 5:
                namaHari = "kamis";
                break;

            case 6:
                namaHari = "jumat";
                break;

            case 7:
                namaHari = "sabtu";
                break;

            default:
                System.out.println("Nomor yang anda tujui tidak dapat di hubungi");
                System.exit(0);

        }
        System.out.println("nama hari : " + namaHari);
    }
}
