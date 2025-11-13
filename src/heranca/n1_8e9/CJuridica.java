package heranca.n1_8e9;

public class CJuridica extends CPessoa{
    private String cnpj;

    public CJuridica(String nome, String endereco, String telefone, String cnpj) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void gravar(String email) {
        System.out.println("Você cadastrou seu email corporativo.");
    }

    public void gravar(double randaEmpresa) {
        System.out.println("Você depositou a renda de sua empresa.");
    }

    public void gravar(String endereco, String telefone) {
        System.out.println("Você cadastrou seu endereço e telefone corporativos.");
    }
}
