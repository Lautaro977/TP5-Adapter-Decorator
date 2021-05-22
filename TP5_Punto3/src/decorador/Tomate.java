package decorador;

import modelo.Combo;

public class Tomate extends AumentarPedidoDecorador {

	private Combo combo;

	public Tomate(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String obtenerDescripcion() {
		// TODO Auto-generated method stub
		return this.combo.obtenerDescripcion() + "+ Porcion de Tomate";
	}

	@Override
	public Double precio() {
		// TODO Auto-generated method stub
		return this.combo.precio() + 20;
	}

}
