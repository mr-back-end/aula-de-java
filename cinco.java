import java.util.Scanner;

public class cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar;

        do {
            double nota1, nota2;

            do {
                System.out.print("Digite a primeira nota (0 a 10): ");
                nota1 = scanner.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota invalida Deve estar entre 0 e 10.");
                }
            } while (nota1 < 0 || nota1 > 10);

        
            do {
                System.out.print("Digite a segunda nota (0 a 10): ");
                nota2 = scanner.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota invalida Deve estar entre 0 e 10.");
                }
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2;
            System.out.println("A media do aluno e: " + media);

            System.out.print("NOVO CALCULO (S/N)? ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 'S' || continuar == 's');

        scanner.close();
    }
}
