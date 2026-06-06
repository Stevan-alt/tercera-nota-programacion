import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, promedio;

        System.out.print("Nota 1: ");
        n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        n2 = sc.nextDouble();

        System.out.print("Nota 3: ");
        n3 = sc.nextDouble();

        promedio = (n1 + n2 + n3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
        } else if (promedio >= 4) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }

        sc.close();
    }
}
