package decorador;

import modelo.Combo;

public class Carne extends AumentarPedidoDecorador {

	private Combo combo;

	public Carne(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String obtenerDescripcion() {
		// TODO Auto-generated method stub
		return this.combo.obtenerDescripcion() + "+ Porcion de Carne";
	}

	@Override
	public Double precio() {
		// TODO Auto-generated method stub
		return this.combo.precio() + 50;
	}

}
