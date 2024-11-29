package repaso2;

public class Asignatura {

	private String nombre;
	private String curso;
	private int matriculados;
	private int suspendidos;
	
	public Asignatura() {
		this.nombre="";
		this.curso="";
		this.matriculados=0;
		this.suspendidos=0;
	}
	public Asignatura(String n, String c) {
		this.nombre=n;
		this.curso=c;
		this.matriculados=0;
		this.suspendidos=0;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getmatriculados() {
		return matriculados;
	}
	public void setmatriculados(int matriculados) {
		this.matriculados = matriculados;
	}
	public int getSuspendidos() {
		return suspendidos;
	}
	public void setSuspendidos(int suspendidos) {
		this.suspendidos = suspendidos;
	}
	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", curso=" + curso + ", matriculados=" + matriculados + ", suspendidos="
				+ suspendidos + "]";
	}
	
	public double porcentajeAprobados() {
		return (((this.matriculados - this.suspendidos)*this.matriculados)/100);
	}
	
	public int obtenerNumeroAprobados() {
		return this.matriculados-this.suspendidos;
	}
}
