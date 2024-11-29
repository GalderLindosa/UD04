package ejercicio4;
import java.util.Scanner;
public class MainEjercicio4 {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 Scanner teclado = new Scanner(System .in); 
			 int menu=0 ;
			 Cuentas a[] = new Cuentas [5];
			 int contador=0;
			 
			 do {
				 menu=menu(teclado);
				 switch (menu) {
				 case 1:
					 contador= introducir(teclado, a, contador);
					 break;
				 case 2:
					 if (contador>0) {
						 mostrar( a,contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					 break;
				 case 3:
					 if (contador>0) {
						 ingCant(teclado, a, contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					 
					 break;
				 case 4:
					 if (contador>0) {
						 retirarComision(a,contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					
					 break;
				 case 5:
					 if (contador>0) {
						 mostMay(a, contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					
					 break;
				 case 6:
					 if (contador>0) {
						 mayorQue(teclado,a, contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					 break;
				 case 7:
					 if (contador>0) {
						 mostrarTitular(teclado,a, contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					 break;
				 case 8: 
					 if (contador>0) {
						 mostrarTitularLetras(teclado,a, contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					 break;
				 case 9: 
					 if (contador>0) {
						 ordenar(a, contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					 break;
				 case 10: // eliminar y compactar
					 if (contador>0) {
						 contador= eliminar(teclado, a, contador);
					 }else {
						 System.out.println("No hay cuentas");
					 }
					 break;
					 
				 case 11:
					 System.out.println("Hasta la vista!");
					 break;
				 default: 
					 System.out.println("Opcion incorrecta");
					 menu=11;
					 break;
				 	}
			 }while(menu!=11);	 
			 teclado.close();
		}

		public static int menu(Scanner teclado) {
			 int menu;
			 System.out.println("1. Introducir cuenta/s.");
			 System.out.println("2. Muestra las cuentas introducidas");
			 System.out.println("3. Ingresar una cantidad a un titular concreto introducido por teclado (Llama al método ingresar y controla la posibilidad de que no exista el titular)");
			 System.out.println("4. Retirar de todas las cuentas introducidas, la comisión de 12€ (Llama al método retirar)");
			 System.out.println("5. Muestra la cuenta de mayor saldo.");
			 System.out.println("6. Muestras las cuentas que tengan saldo superior a uno introducido por teclado. Si no hay, mensaje indicándolo.");
			 System.out.println("7. Muestra la cuenta de un titular concreto. Controlar si no encuentra.");
			 System.out.println("8. Muestra las cuentas de los titulares que contengan un grupo de letras, introducido por teclado, en su atributo titular");
			 System.out.println("9. Ordena y muestra las cuentas según su saldo (de mayor a menor saldo).");
			 System.out.println("10. Salir");
			 menu = teclado.nextInt();
			 return menu;
		}
	
		public static int introducir(Scanner teclado, Cuentas a[], int contador) {
			String respuesta="";
			String titular;
			if (contador>a.length) {
				System.out.println("Error. No puedes introducir más cuentas ");
			}else {
				for (int i = contador; i < a.length && !respuesta.equalsIgnoreCase("no"); i++) {
					Cuentas c1=new Cuentas();
					a[i]=c1;
					System.out.println("Quien es el titular de la cuenta?");
					titular=teclado.next();
					 if(buscarTitular(titular,a,contador)==-1) {
						a[i].setTitular(titular);
						System.out.println("Cuanta es la cantidad de dinero en la cuenta?");
						a[i].setCantidad(teclado.nextDouble());
						contador++;
					 }else {
						 System.out.print("El titular ya existe");
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

		public static void mostrar( Cuentas a[], int contador) {
			for (int i=0;i<contador;i++) {
				System.out.println(a[i].toString());
			}
		}

		public static void ingCant(Scanner teclado, Cuentas a[],int contador) {
			double dinero;
			int pos=buscarPorTitular(teclado, a,contador);
			if (pos==-1) {
				System.out.println("No existe");
			}else {
				System.out.println("Cuanto es la cantidad de dinero a ingresar?");
				dinero = teclado.nextDouble();
				a[pos].ingresar(dinero); 
				System.out.println("Se ha ingresado correctamente");
			}
			
		}
		
		public static int buscarTitular(String titular, Cuentas a[], int contador) {
			//busca la cuenta por titular y devuelve su posición o -1 si no lo encuentra
			
			
			
			for (int i=0; i<contador;i++) {
				if(titular.equalsIgnoreCase(a[i].getTitular())) {
					return i;
				}
			}
			return -1;
		}
	
		public static int buscarPorTitular(Scanner teclado, Cuentas a[], int contador) {
				//busca la cuenta por titular y devuelve su posición o -1 si no lo encuentra
				String titular;
				
				System.out.println("A que titular le quieres ingresar dinero?");
				titular=teclado.next();
				for (int i=0; i<contador;i++) {
					if(titular.equalsIgnoreCase(a[i].getTitular())) {
						return i;
					}
				}
				return -1;
			}

		public static void retirarComision( Cuentas a[], int contador) {
				
				for (int i=0; i<contador;i++) {
					a[i].retirar(12);
				}
				System.out.println("Los 12 Euros se han retirado correctamente");
			}
			
		public static void mostMay(Cuentas a[], int contador) {
				double mayor=0;
				int pos=-1;
				
					for (int i=0; i<contador;i++) {
						if (a[i].getCantidad()>mayor) {
							mayor=a[i].getCantidad();
							pos=i;
						}
					
					System.out.println("La cuenta con mayor cantidad de dinero es: "+a[pos].toString());
				}
			}
	
		public static void mayorQue(Scanner teclado, Cuentas a[], int contador) {
				double cantidad;
				boolean hay=false;
				System.out.println("Introduce la cantidad: ");
				cantidad=teclado.nextDouble();
				for (int i=0; i<contador;i++) {
					if (cantidad>a[i].getCantidad()) {
						hay =true;
						System.out.println(a[i].toString());
					}
				}
				if (!hay) {
					System.out.println("No hay ninguna cuenta que supere esa cantidad");
				}
			}
			
		public static void mostrarTitular(Scanner teclado, Cuentas a[], int contador) {
				int pos=buscarPorTitular(teclado, a, contador);
				if (pos==-1) {
					System.out.println("No existe"); 
				}else {
					System.out.println(a[pos].toString()); 
				}
			}
			
		public static void mostrarTitularLetras(Scanner teclado, Cuentas a[], int contador) {
				String cad;
				System.out.println("Introduce la cadena de caracteres: ");
				cad=teclado.next().toLowerCase();
				for (int i=0; i<contador;i++) {
					if (a[i].getTitular().toLowerCase().contains(cad)) {
						System.out.println(a[i].toString());
					}
				}
				
			}
		
		public static void ordenar(Cuentas a[], int contador) {
				Cuentas sigCuen=new Cuentas();
		        for(int i=0; i<a.length-1; i++){
		               for(int j=0; j<(a.length-1-i) && a[j+1]!=null; j++){ 
		                    if(a[j].getCantidad()<a[j+1].getCantidad()){ 
		                            sigCuen=a[j];
		                            a[j]=a[j+1];
		                            a[j+1]=sigCuen;
		                     }   
		               }
		          }
		        
		        mostrar(a,contador);
			}
			
		public static int eliminar(Scanner teclado, Cuentas a[], int contador) {
				int pos=buscarPorTitular(teclado, a, contador);
				if (pos==-1) {
					System.out.println("No existe ");
				}else {
					a[pos]=null;
					contador--;
					System.out.println("El titular ha sido borrado");
					for (int i=pos;i<contador;i++) {
						a[i]=a[i+1];
					}
					a[contador]=null;
				}
					
				return contador;	
					
			}	
				
			
			
			
			
			
			
	}

