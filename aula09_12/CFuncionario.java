package aula09_12;

import java.util.Scanner;
    //herança
public class CFuncionario extends CUsuario{
    //atributos
    private int livrosCadastrados;

    //constructor
    public CFuncionario(String nome, int idade, int cpf, int livrosCadastrados) {
        super(nome, idade, cpf);
        this.livrosCadastrados = livrosCadastrados;
    }

    //sets e gets
    public int getLivrosCadastrados() {
        return livrosCadastrados;
    }
    public void setLivrosCadastrados(int livrosCadastrados) {
        this.livrosCadastrados = livrosCadastrados;
    }

    //metodos
    public CLivro cadastrarLivro(Scanner ler){
        System.out.println("Qual é o título do livro que vai ser cadastrado? ");
        String titulo = ler.nextLine();

        System.out.println("Qual é o autor do livro? ");
        String autor = ler.nextLine();

        System.out.println("De qual ano é do livro? ");
        int ano = Integer.parseInt(ler.nextLine());

        System.out.println("Qual o id do livro? ");
        int id = Integer.parseInt(ler.nextLine());

        System.out.println("Quantos livros vão ter? ");
        int quantidade = Integer.parseInt(ler.nextLine());

        CLivro novoLivro = new CLivro(titulo, autor, ano, id, quantidade);
        System.out.println("O livro foi cadastrado.");

        setLivrosCadastrados(getLivrosCadastrados() + 1);
        return novoLivro;
    }

    //metodos
    public CLivro fazerDevolucao(CLivro livroEmprestado){
        return livroEmprestado;
    }

    //sobrescrita
    @Override
    public void lerLivro(){
        System.out.println("´Então " + getNome() + " pegou um livro no seu intervalo e começou a ler:...´\n    Em um passado não tão distânte...");
    }

}
