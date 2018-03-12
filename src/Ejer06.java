import java.util.Scanner;

/**
 * Created by Yosep on 18/10/2017.
 */
public class Ejer06 {

    public static void main(String[]args){

        int num1;
        int num2;
        int resultado;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese un numero");
        num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 && num1%num2 == 0){

            resultado = num1 / num2;
            System.out.println(num1 + " Es divisible por " + num2 + " y el resultado es " + resultado);

        }else if (num2 > num1 && num2%num1 == 0){

            resultado = num2 / num1;
            System.out.println(num2 + " Es divisible por " + num1 + " y el resultado es " + resultado);

        }else {

            System.out.println("Los numeros no son divisibles entre si");

        }
    }

}
