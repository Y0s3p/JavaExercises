import java.util.Scanner;

public class Ejer05 {

    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero");

        num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0){

            System.out.println("Tu numeroes par");
        }else {

            System.out.println("Tu numero es impar");
        }

    }

}
