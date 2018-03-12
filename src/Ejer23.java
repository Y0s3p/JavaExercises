import java.util.Scanner;

/**
 * Created by Yosep on 07/11/2017.
 */
public class Ejer23 {

    public static void main(String[] args){

        int mes = 1;

        Scanner scanner = new Scanner(System.in);

        while (mes != 0){

            System.out.println("Ingrese el numero del mes que desea");
            mes = Integer.parseInt(scanner.nextLine());

            switch (mes){

                case 1: System.out.println("Enero \n");
                    break;

                case 2: System.out.println("Febreso \n");
                    break;

                case 3: System.out.println("Marzo \n");
                    break;

                case 4: System.out.println("Abril \n");
                    break;

                case 5: System.out.println("Mayo \n");
                    break;

                case 6: System.out.println("Junio \n");
                    break;

                case 7: System.out.println("Julio \n");
                    break;

                case 8: System.out.println("Agosto \n");
                    break;

                case 9: System.out.println("Septiembre \n");
                    break;

                case 10: System.out.println("Octubre \n");
                    break;

                case 11: System.out.println("Noviembre \n");
                    break;

                case 12: System.out.println("Diciembre \n");
                    break;

                default: ;
                    break;
            }

        }

    }

}
