import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingrese el nombre del cliente");
        String nombre = sc.nextLine();
        System.out.println("ingrese el  valor de la compra");
        double valorCompra = sc.nextDouble();
        if (valorCompra < 0) {
            System.out.println("error:el valor ingresado no es válido");
        sc.close();
            return;
        }
        double descuento = 0;
        double porcentaje = 0; 
        if (valorCompra < 50000) {
            porcentaje = 0;
        } else if (valorCompra < 100000) {
            porcentaje = 5;
        } else if (valorCompra < 200000) {
            porcentaje = 10;
        } else {
            porcentaje = 15;
            }
        descuento = valorCompra * (porcentaje / 100);
        double valorFinal = valorCompra - descuento;
        System.out.println("n---RESULTADO ---");
        System.out.println("cliente= " + nombre);
        System.out.println("valor original= " + valorCompra);
        System.out.println("Descuento aplicado=" + porcentaje + "%");
        System.out.println("valor descontado=" + descuento);
        System.out.println("valor final a pagar=" + valorFinal);
     sc.close();
    
    }
}
