package fabulaliebretortuga;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Liebre extends Thread{

    private int probabilidad;
    private int movimiento;
    private Carrera carrera;

    public Liebre(Carrera carrera){

        this.carrera = carrera;

    }

    @Override
    public void run(){

        while (!carrera.finCarrera()){

            probabilidad = (int)Math.floor(Math.random()*(1+100));

            if (probabilidad <= 50){

                movimiento = 3;

            }else if (probabilidad > 50 && probabilidad <= 70){

                movimiento = -6;

            }else if (probabilidad > 70 && probabilidad <= 100){

                movimiento = 1;

            }

            carrera.turnoLiebre(movimiento);


            try{
                sleep(1000);
            }catch (InterruptedException e){}

        }

    }


}
