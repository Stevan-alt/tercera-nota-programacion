import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] vector = new int[10];
        int contador = 0;

        while (contador < vector.length) {

            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();

            if (numero < 0) {
                break;
            }

            vector[contador] = numero;
            contador++;
        }

        System.out.println("Elementos ingresados:");

        for (int i = 0; i < contador; i++) {
            System.out.println(vector[i]);
        }

        sc.close();
    }
}
