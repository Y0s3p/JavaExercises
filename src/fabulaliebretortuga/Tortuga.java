package fabulaliebretortuga;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Tortuga extends Thread {

    /**
     * probabilidad es la variable que contiene el porcentaje el cual de el obtendremos el valor de la
     *                     variable movimiento
     *
     * movimiento es la variable que contiene el numero de casillas que se desplazara la tortuga tanto
     *                   a la derecha como a la izquierda
     *
     * carrera carrera contiene el objeto carrera de la clase carrera
     */
    private int probabilidad;
    private int movimiento;
    private Carrera carrera;

    public Tortuga(Carrera carrera){

        this.carrera = carrera;

    }


    /**
     *  run este metodo derivado de la clase Thread esta sobreescrito para que se encargue de darle
     *            un valor a la variable movimiento dependiendo del procentaje
     */

    @Override
    public void run(){

        while (!carrera.finCarrera()){

            probabilidad = (int)Math.floor(Math.random()*(1+100));

            if (probabilidad <= 20){

                movimiento = 0;

            }else if (probabilidad > 20 && probabilidad <= 40){

                movimiento = 9;

            }else if (probabilidad > 40 && probabilidad <= 50){

                movimiento = -12;

            }else if (probabilidad > 50 && probabilidad <= 80){

                movimiento = 1;

            }else if (probabilidad > 80 && probabilidad <= 100){

                movimiento = 2;

            }

            carrera.turnoTortuga(movimiento);

            try{
                sleep(1000);
            }catch (InterruptedException e){}

        }


    }

}
