import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sueldo;

        System.out.print("Ingrese su sueldo: ");
        sueldo = sc.nextDouble();

        if (sueldo > 3000) {
            System.out.println("Debe abonar impuestos");
        }

        sc.close();
    }
}
