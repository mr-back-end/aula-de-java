public class quatorze {
    public static void main(String[] args) {
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaCrescimentoA = 0.03;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaCrescimentoA;
            populacaoB += populacaoB * taxaCrescimentoB;
            anos++;
        }

        System.out.println("Anos necessários: " + anos);
    }
}