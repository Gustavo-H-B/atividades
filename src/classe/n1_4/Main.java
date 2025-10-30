package classe.n1_4;

public class Main {
    public static void main(String[] args) {
        CBancoFinanceiro gustavo = new CBancoFinanceiro(0);
        gustavo.Depositar(100);
        gustavo.VerSaldo();
        gustavo.Sacar(10);
        gustavo.VerSaldo();
        gustavo.Transferir(20);
        gustavo.VerSaldo();
    }
}
