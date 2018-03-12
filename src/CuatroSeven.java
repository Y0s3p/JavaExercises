import java.util.Scanner;

/**
 * Created by Yosep on 18/10/2017.
 */
public class CuatroSeven {

    public static void main(String[]args){

        int num1;
        int num2;
        int num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduzca un numero");
        num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduzca un numero");
        num3 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 && num1 > num3){

            System.out.println("El " + num1 + " es el mayor de todos");

        }else if (num2 > num3 && num1 < num2){

            System.out.println("El " + num2 + " es el mayor de todos");

        }else{

            System.out.println("El " + num3 + " es el mayor de todos");
        }
    }

}
