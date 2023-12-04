import java.util.Scanner;

public class UAS1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input harga barang
            System.out.print("Masukkan harga barang: ");
            double hargaBarang = input.nextDouble();

            // Input jumlah pembelian
            System.out.print("Masukkan jumlah pembelian: ");
            int jumlahPembelian = input.nextInt();

            // Hitung total harga dengan diskon
            double totalHarga = hitungTotalHarga(hargaBarang, jumlahPembelian);

            // Menampilkan total harga setelah diskon
            System.out.println("Total harga setelah diskon: Rp " + totalHarga);
        }
    }

    // Metode untuk menghitung total harga dengan diskon
    public static double hitungTotalHarga(double hargaBarang, int jumlahPembelian) {
        double totalHarga = hargaBarang * jumlahPembelian;
        double diskon = 0.0;

        // Berikan diskon sesuai jumlah pembelian
        if (jumlahPembelian >= 5 && jumlahPembelian <= 10) {
            diskon = 0.05 * totalHarga; // Diskon 5%
        } else if (jumlahPembelian >= 11 && jumlahPembelian <= 20) {
            diskon = 0.1 * totalHarga; // Diskon 10%
        } else if (jumlahPembelian > 20) {
            diskon = 0.2 * totalHarga; // Diskon 20%
        }

        // Hitung total harga setelah diskon
        totalHarga -= diskon;

        // Menampilkan informasi diskon
        if (diskon > 0.0) {
            double persentaseDiskon = (diskon / (hargaBarang * jumlahPembelian - diskon)) * 100;
            System.out.println("Diskon yang diberikan: " + persentaseDiskon + "%");
        } else {
            System.out.println("Tidak ada diskon yang diberikan.");
        }

        return totalHarga;
    }
}
