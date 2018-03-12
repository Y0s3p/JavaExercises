package urna;

import urna.Urna;

import javax.swing.*;

/**
 * Created by Yosep on 09/11/2017.
 */
public class CincoOne {

    public static void main(String[] args){

        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de bolas blancas"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de bolas negras"));

        Urna urna = new Urna(num1, num2);

        while (urna.cantidadBolasBlancas() > 1 && urna.cantidadBolasNegras() > 1){

            int respuesta = urna.sacarBola();
            int respuesta2 = urna.sacarBola();

            if (respuesta != respuesta2){

                urna.sumarBola(1);

            }else {

                urna.sumarBola(2);

            }

        }
        if(urna.cantidadBolas() == 1){

            if(urna.ultimaBola() == 1) System.out.println("Salió blanca");
            if(urna.ultimaBola() == 2) System.out.println("Salió negra");

        }

    }

}
