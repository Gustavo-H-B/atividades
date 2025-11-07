package heranca.n1_6e7;

public class CTecnico extends CAluno{
    private String registroProfissional;

    public CTecnico(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public CTecnico(String nome, int idade, String sexo, int matricula, String registroProfissional) {
        super(nome, idade, sexo, matricula, registroProfissional);
        this.registroProfissional = registroProfissional;
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }
    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    @Override
    public String toString() {
        return "CTecnico{" +
                "registroProfissional='" + registroProfissional + '\'' +
                '}';
    }

    public void praticar() {
        System.out.println("Estudando...\n...Estudando...\n...");
    }
}
