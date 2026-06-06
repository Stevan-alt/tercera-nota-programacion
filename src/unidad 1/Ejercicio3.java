import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1, num2;

        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Diferencia: " + (num1 - num2));
        } else {
            System.out.println("Producto: " + (num1 * num2));
            System.out.println("División: " + (num1 / num2));
        }

        sc.close();
    }
}