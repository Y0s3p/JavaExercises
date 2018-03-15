package banco;

import java.io.FileNotFoundException;
import java.util.Hashtable;

/**
 * Created by Yosep on 12/03/2018.
 */
public class Clientes extends Thread{

    private int random;

    int accion = 0;

    int id_user = 0;

    public Clientes(int id_user){

        accion = (int) Math.floor(Math.random()*(1+3));
        this.id_user = id_user;

    }

    public void run(){

        if(accion == 1){
            try {
                CuentaCorriente corriente = new CuentaCorriente(id_user);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        if(accion == 2){
            try {
                Deposito deposito = new Deposito(id_user);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        if(accion == 3){
            try {
                CuentaAhorro cuentaAhorro = new CuentaAhorro(id_user);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

}
