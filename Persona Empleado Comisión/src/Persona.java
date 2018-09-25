
public class Persona {
	
	private String nombre;
	private Fecha fechaNacimiento;
	private int dni;
	
//----------------------------------------------------------------------------------
// CONSTRUCTOR		
	
	public Persona(String nombre, Fecha fechaNacimiento, int dni) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
	}
	
//------------------------------------------------------------------------------------
// METHODS		
	
	public void imprimirDatos() {
		System.out.print("DNI: ");
		System.out.println(dni);
		System.out.println("NOMBRE: " + nombre);
		System.out.print("FECHA DE NACIMIENTO: ");
		fechaNacimiento.imprimir();
		System.out.println();
	}
}
