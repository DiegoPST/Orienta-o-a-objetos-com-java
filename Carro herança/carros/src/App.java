public class App {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(1000.0);
        corrida.adicionarCarro(new CarroMult("Ferrari", 80.0));
        corrida.adicionarCarro(new CarroMult("McLaren", 150.0));
        
        corrida.adicionarCarro(new CarroSoma("Tesla Cybertruck", 120.0));
        corrida.adicionarCarro(new CarroSoma("Relampago Marquinhos", 200.0));

        corrida.iniciarCorrida();
        corrida.imprimirResultado();
    }
}