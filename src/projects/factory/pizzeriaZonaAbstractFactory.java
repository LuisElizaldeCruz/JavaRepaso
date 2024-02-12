package projects.factory;

abstract public class pizzeriaZonaAbstractFactory {
    public PizzaProducto ordenarPizza(String tipo){
        PizzaProducto  pizza  = crearPizza(tipo);
        System.out.println("---------Fabricando pizza " + pizza.getNombre() + "--------");
        pizza.preparar();
        pizza.empaquetar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }
    abstract PizzaProducto crearPizza(String tipo);
}
