package banco;

/**
 * Created by Yosep on 12/03/2018.
 */
public class CuentaCorriente {

    private int saldo;

    public int fondo;

    public CuentaCorriente(){

        this.saldo = 10000;

        this.fondo = 3000;

    }

    public int getSaldo(){

        return saldo;

    }

    public int getFondo(){

        return fondo;

    }

    public String earnMoney(){

        return "Ha relaidado un ingreso, su saldo es: " + (saldo + 1500);

    }

    public String receiveMoney(){

        return "Ha retirado su dinero, su saldo es: " + (saldo-800);

    }

    public String makeTransfer(){

        return "Ha hecho un ingreso";

    }

}
