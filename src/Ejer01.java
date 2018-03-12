import java.util.Scanner;

public class Ejer01 {

    public static void main(String args[]){

        int cateto1;
        int cateto2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del cateto");

        cateto1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese el valor del otro cateto");

        cateto2 = Integer.parseInt(scanner.nextLine());

        System.out.println("El valor del primer cateto es " + cateto1);

        System.out.println("El valor del segundo cateto es " + cateto2);

        double resultado;

        resultado = (cateto1 * 2) + (cateto1 * 2);

        resultado = Math.sqrt(resultado);

        System.out.println(resultado);

    }
}
