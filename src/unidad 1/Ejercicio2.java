import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new
        Scanner(System.in);
        double[] ventas = new double[7];
        double suma= 0;
        double mayor= 0;
        double menor= 0;
        int contadorMayor100 = 0;
        int contadorMenor50 = 0;
        for (int i = 0; i < 7; i++) {
            double venta = ventas[i];
            System.out.println("ingrese la venta del día " + (i + 1) + "= ");
            ventas[i] = sc.nextDouble();
            venta = ventas[i];
            suma += venta;
            if (venta > mayor) { mayor=venta;
            }
            if (venta<menor) { menor=venta;
            }
            if (venta >100000) { contadorMayor100++;
            }
            if (venta <50000) {contadorMenor50++;
            }
        }
double promedio = suma / 7;
for (int i = 0; i < ventas.length; i++) 
    {System.out.println("Dia " + (i+1) + ":"+ ventas[i]);
}
System.out.println("Venta mas alta: " + mayor);
System.out.println("Venta mas baja: " + menor);
System.out.println("Promedio: " + promedio);
System.out.println("Dias con ventas>100.000: " + contadorMayor100 );
System.out.println("Dias con ventas<50.000: " + contadorMenor50);
System.out.println("Total acumulado: " + suma);
sc.close();
    }
}