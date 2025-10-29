package classe.n1_3;
public class LixeiraClasse {
    //atributos
    private String cor;
    private String recicla;
    private int quantidade;
    private boolean tampado;

    public LixeiraClasse(String cores, String tipoLixo, int quantasLixos, boolean tampar) {
        this.cor = cores;
        this.recicla = tipoLixo;
        this.quantidade = quantasLixos;
        this.tampado = tampar;
    }

    //metodos
    public String getCor() {
        return this.cor;
    }
    public void setCor(String mudarCor) {
        this.cor = mudarCor;
    }

    public String getReclicla() {
        return this.recicla;
    }
    public void setRecicla(String qualLixo) {
        this.recicla = qualLixo;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
    public void setQuantidade(int latas) {
        this.quantidade = latas;
    }

    public boolean getTampado() {
        return this.tampado;
    }
    public void setTampado(boolean aberto) {
        this.tampado = aberto;
    }

    public void status(){
        System.out.println("A cor da lixeira é: " + getCor() + ";");
        System.out.println("A lixeira recicla tipos de " + getReclicla() + ";");
        System.out.println("Existem " + getQuantidade() + " dessa(s) lixeira(s) pelo mundo;");
        System.out.println("A lixeira está aberta no momento? " + getTampado() + ";");
    }
}
