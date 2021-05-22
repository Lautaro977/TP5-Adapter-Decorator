package decorador;

import modelo.Combo;

public class Papas extends AumentarPedidoDecorador {

	private Combo combo;

	public Papas(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String obtenerDescripcion() {
		// TODO Auto-generated method stub
		return this.combo.obtenerDescripcion() + "+ Porcion de Papas";
	}

	@Override
	public Double precio() {
		// TODO Auto-generated method stub
		return this.combo.precio() + 40;
	}

}
