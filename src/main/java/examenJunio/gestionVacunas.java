package examenJunio;

import java.util.Scanner;
/*
 * @authora Adriana Martin Sanchez
 * @version 1.0.0
 *
 */
public class gestionVacunas {
	/**
	 *Metodo que pide por parametros el nombre y el dni de los pacientes,y les pregunta que vacuna quieren ponerse, si Pfiser,
	 *Moderna o janssen y tambien el tiempo que hay que esperar para la segunda dosis.
	 * @param nombre
	 * @param dni
	 * @return el nombre del paciente y el mes en el que se ha puesto la vacuna.
	 */
public static void main(String[] args) {
	
	String nombre,dni,nv="",v1="",v2="",d1="",d2="";

	Scanner teclado = new Scanner(System.in);
	System.out.println("Introduzca el nombre del paciente:");
	nombre = teclado.next();
	System.out.println("Introduzca el dni del paciente:");
	dni = teclado.next();
	System.out.println("¿Vacuna 1 o 2?");
	nv = teclado.next();
	
	if(nv.equals("1")) {
		System.out.println("Introduzca la vacuna 1: ");
		v1 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 1:");
		d1 = teclado.next();
		
	}else if(nv.equals("2")) {
		
		System.out.println("Introduzca la vacuna 2: ");
		v2 = teclado.next();
		System.out.println("Introduzca el mes de vacunación de vacuna 2:");
		d2 = teclado.next();
		
	}else {
		System.out.println("Error");
	}
					
	extracted(nombre, dni);
	System.out.println("Vacuna 1 "+ v1 +" Fecha:"+d1);
	System.out.println("Vacuna 2 "+ v2 +" Fecha:"+d2);
	
	if(v2.equals("")) {
		if(v1.equals("Moderna")) {
			System.out.println("El paciente "+ nombre + " debe esperar 5 meses para la vacuna 2 ");
		}else if(v1.equals("Pfizer")) {
			System.out.println("El paciente "+ nombre + "debe esperar 4 meses para la vacuna 2 ");
		}else if(v1.equals("Janssen")) {
			System.out.println("El paciente está ya vacuando");
		}else {
			System.out.println("El paciente "+ nombre + " está ya vacunado ");
		}
	}		
	}

	private static void extracted(String nombre, String dni) {
		System.out.println("VACUNACIÓN PACIENTE "+ nombre +"-"+ dni);
	}
}