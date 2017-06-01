import java.util.ArrayList;

/**
 * Created by ericcalasans on 01/06/17.
 */
public class Database {
    public static final ArrayList<Letra> caracteres;
    static
    {
        caracteres = new ArrayList<Letra>();

        Letra l = null;

        for(int i = 0; i < 128; i++){
            l = new Letra(Character.toString((char) i));
            caracteres.add(l);
        }
    }

    public static Letra getLetra(String md5){
        Letra resultado = null;

        for(Letra l : caracteres){
            if(l.getMd5Code() == md5){
                resultado = l;
            }
        }

        return resultado;
    }
}
