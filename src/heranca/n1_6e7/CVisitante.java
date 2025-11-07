package heranca.n1_6e7;

public class CVisitante extends CPessoa{
    public CVisitante(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public String toString() {
        return "Visitante...";
    }
}
