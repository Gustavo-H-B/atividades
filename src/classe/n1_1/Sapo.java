package classe.n1_1;
public class Sapo {
    public static void main(String[] args) {
        SaposClasse rex = new SaposClasse();

        rex.cor = "Verde";
        rex.sono = false;
        rex.fome = false;
        rex.energia = 100;
        rex.tamanho = 6;

        rex.status();

        rex.andar();
        rex.nadar();
        rex.salto();
        rex.comer();

        rex.status();

    }
}