import java.util.Scanner;

public class seis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean novoCalculo;

        do {
            double nota1 = lerNota(scanner, 1);
            double nota2 = lerNota(scanner, 2);
            
            double media = (nota1 + nota2) / 2;
            
            System.out.printf("A media do aluno e: %.2f%n", media);
            
            System.out.print("NOVO CALCULO (S/N)? ");
            String resposta = scanner.next().trim().toUpperCase();
            novoCalculo = resposta.equals("S");
            
        } while (novoCalculo);
        
        scanner.close();
    }
    private static double lerNota(Scanner scanner, int avaliacao) {
        double nota;
        do {
        System.out.printf("Digite a nota da %da avaliacao (0 a 10): ", avaliacao);
            nota = scanner.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("VALOR INVALIDO. A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }
}