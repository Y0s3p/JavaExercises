import java.util.Scanner;

/**
 * Created by Yosep on 07/11/2017.
 */
public class CuatroTwentySix {

    public static void main(String[] args){

        boolean repetir = true;
        int respuesta;

        Scanner scanner = new Scanner(System.in);

        while (repetir == true){

            int moneda = (int) (Math.random() * 2);
            switch (moneda){

                case 0: System.out.println("Ha salido cara \n");
                    break;

                case 1: System.out.println("Ha salido cruz \n");
                    break;

                default:
                    break;
            }

            System.out.println("Si quieree repetir pulse 1 si no pulse cualquier otro numero");
            respuesta = Integer.parseInt(scanner.nextLine());
            if (respuesta == 1){

                repetir = true;

            }else {

                repetir = false;

            }

        }

    }

}
