import java.util.Scanner;

public class dezoito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números (N): ");
        int N = scanner.nextInt();
        if (N <= 0) {
            System.out.println("A quantidade de números deve ser maior que zero.");
            return;
        }
        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            soma += numero;

            if (numero < menor) menor = numero;
            if (numero > maior) maior = numero;
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        
        scanner.close();
    }
}