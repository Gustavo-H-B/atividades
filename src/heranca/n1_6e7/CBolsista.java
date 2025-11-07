package heranca.n1_6e7;

public class CBolsista extends CAluno{
    private double bolsa;

    public CBolsista(String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo, matricula, curso);
    }

    public CBolsista(String nome, int idade, String sexo, int matricula, String curso, double bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "CBolsista{" +
                "bolsa=" + bolsa +
                '}';
    }

    public void pagarMensalidade() {
        System.out.println("Menos um boleto......");
    }

    public void renovar() {
        System.out.println("...Renovado...");
    }
}
