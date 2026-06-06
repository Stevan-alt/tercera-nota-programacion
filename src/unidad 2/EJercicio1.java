import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] vector_numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector_numeros.length; i++) {
            vector_numeros[i] = random.nextInt(10) + 1;
        }

        for (int i = 0; i < vector_numeros.length; i++) {
            int numero = vector_numeros[i];
            System.out.println("Número: " + numero +
                    " Cuadrado: " + (numero * numero) +
                    " Cubo: " + (numero * numero * numero));
        }
    }
}
