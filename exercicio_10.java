import java.util.Scanner;

public class exercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a largura da parede (em metros): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da parede (em metros): ");
        double altura = scanner.nextDouble();

        double area = largura * altura;
        double tintaNecessaria = area / 2;

        System.out.println("A área a ser pintada é: " + area + " metros quadrados.");
        System.out.println("A quantidade de tinta necessária é: " + tintaNecessaria + " litros.");

        scanner.close();
    }
}