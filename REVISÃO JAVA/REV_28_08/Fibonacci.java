package REV_28_08;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci são:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
            scanner.close();
        }
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
           
        }
        
    }

    
}


