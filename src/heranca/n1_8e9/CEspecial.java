package heranca.n1_8e9;

public class CEspecial extends CContaComum{
    private int limite;

    public CEspecial(int numero, double saldo, String tipo, int limite){
        super(numero, saldo, tipo);
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }
    public void setLimite(int limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(){
        System.out.println("Você sacou de seu saldo.");
    }
}
