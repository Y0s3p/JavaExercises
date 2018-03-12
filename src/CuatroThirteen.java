import java.util.Scanner;
/**
 * Created by Yosep on 22/10/2017.
 */
public class CuatroThirteen {

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

                if (par(i)){

                    System.out.println("Un numero par es " + i);
                    op = op + i;

                }

            }

        }

        if (num2 > num1 ){

            for (int i = num1+1; i < num2; i++){

                if (par(i)){

                    System.out.println("Un numero par es " + i);
                    op = op + i;

                }

            }

        }

        System.out.println("La suma de los numeros pares es " + op);

    }

    public static boolean par(int a){

        if(a%2 == 0){

            return true;

        }else {

            return false;

        }


    }

}
