package aula09_12;

public class CLivro {
    //atributos
    private String titulo;
    private String autor;
    private int ano;
    private int id;
    private int quantidade;

    //constructor
    public CLivro(String titulo, String autor, int ano, int id, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.id = id;
        this.quantidade = quantidade;
    }

    //sets e gets
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}