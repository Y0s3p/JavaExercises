package compositor;

/**
 * Created by Yosep on 15/03/2018.
 */
public class Compas {

    public int compasA;

    public int compasB;

    public int compasC;

    private String minicancion;

    private int cancion;

    private boolean disponible;

    public Compas(){

        this.cancion = 64;
        this.compasA = 0;
        this.compasB = 0;
        this.compasC = 4;
        this.minicancion = "";

    }

    public int getCancion(){

        return this.cancion;
    }

    public int getCompasA(){

        return this.compasA;
    }

    public int getCompasB(){

        return this.compasB;
    }

    public synchronized void turnoNotaA(String notamusical){

        while (disponible){

            try {
                wait();
            }catch (InterruptedException e){}
        }

        if (compasA + compasB == compasC && compasC < 64){

            System.out.println(minicancion);
            compasC = compasC+4;
            minicancion = "";
        }

        System.out.println("Hilo 1 produce la nota: " + notamusical );

        minicancion += notamusical;

        disponible = true;

        this.compasA++;

        notify();
    }

    public synchronized void turnoNotaB(String notamusical){


        while (!disponible){

            try {
                wait();
            }catch (InterruptedException e){}

        }

        if (compasA + compasB == compasC && compasC < 64){

            System.out.println(minicancion);
            compasC = compasC+4;
            minicancion = "";
        }

        System.out.println("Hilo 2 produce la nota: " + notamusical );

        minicancion += notamusical;

        disponible = false;

        this.compasB++;

        notify();

    }

}
