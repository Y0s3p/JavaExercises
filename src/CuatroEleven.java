import java.util.Scanner;

/**
 * Created by Yosep on 22/10/2017.
 */
public class CuatroEleven {

    public static void main(String[] args){

        int num;
        long factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        num = Integer.parseInt(scanner.nextLine());

        if (num > 0){

            for(int i = num; i > 0 ;i--) {

                factorial = factorial * i;

            }

            System.out.println("El factorial de " + num + " es " + factorial);


        }else{

            System.out.println("El numero introducido no es positivo");

        }

    }

}
