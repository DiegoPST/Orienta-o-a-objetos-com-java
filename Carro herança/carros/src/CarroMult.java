public class CarroMult extends Carro {
    protected double potencia = 2.0;

    public CarroMult(String nome, double velocidadeMax) {
        super(nome, velocidadeMax);
        this.velocidade = 1.0;
    }

    public void acelerar() {
        velocidade = velocidade * potencia;
        if (velocidade > velocidadeMax) {
            velocidade = velocidadeMax;
        }
    }

    public double getPotencia() {
        return potencia;
    }
}