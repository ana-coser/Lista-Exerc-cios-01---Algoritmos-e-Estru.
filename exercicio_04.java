import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite outro valor: ");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;

        System.out.println("A soma entre " + valor1 + " e " + valor2 + " é igual a " + soma + ".");

        scanner.close();
    }
}