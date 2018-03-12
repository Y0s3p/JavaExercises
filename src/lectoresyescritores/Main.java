package lectoresyescritores;

import fabulaliebretortuga.Carrera;
import fabulaliebretortuga.Liebre;
import fabulaliebretortuga.Tortuga;

/**
 * Created by Yosep on 22/02/2018.
 */
public class Main {

    public static void main(String[] args){

        Libro libro = new Libro();
        Escritores escritor = new Escritores(libro);
        Lectores lector = new Lectores(libro);

        escritor.start();
        lector.start();

    }

}
