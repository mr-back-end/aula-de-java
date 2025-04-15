import java.util.Scanner;

public class onze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        do {
            System.out.print("Digite um valor N (maior que ZERO): ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("VALOR INVALIDO. N deve ser maior que ZERO.");
            }
        } while (N <= 0);
        
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}