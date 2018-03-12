package mates;

import javax.swing.*;

/**
 * Created by Yosep on 30/11/2017.
 */
public class CincoThree {

    public static void main(String[] args){

        int numeroI = 0;
        int numeroII = 0;

        numeroI = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
        numeroII = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        Mates operaciones = new Mates(numeroI,numeroII);

        System.out.println(operaciones.Factorial(numeroI));
        System.out.println(operaciones.Primo(numeroI));
        System.out.println(operaciones.numeroPerfecto(numeroI));
        System.out.println(operaciones.numerosAmigos(numeroI,numeroII));
        System.out.println(operaciones.Potencia(numeroI,numeroII));

    }

}
