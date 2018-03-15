package compositor;


/**
 * Created by Yosep on 15/03/2018.
 */
public class NotaA extends Thread{

    private int randomA;

    AnotherClass another = new AnotherClass();

    Compas compas;

    public String notamusicalA;

    public NotaA(Compas compas){

        notamusicalA = "";
        this.compas = compas;

    }

    @Override
    public void run(){

        while (compas.compasA < 32){

            this.randomA =  (int) Math.ceil(Math.random() * 7);

            switch (randomA){

                case 1: notamusicalA = "Do ";
                    break;

                case 2: notamusicalA = "Re ";
                    break;

                case 3: notamusicalA = "Mi ";
                    break;

                case 4: notamusicalA = "Fa ";
                    break;

                case 5: notamusicalA = "Sol ";
                    break;

                case 6: notamusicalA = "La ";
                    break;

                case 7: notamusicalA = "Si ";
                    break;

                default: notamusicalA = "Error ";
                    break;
            }

            compas.turnoNotaA(notamusicalA);

            try{
                sleep(1000);
            }catch (InterruptedException e){}

        }

    }

}
