package vectores;
import java.util.Collections;
import java.util.Vector;
/**
 * Created by Yosep on 14/12/2017.
 */
public class Cadena {

    Vector cadena = new Vector();
    Vector cadena_encriptada = new Vector();

    public Cadena(char a){

        cadena.add(a);

    }

    public void invierteCadena(){

        Collections.reverse(cadena);

    }

    public Vector encriptarCadena(){

        for (int i = 0; i <= cadena.size(); i++){

            cadena_encriptada.add((int) cadena.elementAt(i));

        }

        return cadena_encriptada;

    }

    public Vector desencriptaCadena(){

        for (int i = 0; i <= cadena.size(); i++){

            cadena.add((char) cadena_encriptada.elementAt(i));

        }

        return cadena;

    }

    public String visualizarCadena(){

        String visualizar = "";

        for (int i = 0; i <= cadena.size(); i++){

            visualizar += cadena.elementAt(i).toString();

        }

        return visualizar;

    }

}
