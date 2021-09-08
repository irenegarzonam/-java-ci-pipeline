import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
    private Calculadora calculadora;

    public void escenario(){
        calculadora = new Calculadora();
    }

    public void testSumar(){
        escenario();
        assertTrue(calculadora.sumar(2,2)==(2+2));
        assertEquals(3,calculadora.sumar(2,1));
    }

    public void testRestar(){
        escenario();
        assertTrue(calculadora.restar(2,2)==(2-2));
        assertEquals(3,calculadora.restar(5,2));
    }

    public void testMultiplicar(){
        escenario();
        assertTrue(calculadora.multiplicar(2,2)==(2*2));
        assertEquals(6,calculadora.multiplicar(2,3));
    }

    public void testDividir(){
        escenario();
        assertTrue(calculadora.dividir(2,2)==(2/2));
        assertEquals(5,calculadora.dividir(10,2));
    }
}
