package examen;

import javax.swing.*;

/**
 * Created by Yosep on 15/12/2017.
 */
public class yahoo {


    public int suma(int a, int b){

        int suma = a + b;

        return suma;


    }

    public static void main(String[] args){

        int num1,num2;

        yahoo yahoo = new yahoo();

        num1= Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));
        num2= Integer.parseInt(JOptionPane.showInputDialog("introduzca un numero"));

        if (num1 < 0 || num2 < 0){

            System.out.println("desconocido");

        }else if (yahoo.suma(num1,num2) >= 0 && yahoo.suma(num1,num2) <= 4){

            System.out.println(yahoo.suma(num1,num2));

        }else if (yahoo.suma(num1,num2) > 4){

            System.out.println("muchos");

        }

    }

}
