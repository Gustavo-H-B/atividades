package classe.n1_1;
public class Sapo {
    public static void main(String[] args) {
        SaposClasse rex = new SaposClasse();

        rex.cor = "Verde";

        rex.publico();
        rex.publico();
        rex.publico();

        rex.tamanho = 6;

        rex.status();
        rex.situacao();

        rex.andar();
        rex.situacao();
        rex.nadar();
        rex.situacao();
        rex.salto();
        rex.situacao();
        rex.comer();
        rex.situacao();

        rex.status();

    }
}