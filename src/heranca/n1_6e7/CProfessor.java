package heranca.n1_6e7;

public class CProfessor extends CPessoa{
    private String especialidade;
    private double salario;

    public CProfessor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public CProfessor (String nome, int idade, String sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "CProfessor{" +
                "especialidade='" + especialidade + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void receberAumento() {
        System.out.println("Parabêns você teve um aumento!!!...\n...Ebaaaaaaaaaaa!!!!!");
    }
}
