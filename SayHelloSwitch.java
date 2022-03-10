import java.util.Scanner;

public class SayHelloSwitch {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        String idioma;

        System.out.println("Digite o idioma desejado: ");
        idioma = teclado.nextLine();

        switch (idioma) {
            case "br":
            case "Br":
            case "BR":
            case "pt-br":
            case "Pt-Br":
            case "PT-BR":
                System.out.println("Ola mundo!");
                break;
            case "ing":
            case "Ing":
            case "ING":
            case "eng":
            case "Eng":
            case "ENG":
            case "us":
            case "Us":
            case "US":
                System.out.println("Hello World!");
                break;
            case "it":
            case "It":
            case "IT":
                System.out.println("Ciao Mondo!");
            default:
                System.out.println("Nao sei falar...");
        }

        teclado.close();
    }
}