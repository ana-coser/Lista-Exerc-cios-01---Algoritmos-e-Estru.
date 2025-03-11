import java.util.Scanner;

public class exercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de dias trabalhados no mês: ");
        int diasTrabalhados = scanner.nextInt();

        double salarioPorHora = 25.00;
        int horasPorDia = 8;

        double salarioTotal = diasTrabalhados * horasPorDia * salarioPorHora;

        System.out.println("O salário do funcionário é: R$ " + salarioTotal);

        scanner.close();
    }
}