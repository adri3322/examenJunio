package examenJunio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CovidTest {

	@Test
	void testCalcularPrioridadVacunacion() {
		int edad=56;
		int dosis=1;
		int prioridadEsperada=2;
		
		Covid vacunacion=new Covid();
		
   int resultado=vacunacion.calcularPrioridadVacunacion(edad, dosis);
      Assertions.assertEquals(prioridadEsperada,resultado);
	}
	
	@Test
	void testCalcularPrioridadVacunacion1() {
		int edad=54;
		int dosis=1;
		int prioridadEsperada=3;
		
		Covid vacunacion=new Covid();
		
   int resultado=vacunacion.calcularPrioridadVacunacion(edad, dosis);
      Assertions.assertEquals(prioridadEsperada,resultado);
	}
	
	@Test
	void testCalcularPrioridadVacunacion2() {
		int edad=34;
		int dosis=1;
		int prioridadEsperada=1;
		
		Covid vacunacion=new Covid();
		
   int resultado=vacunacion.calcularPrioridadVacunacion(edad, dosis);
      Assertions.assertEquals(prioridadEsperada,resultado);
	}

}
