import java.util.Stack;

public class UAS9 {

    // Metode untuk memeriksa keseimbangan kurung
    public static boolean periksaKeseimbanganKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        // Iterasi melalui setiap karakter dalam ekspresi
        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            // Jika karakter adalah kurung buka, push ke stack
            if (karakter == '(' || karakter == '[' || karakter == '{') {
                stack.push(karakter);
            }
            // Jika karakter adalah kurung tutup, periksa dengan stack
            else if (karakter == ')' || karakter == ']' || karakter == '}') {
                // Jika stack kosong, atau kurung tidak sesuai, ekspresi tidak seimbang
                if (stack.isEmpty() || !sesuaiKurung(stack.pop(), karakter)) {
                    return false;
                }
            }
        }

        // Jika stack kosong setelah iterasi, ekspresi seimbang
        return stack.isEmpty();
    }

    // Metode untuk memeriksa apakah dua kurung sesuai
    private static boolean sesuaiKurung(char kurungBuka, char kurungTutup) {
        return (kurungBuka == '(' && kurungTutup == ')') ||
               (kurungBuka == '[' && kurungTutup == ']') ||
               (kurungBuka == '{' && kurungTutup == '}');
    }

    public static void main(String[] args) {
        // Contoh ekspresi matematika
        String ekspresi1 = "(a + b) * (c - d)";
        String ekspresi2 = "{[a + b] * (c - d)}";
        String ekspresi3 = "((a + b) * (c - d)";

        // Memeriksa keseimbangan kurung
        System.out.println("Ekspresi 1 seimbang: " + periksaKeseimbanganKurung(ekspresi1));
        System.out.println("Ekspresi 2 seimbang: " + periksaKeseimbanganKurung(ekspresi2));
        System.out.println("Ekspresi 3 seimbang: " + periksaKeseimbanganKurung(ekspresi3));
    }
}
