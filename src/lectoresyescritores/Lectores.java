package lectoresyescritores;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Lectores extends Thread{

    private String lector;
    private Libro libro;

    public Lectores(Libro libro){

        this.libro = libro;

    }

    public void run(){

        while (!libro.fin()){

            libro.lee();

            try{
                sleep(1000);
            }catch (InterruptedException e){}

        }

    }

}
