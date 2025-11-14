package heranca.n1_8e9;

public class Main {
    public static void main(String[] args) {
        CFisica gu = new CFisica("gustavo", "rua_pantano", "8002-8922", "123.231.321-00");
        CJuridica amigo = new CJuridica("luan", "rua apartamento", "0800-0001", "01.234.567/765-43");
        CEspecial guConta = new CEspecial(012345, 69.96, "corrente", 690);
        CPoupanca amigoConta = new CPoupanca(543210, 1.0, "baú de tessouro", "10/10/2004");

        gu.gravar("email.com");
        gu.gravar(true);
        gu.gravar("rua lua","0000-0000");

        amigo.gravar("gmail.only");
        amigo.gravar(1.0);
        amigo.gravar("rua judas bateu as botas","3210-0123");

        guConta.sacar();

        amigoConta.sacar();
    }
}
