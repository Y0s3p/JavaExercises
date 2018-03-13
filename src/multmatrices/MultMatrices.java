/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multmatrices;

/**
 *
 * @author MARIO
 */
import java.util.LinkedList;


public class MultMatrices
{
    /**
     * Crea dos matrices, las multiplica y saca el resultado por pantalla.
     * @param args
     */
    public static void main(String[] args) 
    {
            // Dos matrices para multiplicar 
            double [][] m1 = new double[][] {{1,2,3},{1,2,3},{1,2,3}};
            double [][] m2 = new double[][] {{1,2,3},{1,2,3},{1,2,3}};

            // Se multiplican
            double [][] resultado = new MultMatrices().multiplica(m1, m2);


            // Se saca por pantalla el resultado.
            for (int i=0;i<resultado.length; i++)
            {
                    for (int j=0;j<resultado[0].length;j++)
                            System.out.print(resultado[i][j]+" ");
                    System.out.println(" ");
            }
    }

    /**
     * Realiza la multiplicación de las dos matrices y devuelve el resultado
     * @param m1 primer operando
     * @param m2 segundo operando
     * @return resultado de multiplicar m1xm2
     */
    public double[][] multiplica (double [][] m1, double [][] m2){
        
        // condiciones que deben cumplirse y que se suponen ciertas
        // con los parámetros de entrada
        assert m1 != null;
        assert m2 != null;
        assert m1.length > 0;
        assert m1[0].length > 0;
        assert m2.length > 0;
        assert m2[0].length > 0;
        assert m1.length == m2[0].length;

        // Calculo de las dimensiones de la matriz resultado y
        // reserva de espacio para ella
        int filas = m1.length;
        int columnas = m2[0].length;
        double [][] resultado = new double[filas][columnas];

        // Lista con todos los hilos lanzados.
        LinkedList<Thread> hilos = new LinkedList();

        // Para cada elemento de la matriz resultado, se lanza el hilo
        // correspondiente.
        for (int fila=0; fila<filas; fila++)
            for (int columna=0; columna<columnas; columna++)
            {
                Thread hilo = new Thread(
                    new HiloMultiplicador(m1,m2,resultado,fila,columna));
                hilos.add(hilo);
                hilo.start();
            }

        // Se espera que terminen todos los hilos
        for (Thread hilo: hilos)
                try {
                        hilo.join();
                } catch (InterruptedException e) {
                }

        // se devuelve el resultado obtenido	
        return resultado;
    }
}

