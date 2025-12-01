package trabalho_heranca;

public class CSapoFaminto extends CSapo{
    private int moscasGuardadas;

    public CSapoFaminto(String apelido, String cor, double puloAltura, int idadeDeSapo, int moscasGuardadas) {
        super(apelido, cor, puloAltura, idadeDeSapo);
        this.moscasGuardadas = moscasGuardadas;
    }

    public int getMoscasGuardadas() {
        return moscasGuardadas;
    }
    public void setMoscasGuardadas(int moscasGuardadas) {
        this.moscasGuardadas = moscasGuardadas;
    }

    public void mostrar() {
        System.out.println("Moscas na pochete: " + getMoscasGuardadas());
    }

    @Override
    public void pular () {
        System.out.println(getApelido() + " pulou na direção de uma mosca... + 1 mosca.");
        setMoscasGuardadas(getMoscasGuardadas() + 1);
    }

    public void comer () {
        System.out.println(getApelido() + " comeu todas as moscas que tinha...");
        setMoscasGuardadas(getMoscasGuardadas() * 0);
    }

    public void andar () {
        System.out.println(getApelido() + " está procurando mais moscas... + 5 moscas.");
        setMoscasGuardadas(getMoscasGuardadas() + 5);
    }
}