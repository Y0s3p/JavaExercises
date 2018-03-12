package examen;

import javax.swing.*;

/**
 * Created by Yosep on 15/12/2017.
 */
public class Yahoo {


    public int suma(int a, int b){

        int suma = a + b;

        return suma;


    }

    public static void main(String[] args){

        int num1,num2;

        Yahoo Yahoo = new Yahoo();

        num1= Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));

        if (num1 < 0 || num2 < 0){

            System.out.println("desconocido");

        }else if (Yahoo.suma(num1,num2) >= 0 && Yahoo.suma(num1,num2) <= 4){

            System.out.println(Yahoo.suma(num1,num2));

        }else if (Yahoo.suma(num1,num2) > 4){

            System.out.println("muchos");

        }

    }

}
