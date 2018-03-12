import java.util.Scanner;

/**
 * Created by Yosep on 07/11/2017.
 */
public class Ejer24 {

    public static void main(String[] args){

        int nota = 0;
        Scanner scanner = new Scanner(System.in);
        boolean correcto = false;



        while (!correcto){

            System.out.println("Por favor, ingrese su nota");
            nota = Integer.parseInt(scanner.nextLine());

            try{

                if (nota < 0 || nota > 10){

                    throw new ExcepcionNota("Nota incorrecta");
                }
                correcto = true;

            } catch (ExcepcionNota e){

                System.out.println("Introduzca la nota correctamente");
            }

        }


        if (nota >= 0 && nota < 3){

            System.out.println("Muy deficiente");

        }else if (nota >= 3 && nota < 5){

            System.out.println("Insuficiente");

        }else if (nota >= 5 && nota < 6){

            System.out.println("Suficiente");

        }else if (nota >= 6 && nota < 7){

            System.out.println("Bien");

        }else if (nota >= 7 && nota < 8){

            System.out.println("Notable");

        }else if (nota >= 9 && nota <= 10){

            System.out.println("Sobresaliente");

        }

    }

}
