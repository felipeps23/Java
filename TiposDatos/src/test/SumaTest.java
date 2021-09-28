package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SumaTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testSuma() {
		Suma sumaImpl = new Suma();
		int resultado = sumaImpl.suma(1, 1);
		assertEquals(2, resultado);
		
	}
	
	/*
	@Test(expected = ArithmeticException.class)
	public void mdivision() {
		Suma.mdivision(3, 0);
		assertThrows(ArithmeticException.class,() -> {
		    o.dividir(6,0);
		  });

	}
	*/
	
	

}
