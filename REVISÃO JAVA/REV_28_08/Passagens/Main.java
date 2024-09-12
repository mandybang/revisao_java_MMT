package REV_28_08.Passagens JAVA.Passagens;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CompanhiaAerea companhia = new CompanhiaAerea();

        // Adicionando 12 voos
        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o número do voo " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            System.out.println("Informe a origem do voo " + (i + 1) + ": ");
            String origem = scanner.nextLine();

            System.out.println("Informe o destino do voo " + (i + 1) + ": ");
            String destino = scanner.nextLine();

            System.out.println("Informe o número de lugares disponíveis para o voo " + (i + 1) + ": ");
            int lugaresDisponiveis = scanner.nextInt();

            companhia.adicionarVoo(new Voo(numero, origem, destino, lugaresDisponiveis));
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
                    scanner.nextLine(); // Consumir a nova linha

                    switch (consultaOpcao) {
                        case 1:
                            System.out.println("Informe o número do voo para consultar:");
                            int numeroConsulta = scanner.nextInt();
                            Voo voo = companhia.buscarVooPorNumero(numeroConsulta);
                            if (voo != null) {
                                System.out.println(voo);
                            } else {
                                System.out.println("Voo inexistente.");
                            }
                            break;
                        case 2:
                            System.out.println("Informe a origem para consultar:");
                            String origemConsulta = scanner.nextLine();
                            var voosPorOrigem = companhia.buscarVoosPorOrigem(origemConsulta);
                            if (!voosPorOrigem.isEmpty()) {
                                for (Voo v : voosPorOrigem) {
                                    System.out.println(v);
                                }
                            } else {
                                System.out.println("Nenhum voo encontrado para a origem informada.");
                            }
                            break;
                        case 3:
                            System.out.println("Informe o destino para consultar:");
                            String destinoConsulta = scanner.nextLine();
                            var voosPorDestino = companhia.buscarVoosPorDestino(destinoConsulta);
                            if (!voosPorDestino.isEmpty()) {
                                for (Voo v : voosPorDestino) {
                                    System.out.println(v);
                                }
                            } else {
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
                    Voo vooReserva = companhia.buscarVooPorNumero(numeroReserva);
                    if (vooReserva != null) {
                        if (vooReserva.reservarLugar()) {
                            System.out.println("Reserva confirmada para o voo " + vooReserva.getNumero() + ". Lugares restantes: " + vooReserva.getLugaresDisponiveis());
                        } else {
                            System.out.println("Voo lotado.");
                        }
                    } else {
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
