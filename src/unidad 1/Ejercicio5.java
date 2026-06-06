import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un número entre 1 y 99: ");
        numero = sc.nextInt();

        if (numero < 10) {
            System.out.println("Tiene un dígito");
        } else {
            System.out.println("Tiene dos dígitos");
        }

        sc.close();
    }
}