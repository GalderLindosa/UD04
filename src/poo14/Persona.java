package poo14;

public class Persona {

	
	private String nombre,DNI;
	private int edad ;
	
	public Persona() {
		this.DNI="";
		this.nombre="";
		this.edad=0;
	}
	public Persona(String n, int e, int d){
		this.DNI="";
		this.nombre=n;
		this.edad=e;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean esMayorDeEdad() {
		boolean may=false;
		if (this.edad>=18) {
			may=true;
		}
		return may;
	}
	@Override
	public String toString() {
		return nombre;
	}
		
}
