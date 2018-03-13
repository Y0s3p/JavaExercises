package ficheroCiudades;

import java.io.IOException;

/**
 * Created by Yosep on 08/03/2018.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        ReadFile readFile = new ReadFile();

        readFile.reedFiles();
        readFile.orderFiles();


    }

}
