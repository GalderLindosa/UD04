package repaso3;

import java.util.Scanner;

public class MainLibros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Scanner teclado = new Scanner(System .in);
    	Libro a[]= new Libro[3];
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
            		porcentajeAprov( teclado,a,contador);
            	}else {
                	System.out.println("No hay Libros");
            	}       	 
            	break;
        	case 3:
            	if (contador>0) {
            		ordenAprovados(a,contador);
            	}else {
                	System.out.println("No hay Libos");
            	}    
            	break;
        	case 4:
            	if (contador>0) {
            		modificar( teclado, a,contador);
            	}else {
                	System.out.println("No hay Libros");
            	}   	 
            	break;
        	case 5:
            	if (contador>0) {
                	mostrar( a,contador);
            	}else {
                	System.out.println("No hay Libros");
            	}       	 
            	break;
        	case 6:
            	if (contador>0) {
                	contador=eliminar( teclado, a,contador);
            	}else {
                	System.out.println("No hay Libros");
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
    	System.out.println("1. Introducir los libros");
    	System.out.println("2. Mostrar los libros de un autor en concreto");
    	System.out.println("3. Ordenar los libros SuperVentas por número de ejemplares vendidos");
    	System.out.println("4. Eliminar un libro concreto");
    	System.out.println("5. Mostrar todos los libros que se han introducido");
    	System.out.println("6. Eliminar asignatura");
    	System.out.println("7. Modificar libro");
    	System.out.println("8. Salir");
    	menu = teclado.nextInt();
    	return menu;
	}

	public static int introducir(Scanner teclado, Libro a[], int contador) {
    	String respuesta="";
    	int ISBN;
    	if (contador>a.length) {
        	System.out.println("Error. No puedes introducir más Libros ");
    	}else {
        	for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
            	Libro a1=new Libro();
				a[i]=a1;
            	System.out.println("Introduce el ISBN del libro?");
            	ISBN=teclado.nextInt();
            	if(buscarISBN(teclado,ISBN,a,contador)==-1) {
                	a[i].setISBN(ISBN);
                	System.out.println("Introduce el nombre del libro?");
                	a[i].setTitulo(teclado.next());
                	System.out.println("Intorduce el nombre del autor ?");
                	a[i].setAutor(teclado.next());
                	System.out.println("Introduce el numero de ejemplares vendidos?");
                	a[i].setVentas(teclado.nextInt());
                	System.out.println("Introduce el precio del libro?");
                	a[i].setPrecio(teclado.nextInt());
                	contador++;
            	}else {
                	System.out.println("Ya hay un libro con ese ISBN ");
            	}
            	do {
                	System.out.print("Quiere añadir otra libro?: ");
                	respuesta = teclado.next();

                	if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no")) {
                    	System.out.println("Las opciones válidas son Si/No");
                	}
            	} while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("no"));
        	}
    	}
    	return contador;
	}

	public static int buscarPorISBN(Scanner teclado, Libro a[], int contador) {
		int ISBN;
		ISBN=teclado.nextInt();
		for (int i=0; i<contador;i++) {
			if(ISBN==a[i].getISBN()) {
				return i;
			}
		}
		return -1;
	}

	public static int buscarISBN(Scanner teclado,int ISBN, Libro a[], int contador) {
		for (int i=0; i<contador;i++) {
			if(ISBN==a[i].getISBN()) {
				return i;
			}
		}
		return -1;
	}	
	
	
	
	
	
	
	
	
	
}
