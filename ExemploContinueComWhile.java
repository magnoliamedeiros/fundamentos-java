public class ExemploContinueComWhile {
    public static void main(String[] args) {

        // inicialização
        int numero = 0;

        // condição
        while (numero <= 10) {

            if (numero == 6) {
                System.out.println("Chegou no 6, e agora?");
                continue;
            }

            // com o 'continue' será ignorado as instruções abaixo e entra num looping.
            System.out.println("O numero = " + numero);
            // incremento    
            numero++;
        }
    }
}