import java.util.Scanner;

public class UAS2 {

    public static void main(String[] args) {
        // Menentukan nilai username dan password yang diharapkan
        String usernameYangDiHarapkan = "hapis";
        String passwordYangDiHarapkan = "password123";

        try (// Meminta pengguna memasukkan username dan password
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan username: ");
            String usernameInput = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String passwordInput = scanner.nextLine();

            // Memeriksa apakah input pengguna sesuai dengan nilai yang diharapkan
            if (usernameInput.equals(usernameYangDiHarapkan) && passwordInput.equals(passwordYangDiHarapkan)) {
                System.out.println("Autentikasi Berhasil");
            } else {
                System.out.println("Autentikasi Gagal");
            }
        }
    }
}
