import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PizzaTest {
    
    @BeforeEach
    void setUp() {
        Pizza.zeraRegistro();
    }
    
    @Test
    void testGetPrecoMenosOuDoisIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");
        
        assertEquals(15.0, pizza.getPreco(), 0.01);
    }
    
    @Test
    void testGetPrecoTresACincoIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("pepperoni");
        
        assertEquals(20.0, pizza.getPreco(), 0.01);
    }
    
    @Test
    void testGetPrecoMaisDeCincoIngredientes() {
        Pizza pizza = new Pizza();
        for (int i = 0; i < 6; i++) {
            pizza.adicionaIngrediente("ing" + i);
        }
        
        assertEquals(23.0, pizza.getPreco(), 0.01);
    }
    
    @Test
    void testContabilizaIngredienteUmaPizza() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        
        HashMap<String, Integer> contador = Pizza.getContadorIngredientes();
        assertEquals(1, (int) contador.get("queijo"));
        assertNull(contador.get("outro"));
    }
    
    @Test
    void testContabilizaIngredienteMultiplasPizzas() {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("queijo");
        
        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("tomate");
        
        HashMap<String, Integer> contador = Pizza.getContadorIngredientes();
        assertEquals(2, (int) contador.get("queijo"));
        assertEquals(1, (int) contador.get("tomate"));
    }
}