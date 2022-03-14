public class ExemploBreak {
    public static void main(String[] args) {

        for (int numero = 0; numero <= 10; numero++) {
            System.out.println("Numero = " + numero);

            // Quando chegar no 6 ele 'para'
            if (numero == 6) {
                break;
            }
        }
    }
}