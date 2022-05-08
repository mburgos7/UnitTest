package com.fca.calidad.unittest;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

public class CalculadoraTest {

	public Calculadora miCalculadora;
	
	@Before
	public void setUp() throws Exception {
		miCalculadora = new Calculadora();
		System.out.println("Este es el setup");
	}


	@Test
	public void sumaTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.suma(6, 3);
		double resultadoEsperado = 15;
		
		//Verificación, comparar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void restaTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.resta(16, 2);
		double resultadoEsperado = 14;
		
		//Verificación, comparar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void divisionPositivoTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.division(6, 2);
		double resultadoEsperado = 3;
		
		//Verificación, comparar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test(expected = ArithmeticException.class)
	public void divisionCeroTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.division(6, 0);
		double resultadoEsperado = Double.POSITIVE_INFINITY;
		
		//Verificación, comparar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
	
	@Test
	public void multiplicacionTest() {
		
		//Ejercicio, llamada del código que vamos a probar
		double resultadoEjecucion = miCalculadora.multiplicacion(6, 2);
		double resultadoEsperado = 12;
		
		//Verificación, comparar resultadoEjecucion con resultadoEsperado
		assertThat(resultadoEjecucion, is(resultadoEsperado));
	}
}
