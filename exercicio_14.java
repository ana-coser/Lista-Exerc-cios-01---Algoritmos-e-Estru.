import java.util.Scanner;

public class exercicio_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias pelo qual o carro foi alugado: ");
        int dias = scanner.nextInt();

        System.out.print("Digite a quantidade de Km percorridos: ");
        double km = scanner.nextDouble();

        double precoPorDia = 90.00;
        double precoPorKm = 0.20;

        double total = (dias * precoPorDia) + (km * precoPorKm);

        System.out.println("O preço total a pagar é: R$ " + total);

        scanner.close();
    }
}


