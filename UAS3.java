import java.util.Scanner;

public class UAS3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna memasukkan nilai n
            System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
            int n = scanner.nextInt();

            // Memanggil metode untuk menampilkan deret Fibonacci hingga suku ke-n
            printFibonacciSeries(n);
        }
    }

    public static void printFibonacciSeries(int n) {
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Deret Fibonacci hingga suku ke-" + n + ": ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
