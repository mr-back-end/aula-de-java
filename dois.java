import java.util.Scanner;

public class dois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double a = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double b = scanner.nextDouble();
        
        while (b == 0) {
            System.out.println("VALOR INVALIDO");
            System.out.print("Digite um novo segundo valor: ");
            b = scanner.nextDouble();
        }
        
        double resultado = a / b;
        System.out.println("Resultado da divisao: " + resultado);
        
        scanner.close();
    }
}