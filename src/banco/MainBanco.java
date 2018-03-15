package banco;

/**
 * Created by Yosep on 14/03/2018.
 */
public class MainBanco {

    public static void main(String[] args){

        for (int i = 1; i <= 5; i++){
            Clientes cliente = new Clientes(i);
            cliente.start();
        }




    }

}
