import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class aleatorios {
    static boolean resultado=false;
    public static void main(String[] args) {
        int numero;
        while (resultado!=true) {
            Scanner in = new Scanner(System.in);
            System.out.println("introduce un numero");
            numero = in.nextInt();
            generarAleatorio(numero);
        }
        System.out.println("Felicidades!!!");
    }

    public static void generarAleatorio(int n) {
        int nAleatorio = (int) (Math.random() * 10 + 1);
        System.out.println("el numero generado aleatorio es " + nAleatorio + " y el apostado es " + n + "\n");
        resultado = (nAleatorio == n) ? true : false;
    }
}