import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 10;

        String[] nombres = new String[MAX];
        double[] marca2024 = new double[MAX];
        double[] marca2025 = new double[MAX];
        double[] marca2026 = new double[MAX];

        int contador = 0;
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Inscribir participante");
            System.out.println("2. Mostrar listado por dorsal");
            System.out.println("3. Mostrar listado por marcas 2024");
            System.out.println("4. Finalizar programa");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {

                case 1:
                    if (contador >= MAX) {
                        System.out.println("No hay más plazas disponibles.");
                    } else {
                        System.out.print("Nombre: ");
                        nombres[contador] = sc.nextLine();

                        System.out.print("Mejor marca 2024: ");
                        marca2024[contador] = sc.nextDouble();

                        System.out.print("Mejor marca 2025: ");
                        marca2025[contador] = sc.nextDouble();

                        System.out.print("Mejor marca 2026: ");
                        marca2026[contador] = sc.nextDouble();
                        sc.nextLine(); // limpiar buffer

                        contador++;
                        System.out.println("Participante inscrito correctamente.");
                    }
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("No hay participantes.");
                    } else {
                        System.out.println("\nListado por dorsal:");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Dorsal: " + (i + 1) +
                                    " | Nombre: " + nombres[i] +
                                    " | 2024: " + marca2024[i] +
                                    " | 2025: " + marca2025[i] +
                                    " | 2026: " + marca2026[i]);
                        }
                    }
                    break;

                case 3:
                    if (contador == 0) {
                        System.out.println("No hay participantes.");
                    } else {

                    
                        String[] nombresCopia = new String[contador];
                        double[] marcasCopia = new double[contador];

                        for (int i = 0; i < contador; i++) {
                            nombresCopia[i] = nombres[i];
                            marcasCopia[i] = marca2024[i];
                        }

                        for (int i = 0; i < contador - 1; i++) {
                            for (int j = 0; j < contador - 1 - i; j++) {
                                if (marcasCopia[j] < marcasCopia[j + 1]) {

                                  
                                    double tempMarca = marcasCopia[j];
                                    marcasCopia[j] = marcasCopia[j + 1];
                                    marcasCopia[j + 1] = tempMarca;

                                  
                                    String tempNombre = nombresCopia[j];
                                    nombresCopia[j] = nombresCopia[j + 1];
                                    nombresCopia[j + 1] = tempNombre;
                                }
                            }
                        }

                        System.out.println("\nListado por marca 2024 (mayor a menor):");
                        for (int i = 0; i < contador; i++) {
                            System.out.println("Nombre: " + nombresCopia[i] +
                                               " | Marca 2024: " + marcasCopia[i]);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
    
