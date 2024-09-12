package REV_28_08;
import java.util.ArrayList;
import java.util.Scanner;

class Jogo {
    // Atributos privados
    private String titulo;
    private int classificacaoEtaria;
    private double preco;

    // Construtor
    public Jogo(String titulo, int classificacaoEtaria, double preco) {
        this.titulo = titulo;
        this.classificacaoEtaria = classificacaoEtaria;
        this.preco = preco;
    }

    // Métodos get e set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    public void setClassificacaoEtaria(int classificacaoEtaria) {
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método aplicarDesconto
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            preco -= preco * (percentual / 100);
        }
    }

    // Método aumentarPreco
    public void aumentarPreco(double percentual) {
        if (percentual > 0) {
            preco += preco * (percentual / 100);
        }
    }

    // Método atualizarClassificacao
    public void atualizarClassificacao(int novaClassificacao) {
        if (novaClassificacao >= 0) {
            classificacaoEtaria = novaClassificacao;
        }
    }

    // Método toString
    @Override
    public String toString() {
        return "Título: " + titulo + ", Classificação Etária: " + classificacaoEtaria + ", Preço: R$ " + String.format("%.2f", preco);
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jogo> listaJogos = new ArrayList<>();

        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Adicionar novo jogo");
            System.out.println("2. Aplicar desconto no jogo");
            System.out.println("3. Aumentar preço do jogo");
            System.out.println("4. Atualizar classificação etária do jogo");
            System.out.println("5. Mostrar detalhes dos jogos");
            System.out.println("6. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao) {
                case 1:
                    System.out.println("Informe o título do jogo:");
                    String titulo = scanner.nextLine();
                    System.out.println("Informe a classificação etária do jogo:");
                    int classificacao = scanner.nextInt();
                    System.out.println("Informe o preço do jogo:");
                    double preco = scanner.nextDouble();
                    listaJogos.add(new Jogo(titulo, classificacao, preco));
                    System.out.println("Jogo adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("Informe o título do jogo para aplicar o desconto:");
                    String tituloDesconto = scanner.nextLine();
                    Jogo jogoDesconto = buscarJogo(listaJogos, tituloDesconto);
                    if (jogoDesconto != null) {
                        System.out.println("Informe o percentual de desconto:");
                        double percentualDesconto = scanner.nextDouble();
                        jogoDesconto.aplicarDesconto(percentualDesconto);
                        System.out.println("Desconto aplicado com sucesso!");
                    } else {
                        System.out.println("Jogo não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Informe o título do jogo para aumentar o preço:");
                    String tituloAumento = scanner.nextLine();
                    Jogo jogoAumento = buscarJogo(listaJogos, tituloAumento);
                    if (jogoAumento != null) {
                        System.out.println("Informe o percentual de aumento:");
                        double percentualAumento = scanner.nextDouble();
                        jogoAumento.aumentarPreco(percentualAumento);
                        System.out.println("Preço aumentado com sucesso!");
                    } else {
                        System.out.println("Jogo não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Informe o título do jogo para atualizar a classificação etária:");
                    String tituloClassificacao = scanner.nextLine();
                    Jogo jogoClassificacao = buscarJogo(listaJogos, tituloClassificacao);
                    if (jogoClassificacao != null) {
                        System.out.println("Informe a nova classificação etária:");
                        int novaClassificacao = scanner.nextInt();
                        jogoClassificacao.atualizarClassificacao(novaClassificacao);
                        System.out.println("Classificação etária atualizada com sucesso!");
                    } else {
                        System.out.println("Jogo não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Detalhes dos jogos:");
                    for (Jogo jogo : listaJogos) {
                        System.out.println(jogo);
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        scanner.close();
    }

    // Método para buscar jogo pelo título
    public static Jogo buscarJogo(ArrayList<Jogo> listaJogos, String titulo) {
        for (Jogo jogo : listaJogos) {
            if (jogo.getTitulo().equalsIgnoreCase(titulo)) {
                return jogo;
            }
        }
        return null;
    }
}
