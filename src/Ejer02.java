import java.util.Scanner;

/**
 * Created by Yosep on 18/10/2017.
 */
public class Ejer02 {

    public static void main(String args[]){

        int disenador;
        int fabricante;
        int unidad;
        int precio;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero de unidades vendidas");

        unidad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el precio del producto");

        precio = Integer.parseInt(scanner.nextLine());

        fabricante = unidad * precio;
        System.out.println("Los fabricante cobra " + fabricante);
        disenador = fabricante * 2;
        System.out.println("El diseñador cobra " + disenador);

    }

}
