import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n;
        double sueldo;
        int entre100y300 = 0;
        int masDe300 = 0;
        double gastoTotal = 0;
        System.out.print("Ingrese la cantidad de empleados: ");
        n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el sueldo del empleado " + i + ": ");
            sueldo = teclado.nextDouble();
            gastoTotal += sueldo;
            if (sueldo >= 100 && sueldo <= 300) {
                entre100y300++;
            } else if (sueldo > 300) {
                masDe300++;
            }
        }
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Empleados que cobran entre $100 y $300: " + entre100y300);
        System.out.println("Empleados que cobran más de $300: " + masDe300);
        System.out.println("Gasto total en sueldos: $" + gastoTotal);

        teclado.close();
    }
}