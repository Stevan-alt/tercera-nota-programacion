import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, promedio;

        System.out.print("Ingrese nota 1: ");
        nota1 = sc.nextDouble();

        System.out.print("Ingrese nota 2: ");
        nota2 = sc.nextDouble();

        System.out.print("Ingrese nota 3: ");
        nota3 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 7) {
            System.out.println("Promocionado");
        }

        sc.close();
    }
}
