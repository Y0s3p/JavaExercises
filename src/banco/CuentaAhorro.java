package banco;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Yosep on 12/03/2018.
 */
public class CuentaAhorro {

    private int cuentaAhorro;

    private int accion_random;

    PrintWriter escribir = new PrintWriter("MovimientoBanco.txt");


    public CuentaAhorro(int id_user) throws FileNotFoundException {

        this.cuentaAhorro = 0;
        accion_random = (int) Math.floor(Math.random()*(1+3));

    }

    public void realizarAccion() throws FileNotFoundException {

        if (accion_random == 1){

            escribir.println("Su saldo es " + cuentaAhorro);

        }else if (accion_random == 2){

            this.cuentaAhorro = (int) Math.floor(Math.random()*(100+500));

            escribir.println("Ha realiado su ingreso, su saldo actual es de " + cuentaAhorro);

        }else if (accion_random == 3){

            int retirarDinero = (int) Math.floor(Math.random()*(100+500));

            if (retirarDinero > cuentaAhorro){

                escribir.println("Saldo insuficiente");

            }else {

                escribir.println("Ha realiado una estraccion, su saldo actual es de " + cuentaAhorro);

            }

        }

    }



}
