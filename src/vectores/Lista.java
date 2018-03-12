package vectores;

import java.util.Vector;

/**
 * Created by Yosep on 01/12/2017.
 */
public class Lista implements Pila, Cola{

    Vector lista;

    public Lista(){

        lista = new Vector();

    }

    public void ponPrimero(Object ob){

        lista.add(ob);

    }

    public void ponUltimo(Object ob){

        lista.addElement(ob);

    }

    public boolean estaVacia(){

        return lista.isEmpty();

    }

    public Object extraerPrimero(){

       return lista.firstElement();

    }

    public Object extraerUltimo(){

        return lista.lastElement();

    }

    public void visualizarElementos(){

        for (int i = 0; i < lista.size(); i++){

            System.out.println(lista.elementAt(i));

        }

    }

    @Override
    public Object pop() {

        return this.extraerUltimo();

    }

    @Override
    public void push(Object ob){

        this.ponUltimo(ob);

    }

    @Override
    public boolean vacia() {

        return this.estaVacia();

    }

    @Override
    public void cima(Object ob) {

        this.ponPrimero(ob);

    }

    public Object extraerDeCola(){

        return this.extraerUltimo();

    }

    public void ponEnCola(Object ob){

        this.ponUltimo(ob);

    }

    public boolean colaVacia(){

        return this.estaVacia();

    }

    public void frente(Object ob){

        this.ponPrimero(ob);

    }


}