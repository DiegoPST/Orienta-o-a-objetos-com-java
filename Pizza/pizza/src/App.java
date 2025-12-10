import java.util.HashMap;
import java.util.Map;

public class App {
public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("queijo");
        pizza1.adicionaIngrediente("tomate");
        
        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("pepperoni");
        pizza2.adicionaIngrediente("cebola");
        pizza2.adicionaIngrediente("pimentao");
        
        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("mussarela");
        pizza3.adicionaIngrediente("alface");
        pizza3.adicionaIngrediente("azeitona");
        pizza3.adicionaIngrediente("cogumelo");
        pizza3.adicionaIngrediente("abacaxi");
        pizza3.adicionaIngrediente("chocolate");
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionar(pizza1);
        carrinho.adicionar(pizza2);
        carrinho.adicionar(pizza3);
        
        System.out.println("Total do Carrinho: R$ " + carrinho.getTotal());
        
        System.out.println("Ingredientes usados:");
        HashMap<String, Integer> contador = Pizza.getContadorIngredientes();
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
