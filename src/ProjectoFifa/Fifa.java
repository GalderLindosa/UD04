package ProjectoFifa;
import java.util.Scanner;
public class Fifa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		String nombre;
		int vel;
		int pot;
		int alt;
		int fis;
		int def;
		int reg;
		System.out.println("Introduce el nombre de un jugador");
		nombre=teclado.next();
		Jugador nombre1=new Jugador();
		nombre1.setNombre(nombre);
		System.out.println("Introduzca la velocidad de "+nombre1);
		vel=teclado.nextInt();
		nombre1.setVelocidad(vel);
		System.out.println("Introduzca la potencia de "+nombre1);
		pot=teclado.nextInt();
		nombre1.setPotencia(pot);
		System.out.println("Introduzca la altura de "+nombre1);
		alt=teclado.nextInt();
		nombre1.setAltura(alt);
		System.out.println("Introduzca el físico de "+nombre1);
		fis=teclado.nextInt();
		nombre1.setFisico(fis);
		System.out.println("Introduzca la defensa de "+nombre1);
		def=teclado.nextInt();
		nombre1.setDefensa(def);
		System.out.println("Introduzca el regate de "+nombre1);
		reg=teclado.nextInt();
		nombre1.setRegate(reg);
		System.out.println(nombre1.toString());
		System.out.println("---------------------------------------------------");
		System.out.println("Los atributos de Ronaldo son "+nombre1.getVelocidad()+" "+nombre1.getPotencia());
	
	}
	}


