import java.util.Scanner;

/**
 * Created by Yosep on 16/11/2017.
 */
public class CuadradoMagico {

    public static void main(String[] args){

        int lado;
        int numeroMagico;
        int resultadoFila = 0;
        int resultadoColumna = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual quieres que sea el lado del cuadrado");
        lado = Integer.parseInt(scanner.nextLine());

        int matriz [][] = new int[lado][lado];

        for (int i = 0; i < lado; i++){

            for (int z = 0; z < lado; z++){

                System.out.println("Introduzca el elemento [" + i + "," + z + "]");
                matriz[i][z] = scanner.nextInt();

                resultadoFila = resultadoFila + matriz[i][z];
                numeroMagico = resultadoFila;

                if (resultadoFila == resultadoFila){

                    numeroMagico = resultadoFila;

                }


            }

        }


    }

}
