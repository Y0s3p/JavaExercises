package compositor;

/**
 * Created by Yosep on 15/03/2018.
 */
public class MainCompositor {

    public static void main(String[] args){

        Compas compas = new Compas();
        NotaA notaA = new NotaA(compas);
        NotaB notaB = new NotaB(compas);

        notaA.start();
        notaB.start();


    }

}
