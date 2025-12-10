package aula09_12;

import java.util.Scanner;

public class CLeitor extends CUsuario{
    //atributos
    private int livrosLidos;
    private CLivro livroEmprestado = null;

    //constructor
    public CLeitor(String nome, int idade, int cpf, int livrosLidos) {
        super(nome, idade, cpf);
        this.livrosLidos = livrosLidos;
    }

    //sets e gets
    public int getLivrosLidos() {
        return livrosLidos;
    }
    public void setLivrosLidos(int livrosLidos) {
        this.livrosLidos = livrosLidos;
    }

    //metodos
    public String opinar(Scanner ler) {
        System.out.println("Digite sua crítica sobre o livro: ");
        String critica = ler.nextLine();
        return critica;
    }

    //sobrescrita
    @Override
    public void lerLivro(){
        System.out.println(getNome() + " começou a ler o livro ´" + livroEmprestado.getTitulo() + "´...\n     Era uma vez...");
        setLivrosLidos(getLivrosLidos() + 1);
    }

    //metodos
    public CLivro devolverLivro(CLivro livroEmprestado){
        System.out.println(getNome() + " devolveu o livro ´" + livroEmprestado.getTitulo() + "´.");
        return livroEmprestado;
    }
    public void pegarLivro(CLivro livroRetirado){
        this.livroEmprestado = livroRetirado;
        System.out.println(getNome() + " adquiriu o livro ´" + livroEmprestado.getTitulo() + "´.");
    }
}