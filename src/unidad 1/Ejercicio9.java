import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número positivo: ");
        numero = sc.nextInt();

        if (numero >= 0 && numero < 10) {
            System.out.println("Tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println("Tiene 2 cifras");
        } else if (numero < 1000) {
            System.out.println("Tiene 3 cifras");
        } else {
            System.out.println("Error: tiene más de 3 cifras");
        }

        sc.close();
    }
}
