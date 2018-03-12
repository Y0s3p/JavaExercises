package EjerVector;

/**
 * Created by Yosep on 12/12/2017.
 */
public class SeisOne {

    public static void main(String[] args){

        Lista list = new Lista();

        //Añadimos el primer objeto a nuestra lista
        list.cima("Hey");
        list.ponPrimero("Hola");

        //Añadimos un objeto alfinal de la lista
        list.ponUltimo("Adios");
        list.push("Bye");

        //Compruba que nuestra lista este vacia
        System.out.println(list.vacia());
        System.out.println(list.estaVacia());

        //Nos devuelve un el primer elemento
        System.out.println(list.extraerPrimero());
        System.out.println(list.pop());

        //Nos devuelve el ultimo elemento
        System.out.println(list.extraerUltimo());

        //Visializas todos los elementos almacenados en la lista
        list.visualizarElementos();

    }

}
