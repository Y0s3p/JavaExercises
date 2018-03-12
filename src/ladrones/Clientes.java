package ladrones;

/**
 * Created by Yosep on 14/02/2018.
 */
public class Clientes extends Thread{

    private String nombreTitular;
    private Deposito deposito;

    public Clientes(String nombre, Deposito deposito){

        this.deposito = deposito;
        this.nombreTitular = nombre;

    }

    public int consultarSaldo(){

        return deposito.getCuenta();

    }

    public void ingresarSaldo(int ingreso){

        ingreso = deposito.getCuenta() + ingreso;

    }

    public String retirarDinero(int retirarDinero){

        int dineroretirado;

        dineroretirado = deposito.getCuenta() - retirarDinero;

        if (retirarDinero > deposito.getCuenta()){

            return "No puede retirar mas dinero del que posee";

        }else {

            return "Has retirado " + dineroretirado;

        }

    }

}
