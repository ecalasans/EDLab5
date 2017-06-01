/**
 * Created by ericcalasans on 31/05/17.
 */
public class Testes {
    public static void main(String[] args) {
        Conta c = new Conta("124", "333", "1234","10", "john doe");
        ServerDatabase.insereConta(c);
        String chave = SecurityProvider.md5ToServer(c);
        Conta conta = ServerDatabase.getConta(chave);
        String chars[];
        chars = SecurityProvider.md5ToClient(conta);
        for(int i=0;i<chars.length;i++)
        {
            System.out.println(chars[i]);
        }

    }
}
