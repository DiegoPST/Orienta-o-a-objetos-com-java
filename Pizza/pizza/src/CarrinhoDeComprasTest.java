import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarrinhoDeComprasTest {
    
    private CarrinhoDeCompras carrinho;
    
    @BeforeEach
    void setUp() {
        carrinho = new CarrinhoDeCompras();
        Pizza.zeraRegistro();
    }
    
    @Test
    void testAdicionarUmaPizzaValidaETotal() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        
        carrinho.adicionar(pizza);
        
        assertEquals(15.0, carrinho.getTotal(), 0.01);
    }
    
    @Test
    void testAdicionarMultiplasPizzasValidaTotal() {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("queijo");
        
        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("tomate");
        pizza2.adicionaIngrediente("pepperoni");
        
        carrinho.adicionar(pizza1);
        carrinho.adicionar(pizza2);
        
        assertEquals(30.0, carrinho.getTotal(), 0.01);
    }
    
    @Test
    void testNaoAdicionarPizzaSemIngredientes() {
        Pizza pizzaVazia = new Pizza();
        
        IllegalArgumentException excecao = assertThrows(
            IllegalArgumentException.class, 
            () -> carrinho.adicionar(pizzaVazia)
        );
        
        assertEquals("Não pode adicionar pizza sem ingredientes!", excecao.getMessage());
        assertEquals(0.0, carrinho.getTotal(), 0.01);
    }
}