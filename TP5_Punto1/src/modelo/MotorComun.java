package modelo;

public class MotorComun implements Motor {

	public MotorComun() {
		super();
		System.out.println("Crea motor Comun");
	}

	public void arrancar() {
		System.out.println("Arrancar motor Comun");
	}

	public void acelerar() {
		System.out.println("Acelerar motor Comun");
	}

	public void apagar() {
		System.out.println("Apagar motor Comun");
	}

}
