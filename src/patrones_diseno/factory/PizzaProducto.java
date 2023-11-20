package patrones_diseno.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {
    protected String nombre, masa, salsa;
    protected List<String> ingredintes;

    public PizzaProducto() {
        this.ingredintes = new ArrayList<>();
    }

    public void preparar() {
        System.out.println("Preparando " + nombre);
        System.out.println("Seleccionando la masa " + masa);
        System.out.println("Agregando salsa " + salsa);
        this.ingredintes.forEach(System.out::println);
    }

    abstract public void cocinar();

    abstract public void cortar();

    public void empaquetar() {
        System.out.println("Pon la pizz a en una caja de empaque...");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredintes=" + ingredintes +
                '}';
    }
}
