import java.util.Scanner;

/**
 * Created by Yosep on 20/10/2017.
 */
public class CuatroNine {

    public static void main(String[]args){

        int num1;
        int num2;
        int suma = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduzca un numero");
        num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2){

            for (int i = num2+1; i < num1; i++){

                suma = i + suma;
            }

            System.out.println(suma);

        }else {

            for (int i = num1+1; i < num2; i++){

                suma = i + suma;
            }

            System.out.println(suma);

        }

    }

}
