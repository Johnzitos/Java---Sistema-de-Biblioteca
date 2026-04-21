package biblioteca1;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Biblioteca minhaBiblioteca = new Biblioteca("Biblioteca IF", "Campus Morrinhos");
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        ArrayList<Emprestimo> listaEmprestimos = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Biblioteca ===");
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Alugar Publicação");
            System.out.println("3 - Mostrar Informações da Publicação");
            System.out.println("4 - Cadastrar Publicação");
            System.out.println("5 - Renovar Empréstimo");
            System.out.println("6 - Devolver Empréstimo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = leitor.nextInt();

            if (opcao == 1) {
                System.out.println("\nTipo de Usuário: 1 - Comum | 2 - Especial");
                int tipo = leitor.nextInt();
                leitor.nextLine();

                System.out.print("Nome: ");
                String nome = leitor.nextLine();
                System.out.print("Telefone: ");
                String tel = leitor.nextLine();
                System.out.print("Email: ");
                String email = leitor.nextLine();
                System.out.print("CPF: ");
                String cpf = leitor.nextLine();

                if (tipo == 1) {
                    listaUsuarios.add(new UsuarioComum(nome, tel, email, cpf));
                    System.out.println("Usuário Comum cadastrado com sucesso!");
                } else {
                    listaUsuarios.add(new UsuarioEspecial(nome, tel, email, cpf));
                    System.out.println("Usuário Especial cadastrado com sucesso!");
                }
            } else if (opcao == 2) {

                leitor.nextLine();

                System.out.print("Qual é o CPF do usuário?: ");
                String cpfBuscado = leitor.nextLine();
                Usuario usuarioEncontrado = null;

                for (Usuario u : listaUsuarios) {
                    if (u.getCpf().equals(cpfBuscado)) {
                        usuarioEncontrado = u;
                        break;
                    }
                }

                System.out.print("Qual é o título da publicação?: ");
                String tituloBuscado = leitor.nextLine();

                Publicacao pubEncontrada = minhaBiblioteca.buscarPublicacao(tituloBuscado);

                if (usuarioEncontrado != null && pubEncontrada != null) {
                    if (!pubEncontrada.isDisponivel()) {
                        System.out.println("Desculpe, esta publicação já está emprestada.");
                    } else if (!usuarioEncontrado.podeEmprestar()) {
                        System.out.println("Usuário comum já possui um empréstimo ativo. Devolva antes de pegar outro.");
                    } else {
                        Emprestimo novoEmprestimo = new Emprestimo(pubEncontrada, usuarioEncontrado);
                        usuarioEncontrado.adicionarEmprestimo(novoEmprestimo);
                        listaEmprestimos.add(novoEmprestimo);
                        System.out.println("Empréstimo realizado com sucesso!");
                    }
                } else {
                    System.out.println("Erro: Usuário ou Publicação não encontrados no sistema.");
                }

            } else if (opcao == 3) {
                leitor.nextLine();
                System.out.println("Digite o nome da publicação: ");
                String tituloBuscado = leitor.nextLine();

                minhaBiblioteca.mostrarAcervo(tituloBuscado);

            } else if (opcao == 4) {
                leitor.nextLine();

                System.out.println("Tipo de Publicação: 1 - Artigo | 2 - Livro | 3 - Tese");
                int tipoPub = leitor.nextInt();
                leitor.nextLine();

                System.out.print("Título: ");
                String titulo = leitor.nextLine();
                System.out.print("Data: ");
                String data = leitor.nextLine();
                System.out.print("Valor da Multa: ");
                double multa = leitor.nextDouble();
                leitor.nextLine();

                if (tipoPub == 1) {
                    System.out.print("Resumo: ");
                    String resumo = leitor.nextLine();
                    Artigo novoArtigo = new Artigo(resumo, data, titulo, multa);
                    minhaBiblioteca.adicionarPublicacao(novoArtigo);
                    System.out.println("Artigo adicionado ao acervo!");
                } else if (tipoPub == 2) {
                    System.out.print("Número da Edição: ");
                    int edicao = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Editora: ");
                    String editora = leitor.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = leitor.nextLine();
                    Livro novoLivro = new Livro(edicao, editora, isbn, data, titulo, multa);
                    minhaBiblioteca.adicionarPublicacao(novoLivro);
                    System.out.println("Livro adicionado ao acervo!");
                } else if (tipoPub == 3) {
                    System.out.print("Número de Páginas: ");
                    int paginas = leitor.nextInt();
                    leitor.nextLine();
                    System.out.print("Resumo: ");
                    String resumo = leitor.nextLine();
                    System.out.print("Data da Defesa: ");
                    String dtDefesa = leitor.nextLine();
                    System.out.print("Instituição: ");
                    String instituicao = leitor.nextLine();
                    Tese novaTese = new Tese(paginas, resumo, dtDefesa, instituicao, data, titulo, multa);
                    minhaBiblioteca.adicionarPublicacao(novaTese);
                    System.out.println("Tese adicionada ao acervo!");
                }

            } else if (opcao == 5) {
                leitor.nextLine();
                System.out.print("Qual o título da publicação que deseja renovar?: ");
                String tituloRenovar = leitor.nextLine();
                boolean encontrou = false;

                for (Emprestimo emp : listaEmprestimos) {
                    if (emp.getPublicacao().getTitulo().equals(tituloRenovar) && !emp.isDevolvido()) {
                        emp.renovar();
                        encontrou = true;
                        break;
                    }
                }

                if (!encontrou) {
                    System.out.println("Nenhum empréstimo ativo encontrado com esse título.");
                }
            } else if (opcao == 6) {

                leitor.nextLine();
                System.out.print("Qual o título da publicação que deseja devolver?: ");
                String tituloDevolver = leitor.nextLine();
                Emprestimo emprestimoParaRemover = null;

                for (Emprestimo emp : listaEmprestimos) {
                    if (emp.getPublicacao().getTitulo().equals(tituloDevolver) && !emp.isDevolvido()) {
                        emp.devolver();
                        emprestimoParaRemover = emp;
                        break;
                    }
                }

                if (emprestimoParaRemover != null) {
                    listaEmprestimos.remove(emprestimoParaRemover);
                } else {
                    System.out.println("Nenhum empréstimo ativo encontrado com esse título.");
                }
            }
        }
        System.out.println("Sistema encerrado.");
    }
}