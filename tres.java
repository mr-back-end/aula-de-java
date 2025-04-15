import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = scanner.nextDouble();
        
        double segundoValor = 0;
        
        
        while (segundoValor == 0) {
            System.out.print("Digite o segundo valor (nao pode ser zero): ");
            segundoValor = scanner.nextDouble();
            if (segundoValor == 0) {
                System.out.println("VALOR INVALIDO. O segundo valor nao pode ser zero.");
            }
        } 
        double resultado = primeiroValor / segundoValor;
        
        System.out.printf("O resultado da divisao de %.2f por %.2f e: %.2f%n", primeiroValor, segundoValor, resultado);
        
        scanner.close();
    }
}