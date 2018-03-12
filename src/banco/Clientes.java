package banco;

import java.util.Hashtable;

/**
 * Created by Yosep on 12/03/2018.
 */
public class Clientes {

    private Hashtable<Integer,String> name = new Hashtable<>();

    private int random;

    CuentaCorriente moneyBank;

    public Clientes(CuentaCorriente moneyBank){

        this.moneyBank = moneyBank;

        this.random = (int)Math.floor(Math.random()*(1+5));

        name.put(1, "Silvestre");
        name.put(2, "Mario");
        name.put(3, "Rafa");
        name.put(4, "Sergio");
        name.put(5, "Yeyo");

        this.name.get(random);

    }



}
