
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanoi;
import java.util.Scanner;

/**
 *
 * @author Yosep
 *
 */
public class Hanoi {


    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Numero de discos");
            int discos = scanner.nextInt();
            hanoi(discos, 1, 2, 3);
            int movimientos = (int) (Math.pow(2, discos)- 1);
            System.out.println("El minimo numero de movimientos para " + discos + " discos es "+movimientos+ " movimientos.");
    }
    
    public static void hanoi (int discos, int inicio, int aux, int destino ) {
        if (discos == 1){
            System.out.println("Moviendo de la torre "+inicio+" a la torre "+destino);
            
        }else{
        hanoi(discos - 1, inicio, destino, aux );
        System.out.println("Moviendo de la torre "+inicio+" a la torre "+destino);
        hanoi(discos - 1,aux, inicio, destino );
    }

    }
    
}
