package fabulaliebretortuga;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Main {

    public static void main(String[] args){

        Carrera carrera = new Carrera();
        Liebre liebre = new Liebre(carrera);
        Tortuga tortuga = new Tortuga(carrera);

        liebre.start();
        tortuga.start();

    }

}
