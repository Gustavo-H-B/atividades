package classe.n1_4;

import java.security.PublicKey;

public interface IBancoFinanceiro {
    public abstract void Sacar();
    public abstract void Depositar();
    public abstract void VerSaldo();
    public abstract void Transferir();
}
