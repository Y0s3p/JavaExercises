package banco;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Yosep on 12/03/2018.
 */
public class CuentaCorriente {

    private int saldo;

    private int accion_random;

    PrintWriter escribir = new PrintWriter("MovimientoBanco.txt");

    public CuentaCorriente(int id_user) throws FileNotFoundException {

        this.saldo = 0;
        accion_random = (int) Math.floor(Math.random()*(1+4));

    }

    public void realizarAccion() throws FileNotFoundException {

        if (accion_random == 1){

            escribir.println("Su saldo es " + saldo);

        }else if (accion_random == 2){

            this.saldo = (int) Math.floor(Math.random()*(100+500));

            escribir.println("Ha realiado su ingreso, su saldo actual es de " + saldo);

        }else if (accion_random == 3){

            int retirarDinero = (int) Math.floor(Math.random()*(100+500));

            if (retirarDinero > saldo){

                escribir.println("Saldo insuficiente");

            }else {

                escribir.println("Ha realiado una estraccion, su saldo actual es de " + saldo);

            }

        }else if (accion_random == 4){

            int transferencia = (int) Math.floor(Math.random()*(100+500));

            if (transferencia > saldo){

                escribir.println("Saldo insuficiente");

            }else {

                this.saldo = saldo - transferencia;
                escribir.println("Ha realizado su transferencia con exito");
            }



        }

    }

}
