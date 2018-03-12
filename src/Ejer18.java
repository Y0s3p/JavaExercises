import java.util.Scanner;

/**
 * Created by Yosep on 02/11/2017.
 */
public class Ejer18 {

    public static void main(String[] args){

        int a;
        int b;
        int c;
        long d;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduce un numero");
        b = Integer.parseInt(scanner.nextLine());

        c = a - b;

        d = factorial(a) / factorial(b)*factorial(c);

        System.out.println("El resultado es " + d);

    }

    public static int factorial(int num){

        int factorial = 1;
        for (int i = num; i > 0; i--){

            factorial = factorial * i;
        }

        return factorial;

    }

}
