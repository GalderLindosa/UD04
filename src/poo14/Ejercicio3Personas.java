package poo14;
import java.util.Scanner;
public class Ejercicio3Personas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in);
		int menu;
		Persona a []=new Persona[10];

		do {
		System.out.println("Que quieres hacer?");
		System.out.println("1. Introducir las personas ");
		System.out.println("2. Muestra la persona de mayor edad");
		System.out.println("3. Muestra la información de una persona tras introducir su DNI.");
		System.out.println("4. Muestra la información de todas las personas");
		System.out.println("5. Salir");
		
		menu = teclado.nextInt();
		
		switch(menu) {
		case 1:
			Introducir( teclado,a);
			break;
		case 2:
			Mostmay(teclado, a);
			break;
		case 3:
			BuscDNI(teclado, a);
			break;
		case 4:
			Mostrar( teclado,a);
			break;
		case 5:
			System.out.println("Hasta la proxima!");
			break;
		default: 
			System.out.println("Opcion incorrecta");
		
		break;
		}
		
		}while(menu!=5);
		teclado.close();
	}
	
	
	
	
	public static void Introducir(Scanner teclado, Persona a[]) {
		for(int i=0;i<a.length;i++) {
			Persona p = new Persona();
			a[i]=p;
			System.out.println("Cual es el nombre de la persona?");
			a[i].setNombre(teclado.next());
			System.out.println("Cual es el DNI de la persona?");			
			a[i].setDNI(teclado.next());
			System.out.println("Cual es la Edad de la persona?");			
			a[i].setEdad(teclado.nextInt());

		}
	}
	
	public static void Mostmay (Scanner teclado, Persona a[]) {
		int edad=0, pos=0;
		for(int i=0;i<a.length;i++) {
			if (a[i].getEdad()>edad) {
				edad=a[i].getEdad();
				pos=i;
			}
		}
		System.out.println("La persona mas mayor es: "+a[pos].toString() +" con "+edad +" años");
	}
	
	public static void BuscDNI(Scanner teclado, Persona a[]) {
		String DNI;
		System.out.println("Cual es el DNI de la persona?");			
		DNI = teclado.next();
		for(int i=0;i<a.length;i++) {
			if(DNI.equalsIgnoreCase(a[i].getDNI())){
				System.out.println("El DNI de la persona es: " +a[i].getDNI());
				System.out.println("El Nombre de la persona es: " +a[i].getNombre());
				System.out.println("La edad de la persona es: " +a[i].getEdad());
			}
		}
	}
	
	public static void Mostrar (Scanner teclado, Persona a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println("El DNI de la persona es: " +a[i].getDNI());
			System.out.println("El Nombre de la persona es: " +a[i].getNombre());
			System.out.println("La edad de la persona es: " +a[i].getEdad());
}

	}
	
}
