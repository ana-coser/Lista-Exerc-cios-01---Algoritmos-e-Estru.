import java.util.Scanner;

public class exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do funcionário: R$ ");
        double salario = scanner.nextDouble();

        double aumento = salario * 0.15;
        double novoSalario = salario + aumento;

        System.out.println("O novo salário com 15% de aumento é: R$ " + novoSalario);

        scanner.close();
    }
}