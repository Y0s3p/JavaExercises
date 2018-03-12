import java.util.Random;

/**
 * Created by Yosep on 20/10/2017.
 */
public class Ordenacion {

        public static void quickSort(int[] vector, int izquierda, int derecha) {
            int pivote = vector[izquierda];
            int i = izquierda;
            int j = derecha;
            int Intercambio;
            while (i < j) {
                while (vector[i] <= pivote && i < j) {
                    i++;
                }
                while (vector[j] > pivote) {
                    j--;
                }
                if (i < j) {
                    Intercambio = vector[i];
                    vector[i] = vector[j];
                    vector[j] = Intercambio;
                }
            }
            vector[izquierda] = vector[j];
            vector[j] = pivote;
            if (izquierda < j - 1) {
                quickSort(vector, izquierda, j - 1);
            }
            if (j + 1 < derecha) {
                quickSort(vector, j + 1, derecha);
            }
        }

        public static void main(String[] args) {
            int[] listaNumeros = new int[7];
            Random rnd = new Random();
            System.out.println("vectores.Lista desordenado");
            for (int i = 0; i < listaNumeros.length; i++) {
                listaNumeros[i] = rnd.nextInt(50);
                System.out.print(listaNumeros[i] + " ");
            }
            Ordenacion.quickSort(listaNumeros, 0, listaNumeros.length - 1);
            System.out.println("\nvectores.Lista Ordenado");
            for (int n : listaNumeros) {
                System.out.print(n + " ");
            }

        }

}
