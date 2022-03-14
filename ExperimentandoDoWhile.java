public class ExperimentandoDoWhile {
    public static void main (String[] args) {

        int numero = 0;

        // Executa pelo menos 1 vez
        do {
            System.out.println("O valor do numero = " + numero);

            // modificando a variável que faz parte da condição
            numero = numero + 1;
        } while (numero <= 10);

        System.out.println("Fim do codigo...");

    }
}