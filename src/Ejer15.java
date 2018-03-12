import java.util.Scanner;

/**
 * Created by Yosep on 31/10/2017.
 */
public class Ejer15 {

    public static void main(String[] args){

        int num1 = 0;
        int num2 = 0;
        int op = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduzca un numero");
        num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2 ){

            for (int i = num1 - 1; i > num2; i--){

                if (mult(i)){

                    System.out.println(i + " Es multiplo de 3");
                    op = op + i;

                }

            }

        }

        if (num2 > num1 ){

            for (int i = num1+1; i < num2; i++){

                if (mult(i)){

                    System.out.println(i + " Es multiplo de 3");
                    op = op + i;

                }

            }

        }

    }

    public static boolean mult(int a){

        if(a%3 == 0){

            return true;

        }else {

            return false;

        }


    }

}

