package PruebaJunit;

import junit.framework.TestCase;

public class TestCalculadora extends TestCase {
	
	Calculadora calculadora = new Calculadora();
	
	public void testSumar() {
		assertTrue(calculadora.sumar(2, 2)==(2+2));
	}
	

}
