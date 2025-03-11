import java.util.Scanner;

public class exercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        double desconto = preco * 0.05;
        double precoPromocional = preco - desconto;

        System.out.println("O preço promocional com 5% de desconto é: R$ " + precoPromocional);

        scanner.close();
    }
}