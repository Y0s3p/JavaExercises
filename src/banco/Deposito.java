package banco;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Yosep on 12/03/2018.
 */
public class Deposito {

    private int deposito;

    private int accion_random;

    PrintWriter escribir = new PrintWriter("MovimientoBanco.txt");


    public Deposito(int id_user) throws FileNotFoundException{

        this.deposito = 3000;
        accion_random = (int) Math.floor(Math.random()*(1+3));

    }

    public void realizarAccion() throws FileNotFoundException {

        if (accion_random == 1){

            escribir.println("Su saldo es " + deposito);

        }else if (accion_random == 2){

            this.deposito = (int) Math.floor(Math.random()*(100+500));

            escribir.println("Ha realiado su ingreso, su saldo actual es de " + deposito);

        }else if (accion_random == 3){

            int retirarDinero = (int) Math.floor(Math.random()*(100+500));

            if (retirarDinero > deposito || deposito-retirarDinero < 3000){

                escribir.println("Saldo insuficiente. Comprueba que tiene saldo suficiente o en su deposito quedaria mas de 3000 euros");

            }else {

                escribir.println("Ha realiado una estraccion, su saldo actual es de " + deposito);

            }

        }

    }


}
