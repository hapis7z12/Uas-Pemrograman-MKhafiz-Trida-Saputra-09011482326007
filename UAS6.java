import java.util.Scanner;

public class UAS6 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna memasukkan kata atau frase
            System.out.print("Masukkan kata atau frase: ");
            String input = scanner.nextLine();

            // Memanggil metode untuk mengecek palindrom
            if (isPalindrom(input)) {
                System.out.println("Palindrom: Ya");
            } else {
                System.out.println("Palindrom: Tidak");
            }
        }
    }

    public static boolean isPalindrom(String str) {
        // Menghapus spasi dan mengubah ke huruf kecil agar tidak sensitif terhadap huruf besar atau kecil
        str = str.replaceAll("\\s", "").toLowerCase();

        int panjang = str.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (str.charAt(i) != str.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
