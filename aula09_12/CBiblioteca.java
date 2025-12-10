package aula09_12;

import java.util.ArrayList;

public class CBiblioteca {
    //array
    private ArrayList<CLivro> estante = new ArrayList<>();

    //sets e gets
    public ArrayList<CLivro> getEstante() {
        return estante;
    }
    public void setEstante(ArrayList<CLivro> estante) {
        this.estante = estante;
    }

    //metodos
    public void guardarNovoLivro(CLivro novoLivro){
        this.estante.add(novoLivro);
        System.out.println("O livro: " + novoLivro.getTitulo() + " agora está disponível para emprestimo.");
    }

    //sobrecarga
    public CLivro buscarLivro(String tituloBusca) {
        for (CLivro livro : this.estante) {
            if (livro.getTitulo().equalsIgnoreCase(tituloBusca)) {
                return livro;
            }
        }
        return null;
    }
    //sobrecarga
    public CLivro buscarLivro(int idBusca) {
        for (CLivro livro : this.estante) {
            if (livro.getId() == idBusca) {
                return livro;
            }
        }
        return null;
    }

    //metodos
    public CLivro emprestarLivro(int categoria){
        CLivro livroRetirado = estante.remove(categoria);
        String titulo = livroRetirado.getTitulo();
        System.out.println("Um livro: ´" + titulo + "´, foi retirado da estante.");
        return livroRetirado;
    }

    public void devolverLivro(CLivro livroEmprestado){
        estante.add(livroEmprestado);
    }
}