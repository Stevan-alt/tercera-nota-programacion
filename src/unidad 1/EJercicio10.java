import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPreguntas, correctas;
        double porcentaje;

        System.out.print("Cantidad total de preguntas: ");
        totalPreguntas = sc.nextInt();

        System.out.print("Cantidad de respuestas correctas: ");
        correctas = sc.nextInt();

        porcentaje = (correctas * 100.0) / totalPreguntas;

        if (porcentaje >= 90) {
            System.out.println("Nivel máximo");
        } else if (porcentaje >= 75) {
            System.out.println("Nivel medio");
        } else if (porcentaje >= 50) {
            System.out.println("Nivel regular");
        } else {
            System.out.println("Fuera de nivel");
        }

        sc.close();
    }
}
