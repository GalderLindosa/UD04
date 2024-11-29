package poo14;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona ();
		p1.setDNI("79179719B");
		p1.setEdad(17);
		p1.setNombre("Galder");
		p1.Mostrar();
		if(p1.esMayorDeEdad()) {
			System.out.println("Ja! Vejestorio!");
		}
		else {
			System.out.println("Crece de una vez");
		}
	}

}
