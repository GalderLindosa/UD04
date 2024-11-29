package repaso3;

public class Libro {

	private int ISBN;
	private String titulo;
	private String autor;
	private int ventas;
	private int precio;
	
	public Libro() {
		this.ISBN=0;
		this.titulo="";
		this.autor="";
		this.ventas=0;
		this.precio=0;
	}

	public Libro(int i, String t, String a, int v, int p) {
		this.ISBN=i;
		this.titulo=t;
		this.autor=a;
		this.ventas=v;
		this.precio=p;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "El libro con el titulo "+titulo +" e ISBN " +ISBN +" creado por el autor " +autor +" ha vendido " +ventas +" ejemplares con el precio de "+precio+"€";
	}

	public boolean esSuperVentas() {
		if(this.ventas>18000) {
			return true;

		}
		return false;
	}

	public double obtenerBeneficioTotal() {
		double ganancias= (this.precio*this.ventas);
		return ganancias*4/100;
	}



}
