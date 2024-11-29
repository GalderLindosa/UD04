package repaso;

import java.util.Scanner;

public class mainTren {

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
		System.out.println("1. Introducir los Trenes");
		System.out.println("2. Mostrar los Trenes que superen una velocidad dada");
		System.out.println("3. Ordenar los Trenes de cercanías por duración del viaje");
		System.out.println("4. Reserva de asientos");
		System.out.println("5. Mostrar todos los Trenes que se han introducido");
		System.out.println("6. Eliminar Tren");
		System.out.println("7. Salir");
		menu = teclado.nextInt();
		return menu;
	}

	public static int introducir(Scanner teclado, Tren a[], int contador) {
		String respuesta="";
		int referencia;
		if (contador>a.length) {
			System.out.println("Error. No puedes introducir más Trenes ");
		}else {
			for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
				Tren t1=new Tren();
				a[i]=t1;
				System.out.println("Quien es la referencia del Tren?");
				referencia=teclado.nextInt();
				if(buscarReferencia(teclado,referencia,a,contador)==-1) {
					a[i].setReferencia(referencia);
					System.out.println("Cuanta es la cantidad de asientos en el Tren?");
					a[i].setAsientos(teclado.nextInt());
					System.out.println("Cuantos minutos duro el viaje en Tren?");
					a[i].setDuracion(teclado.nextInt());
					System.out.println("Cuantos kilometros recorrio el Tren?");
					a[i].setRecorrido(teclado.nextInt());
					System.out.println("Cual es el tipo del Tren?");
					a[i].setTipo(teclado.next());
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

	public static int buscarReferencia(Scanner teclado,int referencia, Tren a[], int contador) {
		for (int i=0; i<contador;i++) {
			if(referencia==a[i].getReferencia()) {
				return i;
			}
		}
		return -1;
	}

	public static void mostrar( Tren[] a, int contador) {
		for (int i=0;i<contador;i++) {
			System.out.println(a[i].toString());
		}
	}

	public static void superarvelocidad(Scanner teclado, int contador, Tren a[]) {
		double velocidad;
		boolean hay=false;
		System.out.println("Cual sera la minima velocidad de los Trenes a mostrar? (La velocidad se medira en km/h)");
		velocidad = teclado.nextInt();
		for (int i=0; i<contador;i++) {
			if (a[i].obtenerVelocidadTotal()>=velocidad) {
				hay =true;
				System.out.println(a[i].toString());
			}
		}
		if (!hay) {
			System.out.println("No hay ninguna cuenta que supere esa cantidad");
		}
	}

	public static void orderCercanias(Tren a[], int contador) {
		Tren sigTren=new Tren();
		for(int i=0; i<a.length-1; i++){
			for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){ 
				if(a[j].getDuracion()>a[j+1].getDuracion()){ 
					sigTren=a[j];
					a[j]=a[j+1];
					a[j+1]=sigTren;
				}   
			}
		}

		mostrarCercanias(a,contador);
	}

	public static void mostrarCercanias(Tren[] a, int contador) {
		for (int i=0;i<contador;i++) {
			if (a[i].getTipo().equalsIgnoreCase("cercanias")) {
				System.out.println(a[i].toString());
			}
		}










	}

	public static void reserva(Scanner teclado, Tren a[], int contador) {

	}

	public static int buscarPorReferencia(Scanner teclado, Tren a[], int contador) {
		//busca la cuenta por titular y devuelve su posición o -1 si no lo encuentra
		double referencia;
		referencia=teclado.nextDouble();
		for (int i=0; i<contador;i++) {
			if(referencia==a[i].getReferencia()) {
				return i;
			}
		}
		return -1;
	}

	public static int eliminar(Scanner teclado, Tren a[], int contador) {
		int pos=0;
		System.out.println("Cual es el la referencia del Tren a eliminar?");
		pos=buscarPorReferencia(teclado, a, contador);
		if (pos==-1) {
			System.out.println("No existe ");
		}else {
			a[pos]=null;
			contador--;
			System.out.println("El Tren ha sido borrado");
			for (int i=pos;i<contador;i++) {
				a[i]=a[i+1];
			}
			a[contador]=null;
		}

		return contador;	
	}
}