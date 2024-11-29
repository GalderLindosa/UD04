package repaso;

public class Tren {

	private String tipo;
	private int referencia;
	private int asientos;
	private int recorrido;
	private int duracion;

	public void Tren(String tipo) {
		this.tipo="Indefinido";
		this.asientos=0;
		this.duracion=0;
		this.recorrido=0;
		this.referencia=0;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getReferencia() {
		return referencia;
	}

	public void setReferencia(int referencia) {
		this.referencia = referencia;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public double getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(int recorrido) {
		this.recorrido = recorrido;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientos=" + asientos + ", recorrido="
				+ recorrido + ", duracion=" + duracion + "]";
	}
	
	
	public boolean trenLLeno() {
		if (this.getAsientos()>400) {
			System.out.println("El tren se encuentra lleno");
		}
		return false;
		
	}
	
	public double obtenerVelocidadTotal() {
			return this.recorrido/(this.duracion/60);
	}
	
}
