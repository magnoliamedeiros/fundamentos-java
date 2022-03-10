import java.util.Scanner;

public class TesteSwitch {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor: ");
        valor = teclado.nextInt();

        switch (valor) {
            case 1:
                System.out.println("Você digitou o valor 1...");
                break; // O break interrompe a propagação do 'match'
            case 2:
                System.out.println("Você digitou o valor 2...");
                break;
            case 3:
                System.out.println("Você digitou o valor 3...");
                break;
            default:
                System.out.println("Você digitou outro valor...");
                break;
        }

        teclado.close();
    }
}