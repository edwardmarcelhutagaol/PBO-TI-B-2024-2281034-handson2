package binaryoperator;

    public class perbandingan {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        boolean hasilSamaDengan = (a==b);
        System.out.println("a==b : " + hasilSamaDengan);

        boolean hasilTidakSamaDengan = (a!=b);
        System.out.println("a!=b : " + hasilTidakSamaDengan);

        boolean hasilLebihBesarDari = (a>b);
        System.out.println("a>b : " + hasilLebihBesarDari);

        boolean hasilLebihKecilDari = (a<b);
        System.out.println("a<b : " + hasilLebihKecilDari);

        boolean hasilLebihBesarSamaDengan = (a>=b);
        System.out.println("a>=b : " + hasilLebihBesarDari);

        boolean hasilLebihKecilSamaDengan = (a<=b);
        System.out.println("a<=b : " + hasilLebihKecilDari);
    }
}