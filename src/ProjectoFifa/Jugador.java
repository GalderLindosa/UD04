package ProjectoFifa;

public class Jugador {
	String nombre;
public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
private int velocidad;
public int getVelocidad() {
	return velocidad;
}
public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}
public Jugador(int velocidad, int potencia, int altura, int fisico, int defensa, int regate) {
	super();
	this.velocidad = velocidad;
	this.potencia = potencia;
	this.altura = altura;
	this.fisico = fisico;
	this.defensa = defensa;
	this.regate = regate;
}
public int getPotencia() {
	return potencia;
}
public void setPotencia(int potencia) {
	this.potencia = potencia;
}
public int getAltura() {
	return altura;
}
public void setAltura(int altura) {
	this.altura = altura;
}
public int getFisico() {
	return fisico;
}
public void setFisico(int fisico) {
	this.fisico = fisico;
}
public int getDefensa() {
	return defensa;
}
public void setDefensa(int defensa) {
	this.defensa = defensa;
}
public int getRegate() {
	return regate;
}
public void setRegate(int regate) {
	this.regate = regate;
}
public Jugador() {
	
}
@Override
public String toString() {
	return nombre+" [velocidad=" + velocidad + ", potencia=" + potencia + ", altura=" + altura + ", fisico=" + fisico
			+ ", defensa=" + defensa + ", regate=" + regate + "]";
}
private int potencia;
private int altura;
private int fisico;
private int defensa;
private int regate;
}
