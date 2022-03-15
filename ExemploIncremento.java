public class ExemploIncremento {
    public static void main(String[] args) {

        // Explicitar a diferença entre ++a e a++

        int a = 5;
        System.out.println("Valor original de 'a' = " + a);

        System.out.println("---> Testando pos incremento!");
        System.out.println("Aplicando o 'a++': " + a++); // equivale a -> System.out.println(a); a = a+1;
        System.out.println("Novo valor de 'a': " + a);

        // Volta o valor 'a' = 5
        a = 5;
        System.out.println("Valor original de 'a' = " + a);

        System.out.println("---> Testando pre incremento!");
        System.out.println("Aplicando o '++a': " + ++a); // equivale a -> a = a + 1; System.out.println(a);
        System.out.println("Novo valor de 'a': " + a);
    }
}