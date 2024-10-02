package clases;

/**
 * Algoritmos
 */
public class Algoritmos {

    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }

            }
        }
        {
            return true;
        }
    }

    public static String stringEnReversa(String texto) {

        String textoAlReves = "";

        for (int i = texto.length() - 1; i >= 0; i--) {

            textoAlReves = textoAlReves + texto.charAt(i);
        }
        return textoAlReves;
    }
    public static String esPalindromo(String texto){
        String textoAlReves = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            
            textoAlReves = textoAlReves + texto.charAt(i);
            
        }
        if (textoAlReves.equals(texto)) {
            return "Es Palindromo";
        }
        else{
            return "No es Palindromo";
        }

    }
    public static void secuenciaFizzBuzz(int numero){
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ");              
            } else if (i % 5 == 0){
                System.out.println("Buzz ");
            } else {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }
}
