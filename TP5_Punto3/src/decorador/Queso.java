package decorador;

import modelo.Combo;

public class Queso extends AumentarPedidoDecorador {

	private Combo combo;

	public Queso(Combo combo) {
		this.combo = combo;
	}

	@Override
	public String obtenerDescripcion() {
		// TODO Auto-generated method stub
		return this.combo.obtenerDescripcion() + "+ Porcion de Queso";
	}

	@Override
	public Double precio() {
		// TODO Auto-generated method stub
		return this.combo.precio() + 30;
	}
}
