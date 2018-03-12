import java.util.Scanner;

/**
 * Created by Yosep on 23/11/2017.
 */
public class MarioBros {

    public static void main(String[] args){

        int [] CantidadMuro;
        int niveles;
        int muros;
        int datosIntroducidos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos niveles va a tener el juego ?");
        niveles = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < niveles; i++){

            System.out.println("Cuantos muros va a tener este nivel");
            muros = Integer.parseInt(scanner.nextLine());

            CantidadMuro = new int[muros];

            int subida = 0;
            int bajada = 0;

            for (int z = 0; z < CantidadMuro.length; z++){

                System.out.println("Ingrese un numero del 1 al 10");
                datosIntroducidos = Integer.parseInt(scanner.nextLine());
                CantidadMuro[z] = datosIntroducidos;
            }

            for (int x = 0; x < CantidadMuro.length; x++){

                if (CantidadMuro[x] > CantidadMuro[x+1]){

                    subida++;

                }else if (CantidadMuro[x] < CantidadMuro[x+1]){

                    bajada++;

                }

            }

            System.out.println("Este nivel ha tenido " + subida + " saltos hacia arriba");
            System.out.println("Este nivel ha tenido " + bajada + " saltos hacia abajo");

        }

    }

}
