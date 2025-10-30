package classe.n1_4;

public class Main {
    public static void main(String[] args) {
        CBancoFinanceiro gustavo = new CBancoFinanceiro(0) {
            public void Sacar() {
            }
            public void Depositar() {
            }
            public void Transferir() {
            }
            public void VerSaldo() {
            }
        };
        gustavo.Depositar();
        gustavo.VerSaldo();
        gustavo.Sacar();
        gustavo.VerSaldo();
        gustavo.Transferir();
        gustavo.VerSaldo();
    }
}
