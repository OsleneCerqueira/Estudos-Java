package collection.lista;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
    public static void main(String[] args) {

        List<String> contas = new ArrayList();

        contas.add("Conta Poupança");
        contas.add("Contas Correntes");
        contas.add("Contas Pagamentos");

        System.out.println(contas.get(0));
        System.out.println(contas.get(1));
        System.out.println(contas.get(2));

    }
}
