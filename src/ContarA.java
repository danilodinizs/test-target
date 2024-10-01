import java.util.Scanner;

public class ContarA {
    public static void verificarA(String texto) {
        int quantidade = 0;
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'A') {
                quantidade++;
            }
        }
        if (quantidade > 0) {
            System.out.println("A letra 'a' ocorre " + quantidade + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não ocorre na string.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String texto = scanner.nextLine();

        verificarA(texto);
        scanner.close();
    }
}
