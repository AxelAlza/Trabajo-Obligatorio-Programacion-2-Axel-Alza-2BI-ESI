package Interfaz;

import java.util.Scanner;

import Logica.Clases;

public class Interfaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte tipo = 0;
		byte op2;
		long Cedula;
		String Nombre;
		String Apellido;
		String Direccion;
		long[] Telefono = new long[5];		
		Clases Clases = new Clases();
		Scanner dato = new Scanner(System.in);
		System.out.println("Bienvenido");
		byte op;
		do {
			
			System.out.println("1- Registro de empleados");
			System.out.println("2 - Calculo total de saldos");
			System.out.println("3 - Salir");
			System.out.println("Seleccione una opción");
			op = dato.nextByte();
			switch (op) {
			case 1:
				byte i = 0;
				System.out.println("Registro de empleados");
				System.out.println("Ingrese Cedula");
				Cedula = dato.nextLong();
				System.out.println("Ingrese Nombre");
				Nombre = dato.next();
				System.out.println("Ingrese Apellido");
				Apellido = dato.next();
				System.out.println("Ingrese Direccion");
				Direccion = dato.next();
				System.out.println("Ingrese Telefonos");	
				do {			
					Telefono[i] = dato.nextLong();
					System.out.println("Para dejar de agregar presione 0");
					op2 = dato.nextByte();
					i++;
				}
				while (op2 !=0);	
				System.out.println("Ingrese tipo de empleado:"+"\n");
				System.out.println("1-Gerente");
				System.out.println("2-Operario");
				System.out.println("3-Administrativo");
				op2 = dato.nextByte();
				switch(op2) {
				case 1: tipo = 1; break;
				case 2: tipo = 2; break;
				case 3: tipo = 3; break;
				default: System.out.println("Eliga algo de la lista"); break;
				}
			
				Clases.Addemp(Cedula, Nombre, Apellido, Direccion, Telefono, tipo);
				break;
			case 2:
				Clases.calcularsaldos();
				break;
			case 3:
				System.out.println("Salir");
				break;
			}
		} while (op != 3);
		dato.close();
	}
}
