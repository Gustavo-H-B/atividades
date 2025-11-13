package heranca.n1_8e9;

public class CFisica extends CPessoa{
    private String cpf;

    public CFisica(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void gravar(String email) {
        System.out.println("Você cadastrou seu email.");
    }

    public void gravar(boolean portabilidade) {
        if (portabilidade) {
            System.out.println("Você ativou a portabilidade.");
        } else {
            System.out.println("Você desativou a portabilidade.");
        }
    }

    public void gravar(String endereco, String telefone) {
        System.out.println("Você cadastrou seu endereço e telefone.");
    }
}
