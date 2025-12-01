package trabalho_heranca;

public class CSapoQualquer extends CSapo{
    public CSapoQualquer(String apelido, String cor, double puloAltura, int idadeDeSapo) {
        super(apelido, cor, puloAltura, idadeDeSapo);
    }

    @Override
    public void pular () {}

    public void comer () {}

    public void andar () {}
}