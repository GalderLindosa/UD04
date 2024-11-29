package repaso2;
import java.util.Scanner;

import repaso.Tren;
public class MainAsignaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System .in); 
		Tren a[]= new Tren[3];
		int menu=0;
		int contador=0;
		do {
			menu=menu(teclado);
			switch(menu) {
			case 1:
				contador=introducir(teclado, a, contador);
				break;
			case 2:
				if (contador>0) {
					superarvelocidad( teclado,contador,a);
				}else {
					System.out.println("No hay Trenes");
				}			
				break;
			case 3:
				if (contador>0) {
					orderCercanias(a,contador);
				}else {
					System.out.println("No hay Trenes");
				}	
				break;
			case 4:
				if (contador>0) {
					reserva( teclado, a,contador);
				}else {
					System.out.println("No hay Trenes");
				}		
				break;
			case 5:
				if (contador>0) {
					mostrar( a,contador);
				}else {
					System.out.println("No hay Trenes");
				}			
				break;
			case 6:
				if (contador>0) {
					contador=eliminar( teclado, a,contador);
				}else {
					System.out.println("No hay Trenes");
				}		
				break;
			case 7:
				System.out.println("Hasta la proxima!");
				break;

			}
		}while (menu!=7);
	}

	public static int menu(Scanner teclado) {
		int menu;
		System.out.println("1. Introducir las asignatura");
		System.out.println("2. Mostrar el porcentaje de aprobados de las asignaturas de un curso");
		System.out.println("3. Ordenar las asignaturas por número de aprobados");
		System.out.println("4. Modificar datos de una asignatura concreta");
		System.out.println("5. Mostrar todas las asignaturas que se han introducido");
		System.out.println("6. Eliminar asignatura");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}

	public static int introducir(Scanner teclado, Asignatura a[], int contador) {
		String respuesta="";
		String nombre;
		if (contador>a.length) {
			System.out.println("Error. No puedes introducir más Trenes ");
		}else {
			for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				Asignatura a1=new Asignatura();
				a[i]=a1;
				System.out.println("Quien es el nombre de la asignatura?");
				nombre=teclado.next();
				if(buscarReferencia(teclado,nombre,a,contador)==-1) {
					a[i].setReferencia(referencia);
					System.out.println("Cuanta es el curso?");
					a[i].setCurso(teclado.next());
					System.out.println("Cuantos alumnos han sido matricukados?");
					a[i].setmatriculados(teclado.nextInt());
					System.out.println("Cuantos alumnos han suspendido?");
					a[i].setSuspendidos(teclado.nextInt());
					contador++;
				}else {
					System.out.println("Ya existe un Tren con esa referencia ");
				}
				do {
					System.out.print("Quiere añadir otra cuenta?: ");
					respuesta = teclado.next();

					if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
						System.out.println("Las opciones válidas son Si/No");
					}
				} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
			}
		}
		return contador;
	}





}


