package heranca.n1_8e9;

public class CHistorico{
    private int numeroConta;
    private String tipoConta;

    public CHistorico(int numeroConta, String tipoConta) {
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void atualizar(){
        System.out.println("Histórico do banco atualizado.");
    }
}
