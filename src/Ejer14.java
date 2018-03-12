/**
 * Created by Yosep on 22/10/2017.
 */
public class Ejer14 {

    public static void main(String[] args){

        for (int i = 0; i < 100; i++){

            int aleatorio = (int) (Math.random() * 2);

            switch (aleatorio){

                case 0: System.out.println("Hola");
                    break;

                case 1: System.out.println("Adios");
                    break;

                default: ;
                    break;

            }


        }
    }

}
