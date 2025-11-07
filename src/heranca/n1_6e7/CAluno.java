package heranca.n1_6e7;

public class CAluno extends CPessoa{
    private int matricula;
    private String curso;

    public CAluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public CAluno (String nome, int idade, String sexo, int matricula, String curso) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "CAluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }

    public void pagarMensalidade() {
        System.out.println("Menos um boleto......");
    }
}
