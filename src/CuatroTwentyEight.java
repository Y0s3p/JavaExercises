/**
 * Created by Yosep on 08/11/2017.
 */
public class CuatroTwentyEight {

    public static void main(String[] args){

        int dado1;
        int dado2;
        int contandor = 0;

        for (int i = 0; i < 100; i++){

            dado1 = (int)(Math.random() * 7);
            dado2 = (int)(Math.random() * 7);
            if (dado1 + dado2 == 10){

                contandor++;

            }
        }

        System.out.println("La cantidad de veces que ha salido el numero 10 entre los dos" +
                "dados han sido " + contandor + " veces");
    }

}
