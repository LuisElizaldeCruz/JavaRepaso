package patternsDesign.singleton;

public class ConexionBDSingleton {
    private static ConexionBDSingleton instancia;
    private ConexionBDSingleton() {//declarando el constructor como privado se evita llamar multiples veces
        System.out.println("Conectandose a un motor de base de datos");
    }

    public static ConexionBDSingleton  getInstancia() {
        if (instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}
