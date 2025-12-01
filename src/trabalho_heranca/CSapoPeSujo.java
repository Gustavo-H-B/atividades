package trabalho_heranca;

public class CSapoPeSujo extends CSapoCururu{
    private int pocasPuladas;

    public CSapoPeSujo(String apelido, String cor, double puloAltura, int idadeDeSapo, boolean feliz, int pocasPuladas) {
        super(apelido, cor, puloAltura, idadeDeSapo, feliz);
        this.pocasPuladas = pocasPuladas;
    }

    public int getPocasPuladas() {
        return pocasPuladas;
    }
    public void setPocasPuladas(int pocasPuladas) {
        this.pocasPuladas = pocasPuladas;
    }

    public void mostrar () {
        System.out.println("Poças puladas até agora: " + getPocasPuladas());
    }

    @Override
    public void pular () {
        System.out.println(getApelido() + " pulou em várias poças de lama...3 poças.");
        setPocasPuladas(getPocasPuladas() + 3);
    }

    public void comer () {
        System.out.println(getApelido() + " comeu uma mosca com molho de lama de pântano...1 poça...");
        setPocasPuladas(getPocasPuladas() + 1);
    }

    public void andar () {
        System.out.println(getApelido() + " andou por cima de 2 poças grandes...");
        setPocasPuladas(getPocasPuladas() + 2);
    }
}