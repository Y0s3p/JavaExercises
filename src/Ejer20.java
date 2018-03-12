import java.util.Scanner;

/**
 * Created by Yosep on 07/11/2017.
 */
public class Ejer20 {

    public static void main(String[] args){

        int numero = 1;
        int suma = 0;
        int contador = 0;
        int media;

        Scanner scanner = new Scanner(System.in);

        while (numero != 0){

            System.out.println("Introduce un numero");
            numero = Integer.parseInt(scanner.nextLine());

            suma = suma + numero;

            contador++;

        }

        media = suma / contador;
        System.out.println("La media es " + media);

    }

}
