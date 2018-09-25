
public class Empleado extends Persona {
	
	protected int sueldoBase;
	
//----------------------------------------------------------------------------------
// CONSTRUCTOR		
	
	public Empleado(String nombre, Fecha fechaNacimiento, int dni, int sueldoBase) {

		super(nombre, fechaNacimiento, dni);
		this.sueldoBase = sueldoBase;
	}
	
//------------------------------------------------------------------------------------
// METHODS		

	public int getSueldo() {
		return sueldoBase;
	}
	
	public void imprimirDatos() {
		super.imprimirDatos();
		System.out.print("SUELDO: ");
		System.out.println(sueldoBase);
	}
}