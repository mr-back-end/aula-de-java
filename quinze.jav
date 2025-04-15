import java.util.Scanner;

public class quinze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n (n-ésimo termo): ");
        int n = scanner.nextInt();
        
        int a = 1, b = 1;
        
        System.out.print("Série de Fibonacci até o " + n + "º termo: ");
        
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                System.out.print("1 ");
            } else {
                int proximo = a + b;
                System.out.print(proximo + " ");
                a = b;
                b = proximo;
            }
        }
        
        scanner.close();
    }
}