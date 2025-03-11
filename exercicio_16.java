import java.util.Scanner;

public class exercicio_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos cigarros você fuma por dia? ");
        int cigarrosPorDia = scanner.nextInt();

        System.out.print("Quantos anos você já fumou? ");
        int anosFumando = scanner.nextInt();

        int minutosPorCigarro = 10;
        int minutosPerdidosPorDia = cigarrosPorDia * minutosPorCigarro;
        int diasFumando = anosFumando * 365;
        int minutosPerdidosTotais = minutosPerdidosPorDia * diasFumando;
        int diasPerdidos = minutosPerdidosTotais / (60 * 24);

        System.out.println("Você perderá aproximadamente " + diasPerdidos + " dias de vida.");

        scanner.close();
    }
}