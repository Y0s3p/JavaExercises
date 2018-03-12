package mastermind;

/**
 * Created by Yosep on 01/12/2017.
 */
public class Maquina {

    public static int acietos;
    public static String numeroAleatorio;
    public static String numeroJugador;

    public Maquina(String a){

        numeroAleatorio = a;

    }

    public void conseguirNmero(String a){

        numeroJugador = a;

    }

    public String compararNumero(String a){

        for (int i = 0; i < numeroAleatorio.length(); i++){

            for (int j = 0; j < numeroJugador.length(); j++){

                if (numeroJugador.equals(numeroAleatorio.charAt(i))){

                    a = numeroAleatorio;

                }

            }

        }

        return a;

    }



}
