import java.util.Scanner;

/**
 * Created by Yosep on 02/11/2017.
 */
public class CuatroSixteen {

    public static void main(String[] args){

        int cantida = 0;
        int num = 0;
        int mayor = 0;
        int menor = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cuantos numeros quieres que tenga su lista");
        cantida = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < cantida; i++){

            System.out.println("Ingrese un numero");
            num = Integer.parseInt(scanner.nextLine());

            if (num > mayor){

                mayor = num;

            }else if (num < menor){

                menor = num;
            }

        }

        System.out.println("El valor maximo es " + mayor);
        System.out.println("El valor minimo es " + menor);
    }

}
