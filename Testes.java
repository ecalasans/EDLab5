/**
 * Created by ericcalasans on 31/05/17.
 */
public class Testes {
    public static void main(String[] args) {
        Conta c = new Conta("1234", "2222","1245");
        ServerDatabase.insereConta(c);
        String chave = SecurityProvider.md5ToServer(c);
        System.out.println(chave);
        Conta conta = ServerDatabase.getConta(chave);
        System.out.println(conta);
    }
}
