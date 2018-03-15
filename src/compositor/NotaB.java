package compositor;

/**
 * Created by Yosep on 15/03/2018.
 */
public class NotaB extends Thread {

    private int randomB;

    private String notamusicalB;

    Compas compas;

    public NotaB(Compas compas){

        this.compas = compas;

    }

    @Override
    public void run(){

        while (compas.compasB < 32){

            this.randomB = (int) Math.ceil(Math.random() * 7);

            switch (randomB){

                case 1: notamusicalB = "Do ";
                    break;

                case 2: notamusicalB = "Re ";
                    break;

                case 3: notamusicalB = "Mi ";
                    break;

                case 4: notamusicalB = "Fa ";
                    break;

                case 5: notamusicalB = "Sol ";
                    break;

                case 6: notamusicalB = "La ";
                    break;

                case 7: notamusicalB = "Si ";
                    break;

                default: notamusicalB = "Error ";
                    break;
            }

            compas.turnoNotaB(notamusicalB);

            try{
                sleep(1000);
            }catch (InterruptedException e){}

        }


    }

}
