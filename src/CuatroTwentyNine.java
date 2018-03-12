/**
 * Created by Yosep on 08/11/2017.
 */
public class CuatroTwentyNine {

    public static void main(String[] args){

        for (int i = 0; i < 14; i++){

            int random = (int)(Math.random() * 11);

            if (random <= 5){

                System.out.println("En la columna " + i + " ha salido 1 \n");

            }else if (random > 5 && random < 8){

                System.out.println("En la columna " + i + " ha salido x \n");

            }else if (random > 8){

                System.out.println("En la columna " + i + " ha salido 2 \n");

            }

        }

    }

}
