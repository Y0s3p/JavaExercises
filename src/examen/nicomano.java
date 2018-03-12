package examen;

import javax.swing.*;

/**
 * Created by Yosep on 15/12/2017.
 */
public class nicomano {

    public static void main(String[] args){

        int num1,num2;
        int cubo = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        if (num1 < num2){

            for (int i = num1; i < num2; i++){

                cubo = (int)Math.pow(i,3);

                if (cubo <= num2){

                    System.out.println(cubo);

                }


            }


        }else if (num1 >= num2){

            for (int i = num2; i < num1; i++){

                cubo = (int)Math.pow(i,3);

                if (cubo < num1){

                    System.out.println(cubo);

                }

            }


        }


    }

}
