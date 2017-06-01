/**
 * Created by ericcalasans on 31/05/17.
 */
public class Testes {
    public static void main(String[] args) {
        Letra l = new Letra("a");
        String md5 = l.getMd5Code();
        System.out.println(md5);
        Letra ll = Database.getLetra(md5);
        System.out.println(ll.getCaractere());

    }
}
