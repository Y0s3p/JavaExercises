import java.util.Scanner;

/**
 * Created by Yosep on 14/11/2017.
 */
public class Conejos {

    public static void main(String[] args){

        long pareja = 1;
        long sumaParejas = 0;
        int fecha;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos meses han pasado");
        fecha = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < fecha; i++){

            sumaParejas = pareja + sumaParejas;
            pareja = sumaParejas - pareja;

        }

        System.out.println(sumaParejas);

    }

}
