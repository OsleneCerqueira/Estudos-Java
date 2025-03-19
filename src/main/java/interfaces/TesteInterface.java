package interfaces;

public class TesteInterface {
    public static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar( 5000.00);
        System.out.println("Saldo após deposito: " + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.sacar( 15000.00);
        System.out.println("Saldo após saque: " + contaPoupanca.getSaldo());
    }
}

