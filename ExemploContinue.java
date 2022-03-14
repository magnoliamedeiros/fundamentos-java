public class ExemploContinue {
    public static void main(String[] args) {

        for (int numero = 0; numero <= 10; numero++) {

            // Quando chegar no 6 ignora e 'continua' a exibição dos demais números
            if (numero == 6) {
                System.out.println("Chegou no 6... e agora? vai ignorar o 6 e continuar o laço.");
                continue;
            }
            System.out.println("Numero fora o if = " + numero);
        }
    }
}