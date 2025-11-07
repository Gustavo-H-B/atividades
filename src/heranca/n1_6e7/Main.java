package heranca.n1_6e7;

public class Main {
    public static void main(String[] args) {
        CTecnico gu = new CTecnico("gu", 19, "masculino", 6901, "anonimato");

        gu.pagarMensalidade();
        gu.praticar();
        System.out.println(gu.toString());
    }
}
