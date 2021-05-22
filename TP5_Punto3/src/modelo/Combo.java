package modelo;

public abstract class Combo {

	public String descripcion = "";

	public String obtenerDescripcion() {
		return this.descripcion;
	}

	public abstract Double precio();

}
