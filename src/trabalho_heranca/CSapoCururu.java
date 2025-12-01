package trabalho_heranca;

public class CSapoCururu extends CSapo {
    private boolean feliz;

    public CSapoCururu(String apelido, String cor, double puloAltura, int idadeDeSapo, boolean feliz) {
        super(apelido, cor, puloAltura, idadeDeSapo);
        this.feliz = feliz;
    }

    public boolean isFeliz() {
        return feliz;
    }
    public void setFeliz(boolean feliz) {
        this.feliz = feliz;
    }

    @Override
    public void pular () {
        if (feliz) {
            System.out.println(getApelido() + " ficou pulando e pulando....pulando....e....pulando...🤣");
        } else {
            System.out.println(getApelido() + " pulou uma vez e ainda tropeçou...😔");
        }
    }

    public void comer () {
        if (feliz) {
            System.out.println(getApelido() + " comeu uma família inteira de moscas...😋");
        } else {
            System.out.println(getApelido() + " comeu um mosquito...e cuspiu fora...🤮");
        }
    }

    public void andar () {
        if (feliz) {
            System.out.println(getApelido() + " caminhou todo pomposo...😁");
        } else {
            System.out.println(getApelido() + " andou 10 passos e parou...😰");
        }
    }
}