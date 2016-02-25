package pruebaTravis;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Calculadora c = new Calculadora();
		
		assertTrue(c.multiplicacion(2, 3) == 6);
	}


	
	
}
 