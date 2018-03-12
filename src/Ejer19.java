import java.util.Scanner;

/**
 * Created by Yosep on 07/11/2017.
 */
public class Ejer19 {

    public static void main(String[] args){

        int numero = 1;

        Scanner scanner = new Scanner(System.in);

        while (numero != 0){

            System.out.println("Introduce un numero");
            numero = Integer.parseInt(scanner.nextLine());

            if (numero > 0){

                System.out.println("El numero es positivo");

            }else if (numero < 0){

                System.out.println("El numero es negativo");

            }

        }

    }

}
