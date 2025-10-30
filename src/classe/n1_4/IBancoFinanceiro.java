package classe.n1_4;

import java.security.PublicKey;

public interface IBancoFinanceiro {
    public abstract double Sacar(double Valor);
    public abstract double Depositar(double Valor);
    public abstract void VerSaldo();
    public abstract double Transferir(double Valor);
}
