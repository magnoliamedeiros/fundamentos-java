public class TabuadaDeUmaLinha {
    public static void main(String[] args) {
        for (int numero = (new java.util.Scanner(System.in)).nextInt(), cont=1; cont <= 10;
        System.out.println(numero + " x " + cont + " = " + numero * cont++));
    }
}