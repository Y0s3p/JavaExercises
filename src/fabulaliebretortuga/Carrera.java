package fabulaliebretortuga;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Carrera {

    private int salidaT;
    private int salidaL;
    private int llegada;
    private boolean disponible = true;

    public Carrera(){

        this.salidaL = 1;
        this.salidaT = 1;
        this.llegada = 70;

    }


    public synchronized void turnoTortuga(int movimiento){

        while (disponible){

            try {
                wait();
            }catch (InterruptedException e){}
        }

        if (salidaT + movimiento < 0){

            salidaT = 1;

        }else {

            salidaT = salidaT + movimiento;

        }

        System.out.println("Posicion tortuga: " + salidaT);
        disponible = true;
        notify();
    }

    public synchronized void turnoLiebre(int movimiento){

        while (!disponible){

            try {
                wait();
            }catch (InterruptedException e){}

        }


        if (salidaL + movimiento < 0){

            salidaL = 1;

        }else {

            salidaL = salidaL + movimiento;

        }

        System.out.println("Posicion liebre:" + salidaL);
        disponible = false;
        notify();

    }

    public boolean finCarrera(){

        if (salidaT >= 70) System.out.println("La tortuga ha ganado");

        if (salidaL >= 70) System.out.println("La tortuga ha ganado");

        if (llegada<=salidaL || llegada<= salidaT){

            return true;

        }else {

            return false;

        }

    }

}
