package modelo;

public class MotorEconomico implements Motor {

	public MotorEconomico() {
		super();
		System.out.println("Crea motor Economico");
	}

	public void arrancar() {
		System.out.println("Arrancar motor Economico");
	}

	public void acelerar() {
		System.out.println("Acelerar motor Economico");
	}

	public void apagar() {
		System.out.println("Apagar motor Economico");
	}

}
