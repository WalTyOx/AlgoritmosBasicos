import clases.Algoritmos;

public class Aplicacion {

    public static void main(String [] args) {
        System.out.println("¿Es Par?");
        System.out.println(Algoritmos.esPar(11));
        System.out.println("¿Es Primo?");
        System.out.println(Algoritmos.esPrimo(1));
        System.out.println("reversa");
        System.out.println(Algoritmos.stringEnReversa("perro"));
        System.out.println("¿Es Palindromo?");
        System.out.println(Algoritmos.esPalindromo("perro"));
        System.out.println("Secuencia FizzBuzz");
        int numeroPrueba = 15;
        Algoritmos.secuenciaFizzBuzz(numeroPrueba);
    }
}