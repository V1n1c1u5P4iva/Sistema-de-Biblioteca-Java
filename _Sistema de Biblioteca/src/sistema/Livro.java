package sistema;

public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private boolean emprestado;

   // Construtor

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }
    // Métodos

    public boolean emprestar() {
        if (!this.emprestado) {
            this.emprestado = true;
            return true;
        }
        return false;
    }

    public boolean remover() {
        if (this.emprestado) {
            this.emprestado = false;
            return true;
        }
        return false;
    }

    public void exibirInformacoes() {
        System.out.println("Informações do Livro");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println(this.emprestado ? "Emprestado" : "Disponivel");
    }

    // Getters e setters
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

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

}
