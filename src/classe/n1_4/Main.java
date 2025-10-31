package classe.n1_4;

public class Main {
    public static void main(String[] args) {
        CBancoFinanceiro gustavo = new CBancoFinanceiro(10);
        gustavo.Depositar(5);
        gustavo.VerSaldo();
        gustavo.Sacar(0);
        gustavo.VerSaldo();
        gustavo.Transferir(0);
        gustavo.VerSaldo();
    }
}
