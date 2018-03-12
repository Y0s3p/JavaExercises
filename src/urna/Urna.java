package urna;

import java.util.*;

public class Urna {

    public static int bolasBlancas, bolasNegras;

    public Urna(int a, int b){

        bolasBlancas = a;
        bolasNegras = b;

    }

    public int sacarBola(){

        int random = 0;

        if(cantidadBolasBlancas() > 1 && cantidadBolasNegras() > 1){

            random = (int)(Math.random() * 2)+1;

        } else {

            if(cantidadBolasBlancas() < 1){

                random = 1;

            } else if(cantidadBolasNegras() < 1){

                random = 2;

            }

        }

        if (random == 1){

            bolasBlancas--;

        }else{

            bolasNegras--;

        }

        return random;

    }

    public void sumarBola(int color){

         if (color == 1){

             bolasBlancas++;

         }else {

             bolasNegras++;

         }

    }

    public int cantidadBolas(){

        return bolasBlancas + bolasNegras;

    }

    public int cantidadBolasBlancas(){

        return bolasBlancas;

    }

    public int cantidadBolasNegras(){

        return bolasNegras;

    }

    public int ultimaBola(){

        int acertada = 0;
        if (bolasBlancas == 1){

            acertada = 1;
        }

        if (bolasNegras == 1){

            acertada = 2;

        }
        return acertada;

    }

}




