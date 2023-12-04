import java.util.Scanner;

public class UAS4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna memasukkan bilangan bulat positif
            System.out.print("Masukkan bilangan bulat positif: ");
            int bilangan = scanner.nextInt();

            // Memanggil metode untuk memfaktorisasi bilangan
            faktorisasiDanTampilkan(bilangan);
        }
    }

    public static void faktorisasiDanTampilkan(int bilangan) {
        System.out.print("Faktorisasi " + bilangan + ": ");

        // Memulai faktorisasi dengan faktor 2
        for (int faktor = 2; faktor <= bilangan; faktor++) {
            while (bilangan % faktor == 0) {
                System.out.print(faktor);

                // Jika faktor bukan faktor terakhir, tambahkan tanda "*"
                if (bilangan != faktor) {
                    System.out.print(" * ");
                }

                bilangan /= faktor;
            }
        }

        // Jika bilangan yang dimasukkan awalnya merupakan bilangan prima
        if (bilangan > 1) {
            System.out.print(bilangan);
        }

        System.out.println();
    }
}
