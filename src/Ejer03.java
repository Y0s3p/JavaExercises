import java.util.Scanner;

/**
 * Created by Yosep on 18/10/2017.
 */
public class Ejer03 {

    public static void main(String args[]){

        double area;
        int lado1;
        int lado2;
        int lado3;
        int totalLado1;
        int totalLado2;
        int totalLado3;
        int total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Indique el valor del lado del triangulo");
        lado1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Indique el valor del lado del triangulo");
        lado2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Indique el valor del lado del triangulo");
        lado3 = Integer.parseInt(scanner.nextLine());

        total = (lado1 + lado2 + lado3) / 2;
        totalLado1 = total - lado1;
        totalLado2 = total - lado2;
        totalLado3 = total - lado3;
        area = Math.sqrt(total * (total * totalLado1 * totalLado2 * totalLado3));

        System.out.println("El area de este triangulo es " + area);

    }

}
