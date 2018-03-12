package diccionario;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Yosep on 30/11/2017.
 */
public class Diccionario {

    public static void main(String[] args){


        Hashtable asciMorse=new Hashtable();

        asciMorse.put('A',".-");
        asciMorse.put('B',"-...");
        asciMorse.put('C',"-.-.");
        asciMorse.put('D',"-..");
        asciMorse.put('E',".");
        asciMorse.put('F',"..-.");
        asciMorse.put('G',"--.");
        asciMorse.put('H',"....");
        asciMorse.put('I',"..");
        asciMorse.put('J',".---");
        asciMorse.put('K',"-.-");
        asciMorse.put('L',".-..");
        asciMorse.put('M',"--");
        asciMorse.put('N',"-.");
        asciMorse.put('O',"---");
        asciMorse.put('P',".--.");
        asciMorse.put('Q',"--.-");
        asciMorse.put('R',".-.");
        asciMorse.put('S',"...");
        asciMorse.put('T',"-");
        asciMorse.put('U',"..-");
        asciMorse.put('V',"...-");
        asciMorse.put('W',".--");
        asciMorse.put('X',"-..-");
        asciMorse.put('Y',"-.--");
        asciMorse.put('Z',"--..");


        String frase;
        String morse = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca una frase");

        frase = entrada.next();

        frase = frase.toUpperCase();

        for (int i = 0; i<frase.length(); i++){

            morse += (String) asciMorse.get(frase.charAt(i));

        }
        System.out.print(morse);


    }

}
