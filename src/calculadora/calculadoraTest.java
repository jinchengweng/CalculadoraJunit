package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void testSuma() {
		 calculadora calcu = new calculadora(20, 30);
		 int resultado = calcu.suma();
		 assertEquals(50,resultado);
	}

	@Test
	public void testResta() {
		 calculadora calcu = new calculadora(30, 10);
		 int resultado = calcu.resta();
		 assertEquals(20,resultado);
	}

	@Test
	public void testMultiplicacion() {
		 calculadora calcu = new calculadora(20, 3);
		 int resultado = calcu.multiplicacion();
		 assertEquals("fallo , tu puta madre", 60,resultado);
	}

	@Test
	public void testDivision() {
		 calculadora calcu = new calculadora(20, 2);
		 int resultado = calcu.division();
		 assertEquals(10,resultado);
	}

	@Test
	public void testDivisionPorCero() {
		try {
			calculadora calcu = new calculadora(8, 0);
			int resultado = calcu.division();
			fail(("FALLO , DEBERIA HABER LANZAR LA EXCEPCION"));
		}catch(ArithmeticException e) {
			//prueba satisfactoria
			
			
			
		}
	}
}
