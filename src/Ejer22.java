import java.util.Scanner;

/**
 * Created by Yosep on 07/11/2017.
 */
public class Ejer22 {

    public static void main(String[] args){

        int numero = 0;
        boolean primo = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i < numero; i++){

            if (numero%i == 0){

                primo = false;

            }

        }

        if (primo){

            System.out.println("El numero es primo");

        }else {

            System.out.println("El numero no es primo");

        }

    }

}
