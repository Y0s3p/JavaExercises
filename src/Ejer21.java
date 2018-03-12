/**
 * Created by Yosep on 07/11/2017.
 */
public class Ejer21 {

    public static void main(String[] args){

        int mult = 0;

        for (int i = 1; i <= 10; i++){

            System.out.println("Tabla del " + i + "\n");

            for (int z = 1; z <= 10; z++){

                mult = i * z;
                System.out.println(i + " * " + z + " = " + mult + "\n");

            }

        }

    }

}
