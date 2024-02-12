package projects.calculadoraIVA;

import java.util.Scanner;

public class PrecioIva {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double iva = 21;
        double precio = 0;
        double totalADescontar = 0;
        double precioFinal = 0;

        System.out.println("introduzca el precio del producto ");
        precio = teclado.nextDouble();

        totalADescontar = iva * precio / 100;
        precioFinal = precio - totalADescontar;

        System.out.println("precio final: $" + precioFinal);

    }
}
