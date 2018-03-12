package lectoresyescritores;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Libro {

    private int lector;
    private int escritor;
    public int pagina;
    private boolean disponible = true;

    public Libro(){

        this.lector = 0;
        this.escritor = 0;
        this.pagina = 0;

    }


    public synchronized void escribe(){

        while (lector == 1){
            try {
                wait();
            }catch (InterruptedException e){}
        }

        if (lector == 0) {

            escritor = 1;
            pagina += 1;
            System.out.println("Escritor esta escribiendo");

            int random = (int)Math.floor(Math.random()* (2 - 0) + 0);

            if (random == 0){

                escritor = 0;

            }else{

                escritor = 1;

            }

        }

        notify();
    }


    public synchronized void lee(){

        while (escritor == 1){

            try {
                wait();
            }catch (InterruptedException e){}
        }

        if (escritor == 0){

            lector = 1;
            System.out.println("Lector esta leyendo");
            int random = (int)Math.floor(Math.random()* (2 - 0) + 0);

            if (random == 0){

                lector = 1;

            }else {

                lector = 0;

            }

        }

        notify();


    }



    public boolean fin(){

        if (this.pagina >= 100){

            return true;

        }else {

            return false;

        }

    }

    public int getPagina(){

        return this.pagina;

    }


}
