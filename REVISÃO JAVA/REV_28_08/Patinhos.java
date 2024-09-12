package REV_28_08;
import java.util.Scanner;

public class Patinhos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de patinhos: ");
        int n = scanner.nextInt();

        int patinhosRestantes = n;
        while (patinhosRestantes > 0) {
            System.out.println(patinhosRestantes + " patinho(s) foram/foi passear");
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá");
            patinhosRestantes--;
            System.out.println("Mas só " + patinhosRestantes + " patinho(s) voltaram/voltou de lá.\n");
        }

        System.out.println("A mamãe patinha foi procurar");
        System.out.println("Além das montanhas");
        System.out.println("Na beira do mar");
        System.out.println("A mamãe gritou: Quá, quá, quá, quá");
        System.out.println("E os " + n + " patinhos voltaram de lá.");

        scanner.close();
    }
}



