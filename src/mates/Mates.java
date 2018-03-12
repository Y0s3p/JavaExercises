package mates;

/**
 * Created by Yosep on 30/11/2017.
 */
public class Mates {

    public static int numeroA, numeroB;

    public Mates(int a, int b) {

        numeroA = a;
        numeroB = b;

    }

    public static int Factorial(int a){

        int factorial = 1;

        for (int i = a; i > 0; i--){

            factorial = factorial * i;

        }

        return factorial;

    }

    public static boolean Primo(int a){

        boolean primo = true;

        for (int i = 1; i < a && primo==true; i++){

            if (a%i == 0){

                primo = false;

            }


        }

        return primo;
    }


    public static boolean numeroPerfecto(int a){

        boolean numeroPerfec = false;
        int suma = 0;

        for (int i = 1; i <= a; i++){

            if (a%i == 0){

                suma = suma + i;

            }

            if (suma == a){

                numeroPerfec = true;

            }

        }

        return numeroPerfec;

    }


    public static boolean numerosAmigos(int a, int b){

        boolean numeroAmigo = false;
        int sumaI = 0;
        int sumaII = 0;

        for (int i = 1; i < a; i++){

            if (a%i == 0){

                sumaI = sumaI + i;

            }

        }

        for (int j = 1; j < b; j++){

            if (b%j == 0){

                sumaII = sumaII + j;

            }

        }

        if (sumaI == sumaII){

            numeroAmigo = true;

        }else {

            numeroAmigo = false;

        }

        return numeroAmigo;

    }

    public static int Potencia(int a, int b){

        int potencia = 0;

        potencia = (int)Math.pow(a,b);

        return potencia;

    }


}
