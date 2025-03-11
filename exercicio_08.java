import java.util.Scanner;

public class exercicio_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distância em metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;
        double milimetros = metros * 1000;

        System.out.println("Distância de " + centimetros + " Cm");
        System.out.println("Distância de " + milimetros + " Mm");

        scanner.close();
    }
}