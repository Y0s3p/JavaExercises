package ladrones;

/**
 * Created by Yosep on 14/02/2018.
 */
public class Deposito {

    private int cuenta;
    private int cuentaAhorros;
    private Clientes clientes;

    public Deposito(Clientes clientes){

        this.cuenta = (int)Math.floor(Math.random()*(1+10000));

    }

    public int getCuenta(){

        return cuenta;

    }



}
