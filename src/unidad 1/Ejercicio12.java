import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sueldo;
        int antiguedad;

        System.out.print("Ingrese sueldo: ");
        sueldo = sc.nextDouble();

        System.out.print("Ingrese años de antigüedad: ");
        antiguedad = sc.nextInt();

        if (sueldo < 500 && antiguedad >= 10) {
            sueldo += sueldo * 0.20;
        } else if (sueldo < 500) {
            sueldo += sueldo * 0.05;
        }

        System.out.println("Sueldo a pagar: " + sueldo);

        sc.close();
    }
}
