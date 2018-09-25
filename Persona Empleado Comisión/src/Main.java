
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Persona ec = new Fecha(10,12,93);
		Persona ec = new EmpleadoComision("Fuckencio Martinez",new Fecha(15, 3,1979), 123456, 1000, 20);
		ec.vender(200);
		System.out.println("Sueldo: " + ec.getSueldo());
		System.out.println("---------------");
		ec.imprimirDatos();
	}
}