package aula09_12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        CBiblioteca biblioteca = new CBiblioteca();
        CFuncionario funcionario = new CFuncionario("Ana", 20, 123456789, 0);
        CLeitor leitor = new CLeitor("Gustavo", 19, 987654321, 1);

        CLivro livro1 = funcionario.cadastrarLivro(ler);
        biblioteca.guardarNovoLivro(livro1);

        int indiceParaEmprestimo = 0;

        CLivro livroEmprestado = biblioteca.emprestarLivro(indiceParaEmprestimo);

        leitor.pegarLivro(livroEmprestado);

        System.out.println("Acervo Atual: " + biblioteca.getEstante().size() + " livro(s) disponíveis.");

        leitor.lerLivro();
        String critica = leitor.opinar(ler);
        System.out.println("Opinião de " + leitor.getNome() + " registrada: " + critica);

        CLivro livroDevolvido = leitor.devolverLivro(livroEmprestado);
        funcionario.fazerDevolucao(livroDevolvido);
        biblioteca.devolverLivro(livroDevolvido);

        System.out.println("Acervo Atual: " + biblioteca.getEstante().size() + " livro(s) disponíveis.");
        funcionario.lerLivro();

        CLivro livroEncontradoPorTitulo = biblioteca.buscarLivro("Era uma vez...");
        if (livroEncontradoPorTitulo != null) {
            System.out.println("Livro encontrado! Título: " + livroEncontradoPorTitulo.getTitulo());
            System.out.println("ID: " + livroEncontradoPorTitulo.getId() + ", Autor: " + livroEncontradoPorTitulo.getAutor());
        } else {
            System.out.println("Livro não encontrado pelo título.");
        }

        CLivro livroEncontradoPorId = biblioteca.buscarLivro(1);
        if (livroEncontradoPorId != null) {
            System.out.println("Livro encontrado! Título: " + livroEncontradoPorId.getTitulo());
            System.out.println("ID: " + livroEncontradoPorId.getId() + ", Autor: " + livroEncontradoPorId.getAutor());
        } else {
            System.out.println("Livro não encontrado pelo ID.");
        }

        ler.close();
    }
}