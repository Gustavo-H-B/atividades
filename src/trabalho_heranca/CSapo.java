package trabalho_heranca;

public abstract class CSapo {
    protected String apelido;
    protected String cor;
    protected double puloAltura;
    protected int idadeDeSapo;

    public CSapo(String apelido, String cor, double puloAltura, int idadeDeSapo) {
        this.apelido = apelido;
        this.cor = cor;
        this.puloAltura = puloAltura;
        this.idadeDeSapo = idadeDeSapo;
    }

    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPuloAltura() {
        return puloAltura;
    }
    public void setPuloAltura(double puloAltura) {
        this.puloAltura = puloAltura;
    }

    public int getIdadeDeSapo() {
        return idadeDeSapo;
    }
    public void setIdadeDeSapo(int idadeDeSapo) {
        this.idadeDeSapo = idadeDeSapo;
    }

    public abstract void pular();

    public abstract void comer();

    public abstract void andar();
}