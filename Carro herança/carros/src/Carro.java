public abstract class Carro {
    protected double velocidade = 0.0;
    protected double velocidadeMax;
    protected String nome;

    public Carro(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public void freiar() {
        velocidade = velocidade - (velocidade * 0.20);
        if (velocidade < 0) {
            velocidade = 0;
        }
    }

    public abstract void acelerar();

    public double getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void imprimirStatus() {
        System.out.println(nome + ": Velocidade = " + velocidade + ", Máx = " + velocidadeMax);
    }
}