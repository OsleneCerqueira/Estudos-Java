package collection.set;

//O set identifica que o hash é o mesmo e não adiciona/imprime


import java.util.HashSet;
import java.util.Set;

public class TesteSet {
    public static void main(String[] args) {

        Set<String> contas = new HashSet<>();

        contas.add("Conta Poupança");
        contas.add("Contas Correntes");
        contas.add("Contas Pagamentos");
        contas.add("Contas Correntes");

        contas.forEach( conta ->{
            System.out.println(conta);
            System.out.println(conta.hashCode());
        });




    }
}
