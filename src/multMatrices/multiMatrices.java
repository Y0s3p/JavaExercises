package multMatrices;

/**
 * Created by Yosep on 06/02/2018.
 */
public class multiMatrices {

    private int [][] matrizUno;
    private int [][] matrizDos;

    public multiMatrices(int a, int b, int c, int d){

        matrizUno = new int[a][b];
        matrizDos = new int[c][d];

    }

    public void addMatrizes(){

        for (int i = 0; i <= matrizUno.length; i++){

            for (int z = 0; z <= matrizUno[i].length; z++){

                matrizUno[i][z] = ((int)Math.floor(Math.random()*(1+10)));

            }

        }

        for (int i = 0; i <= matrizDos.length; i++){

            for (int z = 0; z <= matrizDos[i].length; z++){

                matrizDos[i][z] = ((int)Math.floor(Math.random()*(1+10)));

            }

        }

    }

    public void opMatriz(){

        int resultadoMUno = 0;
        int resultadoMDos = 0;




    }

}
