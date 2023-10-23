import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sir de caractere: ");
        String text = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < text.length(); i++) {
            char caracter = text.charAt(i);
            if (text.lastIndexOf(caracter) != i) {
                System.out.print("Caracterele duplicat: " + caracter);
            }
        }
    }
}
