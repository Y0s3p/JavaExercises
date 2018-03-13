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

/**
 * Calcula uno de los elementos de la matriz resultado
 */

class HiloMultiplicador implements Runnable{
    
    private final double[][] m1;
    private final double[][] m2;
    private final double[][] resultado;
    private final int fila;
    private final int columna;

    /**
     * Guarda los parámetros que se le pasan 
     * @param m1 primer operando
     * @param m2 segundo operando
     * @param resultado matriz donde dejar el resultado
     * @param fila fila que debe calcular
     * @param columna columna que debe calcular
     */
    
    public HiloMultiplicador (double[][] m1, double[][]m2, double[][]resultado, int fila, int columna)
    {
        this.m1 = m1;
        this.m2 = m2;
        this.resultado = resultado;
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Calcula el elemento fila,columna de la matriz resultado
     */
    @Override
    public void run()
    {
            resultado[fila][columna] = 0.0;
            for (int i=0; i<m2.length; i++)
                    resultado[fila][columna] += m1[fila][i] * m2[i][columna];
    }
}




