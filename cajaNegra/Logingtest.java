package Loging;

import static org.junit.Assert.*;

import org.junit.Test;

public class Logingtest {

	@Test
	public void contrase�a_correcta() {
		boolean prueba = Loging.registro("Pablo","1234","Pablo","1234");
		boolean esperado = true;
		assertEquals(esperado,prueba);
	}
	
	@Test
	public void contrase�a_incorrecta() {
		boolean prueba = Loging.registro("Pablo","1234","Pablo","4321");
		boolean esperado = false;
		assertEquals(esperado,prueba);
	}
	

}
