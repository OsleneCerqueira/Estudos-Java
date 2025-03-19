package collection.set;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Conta {

    private Long numero_conta;
    private Double saldo;

    @Override
    public int hashCode(){
        return numero_conta.hashCode();
    }
    @Override
    public boolean equals(Object  obj){
        Conta conta = (Conta) obj;
                return this.numero_conta.equals(conta.getNumero_conta());
    }

}
