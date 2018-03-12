import java.util.Scanner;

/**
 * Created by Yosep on 22/10/2017.
 */
public class CuatroTen {

    public static void main(String[]args){

        int num1;
        int num2;
        int num3;
        int suma;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero de referencia");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce un numero");
        num2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce un numero");
        num3 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 && num1 > num3 && num2%2 == 0 && num3%2 == 0){

            suma = num2 + num3;
            System.out.println("La suma es " + suma);

        }else{

            System.out.println("Uno de los numeros introducidos no es par o es menor que el numero de referencia.");

        }


    }

}
