import java.util.*;

public class Pizza {
    private List<String> ingredientes = new ArrayList<>();
    
    private static HashMap<String, Integer> contadorIngredientes = new HashMap<>();
    
    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }
    
    public static void contabilizaIngrediente(String ingrediente) {
        Integer atual = contadorIngredientes.get(ingrediente);
        if (atual == null) {
            atual = 0;
        }
        contadorIngredientes.put(ingrediente, atual + 1);
    }
    
    public double getPreco() {
        int quantidade = ingredientes.size();
        if (quantidade <= 2) {
            return 15.0;
        } else if (quantidade <= 5) {
            return 20.0;
        } else {
            return 23.0;
        }
    }
    
    public static void zeraRegistro() {
        contadorIngredientes.clear();
    }
    
    public List<String> getIngredientes() {
        return ingredientes;
    }
    
    public static HashMap<String, Integer> getContadorIngredientes() {
        return contadorIngredientes;
    }
}

