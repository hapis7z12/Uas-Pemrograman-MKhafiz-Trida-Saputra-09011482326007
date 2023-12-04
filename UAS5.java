import java.util.Scanner;

public class UAS5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input dua bilangan
            System.out.print("Masukkan bilangan pertama: ");
            double bilangan1 = scanner.nextDouble();

            System.out.print("Masukkan bilangan kedua: ");
            double bilangan2 = scanner.nextDouble();

            // Operasi dan tampilkan hasilnya
            System.out.println("Hasil penjumlahan: " + tambah(bilangan1, bilangan2));
            System.out.println("Hasil pengurangan: " + kurang(bilangan1, bilangan2));
            System.out.println("Hasil perkalian: " + kali(bilangan1, bilangan2));
            System.out.println("Hasil pembagian: " + bagi(bilangan1, bilangan2));
        }
    }

    // Metode untuk operasi penjumlahan
    private static double tambah(double a, double b) {
        return a + b;
    }

    // Metode untuk operasi pengurangan
    private static double kurang(double a, double b) {
        return a - b;
    }

    // Metode untuk operasi perkalian
    private static double kali(double a, double b) {
        return a * b;
    }

    // Metode untuk operasi pembagian
    private static double bagi(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
            return Double.NaN; // NaN (Not a Number) sebagai nilai tidak terdefinisi
        }
    }
}