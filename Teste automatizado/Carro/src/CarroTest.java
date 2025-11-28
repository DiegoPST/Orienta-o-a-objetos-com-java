import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarroTest {


    @Test
    public void testAcelerar() {
        Carro c = new Carro();
        c.velocidade=2;
        c.potencia=3;

        c.acelerar();
        assertEquals(5, c.velocidade);
    }

    @Test
    public void testFrear() {
        Carro c = new Carro();
        c.potencia=10;
        
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.velocidade);
    }

    @Test
    public void testGetVelocidade() {

    }
}
