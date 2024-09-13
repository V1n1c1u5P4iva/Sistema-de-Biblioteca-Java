package sistema;

public class Biblioteca {

    private Livro[] livros;
    private int capacidadeMaxima;
    private int totalLivros;

    // Construtor
    public Biblioteca(int capacidadeMaxima) {
        this.livros = new Livro[capacidadeMaxima];
        this.totalLivros = 0;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    // Cadastra um livro na biblioteca
    public void cadastrarLivro(String titulo, String autor) {
        if (this.totalLivros >= this.capacidadeMaxima) {
            System.out.println("Erro: Capacidade máxima atingida.");
        } else {
            Livro novoLivro = new Livro(titulo, autor);
            livros[totalLivros] = novoLivro;
            totalLivros++;
        }
    }

    // Lista os livros disponíveis na biblioteca
    public void listaLivros() {
        System.out.println("Livros disponíveis na biblioteca:");
        for (Livro livro : livros) {
            if (livro != null && !livro.isEmprestado()) {
                System.out.println(livro.getTitulo());
            }
        }
    }

    // Realiza o empréstimo de um livro
    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro != null && titulo.equals(livro.getTitulo())) {
                if (livro.emprestar()) {
                    System.out.println("Livro emprestado com sucesso!");
                } else {
                    System.out.println("Livro não está disponível!");
                }
                return;
            } 
        }
        System.out.println("Livro não encontrado.");
    }

    // Realiza a devolução de um livro
    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro != null && titulo.equals(livro.getTitulo())) {
                if (livro.remover()) {
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Livro não foi emprestado!");
                }
                return;
            }   
        }
        System.out.println("Livro não encontrado.");
    }

     // Exibe as informações de um livro
    public void exibirInformacoesLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro != null && titulo.equals(livro.getTitulo())) {
                livro.exibirInformacoes();
                return;
            }
        }
        System.out.println("Livro não encontrado no acervo.");
    }
}
