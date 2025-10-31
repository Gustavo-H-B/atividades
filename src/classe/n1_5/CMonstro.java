package classe.n1_5;

public class CMonstro {

    private String nome;
    private double vida;
    private double ataque;
    private int vitorias;
    private int derrotas;
    private int empates;

    public CMonstro(String nome, double vida, double ataque, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public double getVida() {
        return vida;
    }
    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAtaque() {
        return ataque;
    }
    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public double atacar(double dano){
        setVida(getVida() - dano);
        return dano;
    }

    public void status() {
        System.out.println("Nome: " + getNome() + ";\nVida: " + getVida() + ";");
    }

    public void vencer(){
        setVitorias(getVitorias() + 1);
    }
    public void perder(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatar(){
        setEmpates(getEmpates() + 1);
    }
}