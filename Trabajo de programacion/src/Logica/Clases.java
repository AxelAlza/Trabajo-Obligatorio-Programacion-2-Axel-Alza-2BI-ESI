package Logica;
import java.util.ArrayList;

public class Clases {

	ArrayList<Empleados> Emps = new ArrayList<Empleados>();

	// Seguramente aca haya una forma mas organizada y menos rebuscada de hacerlo,
	// pero queria probar como funciona la "herencia" de los objetos......
	
	// Me parece que no entendi nada de que va la idea de la herencia por que me
	// esta creando mas problemas de los que soluciona profe help jaja

	private class Empleados {
		long Cedula;
		String Nombre;
		String Apellido;
		String Direccion;
		long Telefono[];
		double Saldo = 15000;
		String Tipo_Empleado = "Común";

		public Empleados(long Cedula, String Nombre, String Apellido, String Direccion, long Telefono[]) {
			this.Cedula = Cedula;
			this.Nombre = Nombre;
			this.Apellido = Apellido;
			this.Direccion = Direccion;
			this.Telefono = Telefono;
		}

	}

	public class Gerente extends Empleados {
		double Saldo = super.Saldo + super.Saldo * 0.97;
		String Tipo_Empleado = "Gerente";

		public Gerente(long Cedula, String Nombre, String Apellido, String Direccion, long[] Telefono) {
			super(Cedula, Nombre, Apellido, Direccion, Telefono);
			super.Saldo = this.Saldo;
			super.Tipo_Empleado = this.Tipo_Empleado;
		}

	}

	public class Operario extends Empleados {
		double Saldo = super.Saldo + super.Saldo * 0.38;
		String Tipo_Empleado = "Operario";

		public Operario(long Cedula, String Nombre, String Apellido, String Direccion, long[] Telefono) {
			super(Cedula, Nombre, Apellido, Direccion, Telefono);
			super.Saldo = this.Saldo;
			super.Tipo_Empleado = this.Tipo_Empleado;
		}

	}

	public class Administrativo extends Empleados {
		double Saldo = super.Saldo + super.Saldo * 0.27;
		String Tipo_Empleado = "Admistrativo";

		public Administrativo(long Cedula, String Nombre, String Apellido, String Direccion, long[] Telefono) {
			super(Cedula, Nombre, Apellido, Direccion, Telefono);
			super.Saldo = this.Saldo;
			super.Tipo_Empleado = this.Tipo_Empleado;

		}

	}

	public void Addemp(long Cedula, String Nombre, String Apellido, String Direccion, long[] Telefono, byte tipo) {
		switch (tipo) {
		case 1:
			Emps.add(new Gerente(Cedula, Nombre, Apellido, Direccion, Telefono));
			break;
		case 2:
			Emps.add(new Operario(Cedula, Nombre, Apellido, Direccion, Telefono));
			break;
		case 3:
			Emps.add(new Administrativo(Cedula, Nombre, Apellido, Direccion, Telefono));
			break;

		default:
			System.out.println("Seleccione un tipo de la lista");
			break;
		}
	}

	public void calcularsaldos() {
		double Saldo_total = 0;
		for (Empleados empleado : Emps) {
			System.out.println(empleado.Tipo_Empleado + " " + empleado.Nombre + " " + empleado.Apellido + " -" + " $"
					+ empleado.Saldo);
			Saldo_total = Saldo_total + empleado.Saldo;
		}
		System.out.println("TOTAL - $" + Saldo_total);

	}
}
