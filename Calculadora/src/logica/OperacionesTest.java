package logica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class OperacionesTest {

	static Operaciones o;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		o = new Operaciones();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSumar() {
		double resultado = o.sumar(1,1);
		assertEquals(2, resultado);
	}

	@Test
	public void testRestar() {
		double resultado = o.restar(2,1);
		assertEquals(1, resultado);
	}

	@Test
	public void testMultiplicar() {
		double resultado = o.multiplicar(1,1);
		assertEquals(1, resultado);
	}

	@Test
	public void testDividir() {
		//double resultado = o.dividir(2,1);
		//assertEquals(2, resultado);
		assertThrows(ArithmeticException.class,() -> {
		    o.dividir(6,0);
		  });

	}

}
