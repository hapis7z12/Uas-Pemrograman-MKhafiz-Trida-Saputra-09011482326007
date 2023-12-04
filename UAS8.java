class AkunPengguna {
    private String username;
    private boolean aktif;

    public AkunPengguna(String username, String password) {
        this.username = username;
        this.aktif = false; // Awalnya akun nonaktif
    }

    public void tampilkanInformasi() {
        System.out.println("Username: " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
        System.out.println();
    }

    public void aktifkanAkun() {
        if (!aktif) {
            aktif = true;
            System.out.println("Akun berhasil diaktifkan.");
        } else {
            System.out.println("Akun sudah aktif.");
        }
    }

    public void nonaktifkanAkun() {
        if (aktif) {
            aktif = false;
            System.out.println("Akun berhasil dinonaktifkan.");
        } else {
            System.out.println("Akun sudah nonaktif.");
        }
    }

    // Getter untuk mendapatkan status akun
    public boolean isAktif() {
        return aktif;
    }
}

public class UAS8 {
    public static void main(String[] args) {
        // Membuat objek akun
        AkunPengguna akun1 = new AkunPengguna("M Khafiz Trida S", "pass123");
        AkunPengguna akun2 = new AkunPengguna("Hapis", "pass456");

        // Menampilkan informasi akun sebelum diaktifkan
        System.out.println("Informasi Akun Sebelum Diaktifkan:");
        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();

        // Mengaktifkan akun
        akun1.aktifkanAkun();
        akun2.aktifkanAkun();

        // Menampilkan informasi akun setelah diaktifkan
        System.out.println("Informasi Akun Setelah Diaktifkan:");
        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();

        // Menonaktifkan akun
        akun1.nonaktifkanAkun();
        akun2.nonaktifkanAkun();

        // Menampilkan informasi akun setelah dinonaktifkan
        System.out.println("Informasi Akun Setelah Dinonaktifkan:");
        akun1.tampilkanInformasi();
        akun2.tampilkanInformasi();
        
        // Contoh penggunaan getter untuk mendapatkan status akun
        boolean statusAkun1 = akun1.isAktif();
        boolean statusAkun2 = akun2.isAktif();
        System.out.println("Status Akun 1: " + (statusAkun1 ? "Aktif" : "Nonaktif"));
        System.out.println("Status Akun 2: " + (statusAkun2 ? "Aktif" : "Nonaktif"));
    }
}
