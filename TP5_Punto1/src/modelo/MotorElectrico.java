package modelo;

public class MotorElectrico {

	private boolean conectado = false;

	public MotorElectrico() {
		System.out.println("Crear motor electrico");
		this.conectado = false;
	}

	public void conectar() {
		System.out.println("Conectando motor electrico");
		this.conectado = true;
	}

	public void activar() {
		if (!this.conectado) {
			System.out.println("No se puede activar por que no esta conectado el motor electrico");
		} else {
			System.out.println("Activar motor electrico");
		}

	}

	public void moverMasRapido() {
		if (!this.conectado) {
			System.out.println("No se puede mover mar rapido por que no esta conectado el motor electrico");
		} else {
			System.out.println("Mover mas rapido motor electrico");
		}

	}

	public void detener() {
		if (!this.conectado) {
			System.out.println("No se puede detener por que no esta conectado el motor electrico");
		} else {
			System.out.println("Detener motor electrico");
		}

	}

	public void desconectar() {
		if (!this.conectado) {
			System.out.println("No se puede desconectar por que no esta conectado el motor electrico");
		} else {
			System.out.println("Desconectar motor electrico");
			this.conectado = false;
		}

	}

}
