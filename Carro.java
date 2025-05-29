public class Carro {
    String modelo;
    String marca;
    int ano;
    int velocidade;
    int velocidadeMax;

    
    Carro() {
        this("Fiat Uno 2010 ", "Fiat", 2010, 0, 500);
        System.out.println("Carregando carro padrão!");
    }
    
    Carro(String modelo, String marca, int ano, int velocidade, int velocidadeMax) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
        this.velocidadeMax = velocidadeMax;
    }

    
    public boolean acelerar(int aceleracao) {
        this.velocidade = Math.min(this.velocidade + aceleracao, this.velocidadeMax);
        if (this.velocidade == this.velocidadeMax) {
            System.out.println("Velocidade máxima atingida!");
            return false;
        }
        return true;
    }

  
    public boolean freiar(int freio) {
        this.velocidade = Math.max(this.velocidade - freio, 0);
        if (this.velocidade == 0) {
            System.out.println("Carro parado!");
            return false;
        }
        return true;
    }

    public void informacao() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.velocidade);
        System.out.println("Velocidade Máxima: " + this.velocidadeMax);
    }
}
