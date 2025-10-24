package classe.n1_1;
import java.util.Scanner;

public class SaposClasse {
    Scanner leia = new Scanner(System.in);
    String mudar;
    int valor;
    String talvez;

    //classe Sapo
    //atributos
    public double tamanho;
    public String cor;
    private boolean sono;
    private boolean fome;
    private int energia;

    //metodos
    void publico () {
        System.out.println("Deseja mudar o que?\nSono\nFome\nEnergia");
        mudar = leia.next();
        if (this.mudar.equalsIgnoreCase("Energia")){
            System.out.println("Qual vai ser a energia?");
            valor = leia.nextInt();
            energia = valor;
        }
        if (this.mudar.equalsIgnoreCase("Sono")) {
            System.out.println("O sapo está com sono?\n(true / false)");
            talvez = leia.next();
            if (this.talvez.equalsIgnoreCase("True")) {
                this.sono = true;
            } else if (this.talvez.equalsIgnoreCase("False")) {
                this.sono = false;
            }
        }
        if (this.mudar.equalsIgnoreCase("Fome")){
            System.out.println("O sapo está com fome?\n(true / false)");
            talvez = leia.next();
            if (this.talvez.equalsIgnoreCase("True")){
                this.fome = true;
            } else if (this.talvez.equalsIgnoreCase("False")){
                this.fome = false;
            }
        }
    }

    void situacao () {
        if (this.fome == true){
            this.energia = this.energia - 2;
            System.out.println("O sapo está com fome...");
        }
        if (this.sono == true){
            this.energia = this.energia - 5;
            System.out.println("O sapo está com sono...");
        }
    }

    void salto () {
        if (this.energia < 2){
            System.out.println("O sapo não tem energia suficiente para saltar...");
        } else {
            System.out.println("O sapo deu um salto...");
            this.energia = this.energia - 2;
            System.out.println("A energia do sapo está em: " + this.energia);
        }
    }

    void nadar () {
        if (this.energia < 5) {
            System.out.println("O sapo não tem energia suficiente para nadar...");
        } else {
            System.out.println("O sapo está nadando...");
            this.energia = this.energia - 5;
            System.out.println("A energia do sapo está em: " + this.energia);
        }
    }

    void andar () {
        if (this.energia < 1) {
            System.out.println("O sapo não tem energia suficiente para andar...");
        } else {
            System.out.println("O sapo está andando...");
            this.energia = this.energia - 1;
            System.out.println("A energia do sapo está em: " + this.energia);
        }
    }

    void comer () {
        System.out.println("O sapo está comendo moscas... e mais moscas...");
        this.energia = this.energia + 15;
        System.out.println("A energia do sapo está em: " + this.energia);
    }

    void status () {
        System.out.println("A cor do sapo é: " + this.cor);
        System.out.println("O tamanho do sapo é: " + this.tamanho + "cm");
        System.out.println("O sapo está com sono? " + this.sono);
        System.out.println("O sapo está fome? " + this.fome);
        System.out.println("A energia do sapo está em: " + this.energia);
    }
}