package invasionMarciana;

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

    ArrayList<String> aux = new ArrayList<>();

    public ReadFile(){

        files = new String[6];
        ai = 0;

    }


    public void reedFiles() throws FileNotFoundException{

        Scanner sc = new Scanner( new File("C:\\Users\\Yosep\\Desktop\\ficheros\\invasion.txt"));

        while (sc.hasNextLine()){

            files[ai] = sc.nextLine();
            ai++;

        }

        sc.close();

    }

    public void orderFiles(){

        aux = new ArrayList<>(Arrays.asList(files));

        Collections.sort(aux, new MyComparator());

        String[] files2 = new String[aux.size()];
        files2 = aux.toArray(files2);

        for (int x = 0; x < files2.length; x++){
            System.out.println(files2[x]);
        }

    }

}
