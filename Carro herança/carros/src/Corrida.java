import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Corrida {
    private HashMap<Carro, Double> distancias;
    private double tamanhoDaPista;

    public Corrida(double tamanhoDaPista) {
        this.tamanhoDaPista = tamanhoDaPista;
        this.distancias = new HashMap<>();
    }

    public void adicionarCarro(Carro carro) {
        distancias.put(carro, 0.0);
        System.out.println("Carro adicionado: " + carro.getNome());
    }

    public boolean verificarSeCorridaTerminou() {
        for (Double distancia : distancias.values()) {
            if (distancia >= tamanhoDaPista) {
                return true;
            }
        }
        return false;
    }

    public void iniciarCorrida() {
        System.out.println("Corrida iniciada! Tamanho da pista: " + tamanhoDaPista);
        int volta = 0;
        while (!verificarSeCorridaTerminou()) {
            volta++;
            System.out.println("\n Volta " + volta);
            for (Map.Entry<Carro, Double> entry : distancias.entrySet()) {
                Carro carro = entry.getKey();
                double distanciaAtual = entry.getValue();

                carro.acelerar();

                double novaDistancia = distanciaAtual + carro.getVelocidade();
                if (novaDistancia > tamanhoDaPista) {
                    novaDistancia = tamanhoDaPista;
                }
                distancias.put(carro, novaDistancia);

                System.out.println(carro.getNome() + ": Vel=" + carro.getVelocidade() + ", Dist=" + novaDistancia);
            }
        }
        System.out.println("\nCorrida terminada!");
    }

    public void imprimirResultado() {
        List<Map.Entry<Carro, Double>> lista = new ArrayList<>(distancias.entrySet());
        Collections.sort(lista, (a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("\n RANKING FINAL");
        int posicao = 1;
        for (Map.Entry<Carro, Double> entry : lista) {
            Carro carro = entry.getKey();
            double dist = entry.getValue();
            System.out.println(posicao + "º lugar: " + carro.getNome() + " - Distância: " + dist);
            posicao++;
        }
    }
}
