package examen2;

import javax.swing.*;

/**
 * Created by Yosep on 09/01/2018.
 */
public class cuadrados {

    public static void main(String[] args){

        int num1, num2, cuadrados;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));

        if (num1 < num2){

            for (int i = num1; i < num2; i++){

                cuadrados = (int)Math.pow(i,2);

                if (cuadrados < num2){

                    System.out.println(cuadrados);

                }

            }


        }else if (num2 < num1){

            for (int i = num2; i < num1; i++){

                cuadrados = (int)Math.pow(i,2);

                if (cuadrados < num2){

                    System.out.println(cuadrados);

                }

            }

        }


    }

}
