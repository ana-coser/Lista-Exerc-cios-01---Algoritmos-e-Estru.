import java.util.Scanner;

public class exercicio_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto dinheiro você tem na carteira (em R$): ");
        double reais = scanner.nextDouble();

        double dolar = reais / 3.45;

        System.out.println("Com R$" + reais + " você pode comprar US$" + dolar);

        scanner.close();
    }
}