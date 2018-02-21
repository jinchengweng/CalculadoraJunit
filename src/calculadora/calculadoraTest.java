package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class calculadoraTest {
	
	private calculadora calcu;

	@Before
	public void creaCalculadora() {
		calcu = new calculadora(20, 30);
	
	}
	@After
	public void borraCalculadora() {
		calcu = null;
	}

	@Test
	public void testSuma() {
		// calculadora calcu = new calculadora(20, 30);
		 int resultado = calcu.suma();
		 assertEquals(50,resultado);
	}

	@Test
	public void testResta() {
		// calculadora calcu = new calculadora(20, 30);
		 int resultado = calcu.resta();
		 assertEquals(10,resultado);
	}
	@Test 
	public void testnum1EsMayor() {
		// calculadora calcu = new calculadora(20, 30);
		 boolean resultado = calcu.num1EsMayor();
		 assertFalse(resultado);
	}

	@Test
	public void testMultiplicacion() {
	//	 calculadora calcu = new calculadora(20, 3);
		 int resultado = calcu.multiplicacion();
		 assertEquals("fallo , tu puta madre", 60,resultado);
	}

	@Test
	public void testDivision() {
		// calculadora calcu = new calculadora(20, 2);
		 int resultado = calcu.division();
		 assertEquals(10,resultado);
	}

	@Test
	public void testDivisionPorCero() {
		try {
		//	calculadora calcu = new calculadora(8, 0);
			int resultado = calcu.division();
			fail(("FALLO , DEBERIA HABER LANZAR LA EXCEPCION"));
		}catch(ArithmeticException e) {
			//prueba satisfactoria
			
		}
		}
		

		@Test
		public void testDivisionPorCero2() {
	
				//calculadora calcu = new calculadora(20, 0);
				Integer resultado = calcu.division2();
				assertNull(resultado);		
	}
		
		@Test
		public void testDivisionPorCero3() {
	
				//calculadora calcu = new calculadora(20, 0);
				Integer resultado = calcu.division3();
				assertNull(resultado);				
}
}
