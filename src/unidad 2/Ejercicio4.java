import java.util.Arrays;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {

        int[] vector = new int[10];
        Random random = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }

        Arrays.sort(vector);

        System.out.println("Vector ordenado:");

        for (int numero : vector) {
            System.out.println(numero);
        }
    }
}
