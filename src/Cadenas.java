import java.util.Scanner;

/**
 * Created by Yosep on 03/11/2017.
 */
public class Cadenas {

    public static void main(String[] args){

        String palabra1;
        String palabra2;
        int cantidad = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indique cuantos pares de palabras vas a introducir");
        cantidad = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantidad; i++){

            System.out.println("Ingrese una palabra");
            palabra1 = scanner.nextLine();

            System.out.println("Ingrese una palabra");
            palabra2 = scanner.nextLine();

            if (palabra1.equals(palabra2) == true || palabra1.equals(palabra2) == true) {

                System.out.println("La palabras estan relacionadas entre si");

            }else{

                System.out.println("La palabras no estan relacionadas");

            }

        }

    }

}
