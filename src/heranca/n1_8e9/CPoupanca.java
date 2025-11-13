package heranca.n1_8e9;

public class CPoupanca extends CContaComum{
    private String dataAniversario;

    public CPoupanca(int numero, double saldo, String tipo, String dataAniversario){
        super(numero, saldo, tipo);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }
    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
}
