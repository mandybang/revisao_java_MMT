package REV_28_08;
import java.util.Scanner;

public class ReservaPassagens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados dos voos
        int[] numerosVoos = new int[12];
        String[] origens = new String[12];
        String[] destinos = new String[12];
        int[] lugaresDisponiveis = new int[12];

        // Inicialização dos voos
        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o número do voo " + (i + 1) + ": ");
            numerosVoos[i] = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            System.out.println("Informe a origem do voo " + (i + 1) + ": ");
            origens[i] = scanner.nextLine();

            System.out.println("Informe o destino do voo " + (i + 1) + ": ");
            destinos[i] = scanner.nextLine();

            System.out.println("Informe o número de lugares disponíveis para o voo " + (i + 1) + ": ");
            lugaresDisponiveis[i] = scanner.nextInt();
        }

        int opcao;
        do {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Consultar");
            System.out.println("2. Efetuar Reserva");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Consultar por:");
                    System.out.println("1. Número do voo");
                    System.out.println("2. Origem");
                    System.out.println("3. Destino");
                    int consultaOpcao = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha

                    switch (consultaOpcao) {
                        case 1:
                            System.out.println("Informe o número do voo para consultar:");
                            int numeroConsulta = scanner.nextInt();
                            boolean vooEncontrado = false;

                            for (int i = 0; i < 12; i++) {
                                if (numerosVoos[i] == numeroConsulta) {
                                    System.out.println("Voo " + numerosVoos[i] + " de " + origens[i] + " para " + destinos[i] + " com " + lugaresDisponiveis[i] + " lugares disponíveis.");
                                    vooEncontrado = true;
                                    break;
                                }
                            }
                            if (!vooEncontrado) {
                                System.out.println("Voo inexistente.");
                            }
                            break;
                        case 2:
                            System.out.println("Informe a origem para consultar:");
                            String origemConsulta = scanner.nextLine();
                            vooEncontrado = false;

                            for (int i = 0; i < 12; i++) {
                                if (origens[i].equalsIgnoreCase(origemConsulta)) {
                                    System.out.println("Voo " + numerosVoos[i] + " de " + origens[i] + " para " + destinos[i] + " com " + lugaresDisponiveis[i] + " lugares disponíveis.");
                                    vooEncontrado = true;
                                }
                            }
                            if (!vooEncontrado) {
                                System.out.println("Nenhum voo encontrado para a origem informada.");
                            }
                            break;
                        case 3:
                            System.out.println("Informe o destino para consultar:");
                            String destinoConsulta = scanner.nextLine();
                            vooEncontrado = false;

                            for (int i = 0; i < 12; i++) {
                                if (destinos[i].equalsIgnoreCase(destinoConsulta)) {
                                    System.out.println("Voo " + numerosVoos[i] + " de " + origens[i] + " para " + destinos[i] + " com " + lugaresDisponiveis[i] + " lugares disponíveis.");
                                    vooEncontrado = true;
                                }
                            }
                            if (!vooEncontrado) {
                                System.out.println("Nenhum voo encontrado para o destino informado.");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Informe o número do voo para efetuar a reserva:");
                    int numeroReserva = scanner.nextInt();
                    vooEncontrado = false;

                    for (int i = 0; i < 12; i++) {
                        if (numerosVoos[i] == numeroReserva) {
                            vooEncontrado = true;
                            if (lugaresDisponiveis[i] > 0) {
                                lugaresDisponiveis[i]--;
                                System.out.println("Reserva confirmada para o voo " + numerosVoos[i] + ". Lugares restantes: " + lugaresDisponiveis[i]);
                            } else {
                                System.out.println("Voo lotado.");
                            }
                            break;
                        }
                    }
                    if (!vooEncontrado) {
                        System.out.println("Voo inexistente.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}
