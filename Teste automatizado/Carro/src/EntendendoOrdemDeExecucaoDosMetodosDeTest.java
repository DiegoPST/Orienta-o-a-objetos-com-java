import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class EntendendoOrdemDeExecucaoDosMetodosDeTest {
    @Test
    public void teste1() {
       System.out.println("teste 1");
    }

    @Test
    public void teste2() {
       System.out.println("teste 2");
    }

    @Test
    public void teste3() {
       System.out.println("teste 2");
    }

    @beforeClass
    public static void beforeclass() {
        System.out.println("BeforeClass")
    }

    @Before
    public void before(){

    }
}
