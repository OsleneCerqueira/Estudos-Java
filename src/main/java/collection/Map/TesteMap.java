package collection.Map;

//Set não deixa adicionar, o Map sobreescreve ;
import java.util.HashMap;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, String> contas = new HashMap<>();

        contas.put("Conta Corrente" , "Samuel");
        contas.put("Conta Pagamento" , "Oslene");
        contas.put("Conta Poupança" , "Paula");
        contas.put("Conta Poupança" , "Paula2");

        System.out.println(contas);
        System.out.println(contas.get("Conta Corrente"));

        System.out.println(contas.keySet());

    }
}
