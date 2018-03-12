/**
 * Created by Yosep on 08/11/2017.
 */
public class CuatroTwentySeven {

    public static void main(String[] args){

        int dado;
        int contandor = 0;

        for (int i = 0; i < 100; i++){

            dado = (int)(Math.random() * 7);

            if (dado == 6){

                contandor++;

            }
        }

        System.out.println("El numero 6 ha salido " + contandor + " veces");
    }

}
