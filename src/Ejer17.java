import java.util.Scanner;

/**
 * Created by Yosep on 02/11/2017.
 */
public class Ejer17 {

    public static void main(String[] args){

        int num = 1;
        int mayor = 0;
        int menor = 0;

        Scanner scanner = new Scanner(System.in);

        while (num != 0){

            System.out.println("Introduzca un numero");
            num = Integer.parseInt(scanner.nextLine());

            if (num > mayor){

                mayor = num;

            }else if (num < menor){

                menor = num;
            }

        }

        System.out.println("El valor maximo es " + mayor);
        System.out.println("El valor minimo es " + menor);

    }

}

