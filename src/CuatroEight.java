import java.util.Scanner;

/**
 * Created by Yosep on 18/10/2017.
 */
public class CuatroEight {

    public static void main(String[]args){

        int ladoA;
        int ladoB;
        int ladoC;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        ladoA = Integer.parseInt(scanner.nextLine());

        System.out.println("Introduzca un numero");
        ladoB= Integer.parseInt(scanner.nextLine());

        System.out.println("Introduzca un numero");
        ladoC = Integer.parseInt(scanner.nextLine());

        if (ladoA >= ladoB + ladoC){

            System.out.println("No es un triangulo");

        }else if (ladoA*2 == ladoB*2 + ladoC*2){

            System.out.println("Triangulo rectangulo");

        }else if (ladoA*2 > ladoB*2 + ladoC*2){

            System.out.println("Triangulo obtusangulo");

        }else if (ladoA*2 < ladoB*2 + ladoC*2){

            System.out.println("Tringulo acutangulo");

        }

    }

}
