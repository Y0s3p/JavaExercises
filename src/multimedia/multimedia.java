package multimedia;

/**
 * Created by Yosep on 11/01/2018.
 */

public class multimedia {

    String titulo, autor;
    int duracion;
    private Formato formato;

    public multimedia(String titulo, String autor, int duracion, Formato formato){

        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.formato = formato;

    }

    public String getTitulo(){

        return titulo;

    }

    public String getAutor(){

        return autor;

    }

    public int getDuracion(){

        return duracion;

    }

    public Formato getFormato(){

        return formato;

    }

    @Override
    public String toString(){

        String informacion;

        informacion = "El autor es " + autor + " el titulo es " + titulo + " la duracion del archivo es " + duracion + " y es en formato " + formato;

        return informacion;

    }

    public boolean equal(Object multimedia){

        return true;

    }


}
