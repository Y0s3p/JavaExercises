import java.util.Scanner;
/**
 * Created by Yosep on 18/10/2017.
 */
public class Ejer04 {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo o negativo");

        num = Integer.parseInt(scanner.nextLine());

        if (num < 0){

            System.out.println("Tu numero es negativo");
        }else {

            System.out.println("Tu numero es positivo");
        }

    }

}
