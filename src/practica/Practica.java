package practica;

import java.util.*;

public class Practica extends Calculator{

    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner scanner = new Scanner(System.in);
        num1 = Integer.parseInt(scanner.nextLine());
        num2 = Integer.parseInt(scanner.nextLine());

        System.out.println(num1 + " - " + num2);

        Calculator prueba = new Calculator();

        int resultado_suma = prueba.Sumar(num1,num2);

        System.out.println(resultado_suma);

        int resultado_resta = prueba.Restar(num1, num2);

        System.out.println(resultado_resta);

        int resultado_multi = prueba.Multiplicar(num1, num2);

        System.out.println(resultado_multi);

        double resultado_dividir = prueba.Dividir(num1, num2);

        System.out.println(resultado_dividir);
    }


    private void creaPiramide() {

        String asterisco = "*";
        String espacio = "_";

        Scanner scanner = new Scanner(System.in);

        String texto_consola = scanner.nextLine();

        int filas = Integer.parseInt(texto_consola);

        for (int i = 0; i < filas; i++){

            for (int x = filas - i; x > 0; x-- ){

                System.out.print(espacio);

            }

            System.out.println(asterisco);

            asterisco = asterisco + "**";

        }

    }

}
