package projects.calculadoraIVA;

import java.util.Scanner;

public class precioRender {
    public static void main(String[] args) {
        double precioPorMinuto = 0.05f;
        double cantMinutos;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la cantidad de minutos a grabar");
        cantMinutos = teclado.nextDouble();

        double precioFinal = precioPorMinuto * cantMinutos;
        System.out.println("Precio final: " + precioFinal);
    }
}
