package aula_1.anonimas;

//public class CarteiraContas {

 //   Conta contaCorrente = imprimeTipoConta() -> {
 //       System.out.println("Conta Corrente");
 //   }
//}

public class CarteiraContas {

    Conta contaCorrente = new Conta() {
        @Override
        public void imprimeTipoConta(){
            System.out.println("Conta Corrente");
        }

    };

    Conta contaPoupanca = new Conta() {
        @Override
        public void imprimeTipoConta(){
            System.out.println("Conta Poupanca");
        }

    };
}
