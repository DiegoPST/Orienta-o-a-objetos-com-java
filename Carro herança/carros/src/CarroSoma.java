public class CarroSoma extends Carro {
    protected double potencia = 10.0;

    public CarroSoma(String nome, double velocidadeMax) {
        super(nome, velocidadeMax);
        this.velocidade = 1.0;
    }

    public void acelerar() {
        velocidade = velocidade + potencia;
        if (velocidade > velocidadeMax) {
            velocidade = velocidadeMax;
        }
    }

    public double getPotencia() {
        return potencia;
    }
}