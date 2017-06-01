import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by ericcalasans on 01/06/17.
 */
public class ServerDatabase {
    public static final ArrayList<ArrayList<Conta>> contas;
    public static final int N = 100;

    static{
        contas = new ArrayList<ArrayList<Conta>>();
        for(int i = 0; i < N; i++){
            contas.add(new ArrayList<Conta>());
        }
    }

    public static int hashCode(String md5){
        BigInteger bi = new BigInteger(md5, 16);
        BigInteger m = new BigInteger(Integer.toString(N), 10);
        int pos;
        pos = bi.mod(m).intValue();
        return pos;
    }

    public static void insereConta(Conta conta){
        int posicao = hashCode(conta.getMd5());

        ArrayList<Conta> posConta = contas.get(posicao);

        if(posConta.isEmpty()){
            posConta.add(conta);
        } else {
            for (Conta item : posConta) {
                if(item.getMd5() == conta.getMd5()){
                    break;
                } else {
                    posConta.add(conta);
                }
            }
        }

    }

    public static Conta getConta(String md5){
        Conta resultado = null;

        int posicao = hashCode(md5);

        ArrayList<Conta> posConta = contas.get(posicao);

        for(Conta item : posConta){
            if(item.getMd5() == md5){
                resultado = item;
                break;
            }
        }

        return resultado;
    }
}
