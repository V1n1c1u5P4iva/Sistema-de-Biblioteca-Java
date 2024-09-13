package principal;

import java.util.Scanner;
import sistema.Biblioteca;

public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem Vindo!");
        String menu = """
                Escolha a opção:
                [1] Cadastrar Livro
                [2] Listar os livros disponíveis
                [3] Emprestar um livro
                [4] Devolver o livro emprestado
                [5] Exibir informações de um livro
                [6] Sair 
                """;

        while (true) {
            System.out.println(menu);
            int op = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println();

            switch (op) {
                case 1:
                    System.out.println("Digite o título:");
                    String titulo = scanner.nextLine();
                    System.out.println("Digite o nome do autor:");
                    String autor = scanner.nextLine();
                    biblioteca.cadastrarLivro(titulo, autor);
                    System.out.println();
                    break;

                case 2:
                    biblioteca.listaLivros();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Digite o título do livro a ser emprestado:");
                    titulo = scanner.nextLine();
                    biblioteca.emprestarLivro(titulo);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Digite o título do livro a ser devolvido:");
                    titulo = scanner.nextLine();
                    biblioteca.devolverLivro(titulo);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Digite o título do livro:");
                    titulo = scanner.nextLine();
                    biblioteca.exibirInformacoesLivro(titulo);
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Obrigado, até a próxima!");
                    scanner.close();
                    System.out.println();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
                    break;
            }
        }
    }
}
