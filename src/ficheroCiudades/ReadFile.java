package ficheroCiudades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by Yosep on 08/03/2018.
 */
public class ReadFile {

    private String[] files;
    private int ai;
    private ArrayList<String> auxiliar = new ArrayList<>();

    public ReadFile(){

        files = new String[6];
        ai = 0;

    }


    /**
     *La clase reedFiles se encarga de leer el fichero que contiene los datos con los que trabajaremos asi como el almacenar estos datos en el Array files.
     *
     * @throws FileNotFoundException
     */
    public void reedFiles() throws FileNotFoundException{

        Scanner sc = new Scanner( new File("C:\\Users\\Yosep\\Desktop\\ficheros\\invasion.txt"));

        //Se va a encargar leer el objeto sc ademas de almacenar los datos que contiene en files mientras haya una siguiente linea en el.
        while (sc.hasNextLine()){

            files[ai] = sc.nextLine();
            ai++;

        }

        sc.close();

    }

    /**
     * orderFiles creara el ArrayList el cual alamacenara los datos que contiene file. Luego llamaremos al metodo sort de la clase Collection dentro de Comparator implementada
     * en la clase MyComparator, a la cual le pasaremos el ArrayList auxiliar para que lo ordene.
     * Una vez ordenado vamos a crear el Array subfile inicializado a la longitud del ArrayList.
     * A continuacion le indicamos que subfile sera igual a metodo toArray de auxiliar.
     * Por ultimo realizamos un bucle para mostrar el contenido de subfiles.
     */
    public void orderFiles(){

        auxiliar = new ArrayList<>(Arrays.asList(files));

        Collections.sort(auxiliar, new MyComparator());

        String[] subFiles = new String[auxiliar.size()];
        subFiles = auxiliar.toArray(subFiles);

        for (int x = 0; x < subFiles.length; x++){
            System.out.println(subFiles[x]);
        }

    }

}
