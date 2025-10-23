package classe;

public class SaposClasse {
    //classe Sapo
    //atributos
    double tamanho;
    String cor;
    boolean sono;
    boolean fome;
    int energia;

    //metodos
    void statusEnergia() {
        if (this.energia <= 0) {
            System.out.println("O sapo está cansado...com fome...e com sono...");
            this.sono = true;
            this.fome = true;
        } else if (this.energia <= 50) {
            System.out.println("O sapo está começando a sentir fome...");
            this.energia = this.energia - 1;
        } else if (this.energia <= 25) {
            System.out.println("O sapo está começando a sentir-se cansado...");
            this.energia = this.energia - 2;
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
        this.energia = this.energia + 5;
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