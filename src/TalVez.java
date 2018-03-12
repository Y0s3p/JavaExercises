import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Yosep on 24/11/2017.
 */
public class TalVez {

    public static void main(String[] args){
        int verdadero = 1;
        int falso = -1;
        int talvez = 0;
        String respuesta;


            Scanner scanner = new Scanner(System.in);
            System.out.println("Elige entre conjuncion,disyuncion o negacion");
            respuesta = scanner.nextLine();
            respuesta = respuesta.toLowerCase();

            if (respuesta.equals("conjuncion")){

                System.out.println("Verdadero, falso o talvez");
                respuesta = scanner.nextLine();


                switch (respuesta) {

                    case "verdadero&&verdadero":
                        System.out.println("verdadero");
                        break;
                    case "verdadero&&talvez":
                        System.out.println("tal vez");
                        break;
                    case "verdadero&&falso":
                        System.out.println("falso");
                        break;
                    default:
                        break;

                }

                switch (respuesta) {

                    case "talvez&&verdadero":
                        System.out.println("tal vez");
                        break;
                    case "talvez&&talvez":
                        System.out.println("tal vez");
                        break;
                    case "talvez&&falso":
                        System.out.println("falso");
                        break;
                    default:
                        break;

                }

                switch (respuesta) {

                    case "falso&&verdadero":
                        System.out.println("falso");
                        break;
                    case "falso&&talvez":
                        System.out.println("falso");
                        break;
                    case "falso&&falso":
                        System.out.println("falso");
                        break;
                    default:
                        break;

                }

            }else if (respuesta.equals("disyuncion")) {

                System.out.println("Verdadero, falso o talvez");
                respuesta = scanner.nextLine();

                switch (respuesta) {

                    case "verdadero||verdadero":
                        System.out.println("verdadero");
                        break;
                    case "verdadero||talvez":
                        System.out.println("verdadero");
                        break;
                    case "verdadero||falso":
                        System.out.println("verdadero");
                        break;
                    default:
                        break;

                }

                switch (respuesta) {

                    case "talvez||verdadero":
                        System.out.println("verdadero");
                        break;
                    case "talvez||talvez":
                        System.out.println("tal vez");
                        break;
                    case "talvez||falso":
                        System.out.println("falso");
                        break;
                    default:
                        break;

                }

                switch (respuesta) {

                    case "falso||verdadero":
                        System.out.println("verdadero");
                        break;
                    case "falso||talvez":
                        System.out.println("tal vez");
                        break;
                    case "falso||falso":
                        System.out.println("falso");
                        break;
                    default:
                        break;

                }


            }else if (respuesta.equals("negacion")) {

                System.out.println("Verdadero, falso o talvez");
                respuesta = scanner.nextLine();

                if (respuesta.equals("verdadero")) {

                    System.out.println("falso");

                }else if (respuesta.equals("falso")) {

                    System.out.println("verdadero");

                }else if (respuesta.equals("talvez")) {

                    System.out.println("tal vez");

                }

            }

        }


    }

