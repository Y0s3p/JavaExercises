import java.util.Scanner;

/**
 * Created by Yosep on 10/11/2017.
 */
public class Ciclos {

    public static void main(String[] args){

        int num1;
        int num2;
        int contadorTotal = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese un numero");
        num2 = Integer.parseInt(scanner.nextLine());

        if (num1 < num2){

            for (int i = num1; i < num2; i++){

                int x = i;
                int sumaContador = 0;

                while (x != 1){

                    if (!par(x)){

                        x = (x * 3) + 1;

                    }else {

                        x = x / 2;

                    }

                    sumaContador++;

                }

                if (sumaContador > contadorTotal){

                    contadorTotal = sumaContador;

                }

            }

            System.out.println("El mayor ciclo es " + (contadorTotal+1));

        }else if (num1 > num2){

            for (int i = num2; i < num1; i++){

                int x = i;
                int sumaContador = 0;

                while (x != 1){

                    if (!par(x)){

                        x = (x * 3) + 1;

                    }else {

                        x = x / 2;

                    }

                    sumaContador++;

                }

                if (sumaContador > contadorTotal){

                    contadorTotal = sumaContador;

                }

            }

            System.out.println("El mayor ciclo es " + (contadorTotal+1));
        }

    }

    public static boolean par(int a){

        if(a%2 == 0){

            return true;

        }else {

            return false;

        }


    }
}
