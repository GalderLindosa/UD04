package ejercicio4;

public class Cuentas {

	private String titular;
	private double cantidad;
	
	public Cuentas() {
		this.cantidad=0;
		this.titular="";
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public void ingresar(double cantidad) {
		
	}
	
	public void retirar(double cantidad) {
		
	}
	
	
	@Override
	public String toString() {
		return "Cuentas [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
}
