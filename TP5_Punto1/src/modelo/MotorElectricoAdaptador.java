package modelo;

public class MotorElectricoAdaptador implements Motor {

	private MotorElectrico motorElectrico;

	public MotorElectricoAdaptador() {
		super();
		System.out.println("Creando motor electrico adaptador");
		this.motorElectrico = new MotorElectrico();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrancar() {
		// TODO Auto-generated method stub
		System.out.println("Arrancar motor electrico adaptador");
		this.motorElectrico.conectar();
		this.motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Acelerar motor electrico adaptador");
		this.motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagar motor electrico adaptador");
		this.motorElectrico.detener();
		this.motorElectrico.desconectar();
	}

}
