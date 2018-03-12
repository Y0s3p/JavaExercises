package lectoresyescritores;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Escritores extends Thread {

    private String escritor;
    private Libro libro;

    public Escritores(Libro libro){

        this.libro = libro;

    }

    public void run(){

        while (!libro.fin()){

            libro.escribe();

            try{
                sleep(1000);
            }catch (InterruptedException e){}


        }




    }

}
