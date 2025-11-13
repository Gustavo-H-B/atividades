package heranca.n1_8e9;

public abstract class CContaComum {
    private int numero;
    private double saldo;
    private String tipo;

    public CContaComum(int numero, double saldo, String tipo){
        this.numero = numero;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void sacar();

    public void depositar(double dinheiro){
        System.out.println("Você depositou " + dinheiro + "R$ na sua conta.");
    }
}
