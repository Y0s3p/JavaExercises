import java.util.Scanner;

/**
 * Created by Yosep on 09/11/2017.
 */
public class CuatroThirty {

    public static void main(String[] args){

        int random = (int)(Math.random() * 101);
        int numero;

        Scanner scanner = new Scanner(System.in);

        for (int i = 5; i > 0; i--){

            System.out.println("Ingrese un numero");
            numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Tienes " + (i - 1) + " intentos \n");

            if (numero < random){

                System.out.println("El numero " + numero + " es menor que el numero a adivinar \n");

            }else if (numero > random){

                System.out.println("El numero " + numero + " es mayor que el numero a adivinar \n");

            }else if (numero == random){

                System.out.println("Acertaste ! Has adivinado el numero \n");

            }

        }

    }

}
