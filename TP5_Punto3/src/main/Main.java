package main;

import decorador.Carne;
import decorador.Papas;
import decorador.Queso;
import decorador.Tomate;
import modelo.Combo;
import modelo.ComboBasico;
import modelo.ComboEspecial;
import modelo.ComboFamiliar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Combo comboBasico = new Tomate(new Queso(new ComboBasico()));
		Combo comboFamiliar = new Queso(new Carne(new ComboFamiliar()));
		Combo comboEspecial = new Tomate(new Papas(new ComboEspecial()));
		System.out.println("Combo Basico con Pedido extra de Queso y Tomate ");
		System.out.println("DESCRIPCION:" + comboBasico.obtenerDescripcion());
		System.out.println("PRECIO:" + comboBasico.precio());
		System.out.println("------------------------------------------------------------");
		System.out.println("Combo Familiar con Pedido extra de Carne y Queso");
		System.out.println("DESCRIPCION:" + comboFamiliar.obtenerDescripcion());
		System.out.println("PRECIO:" + comboFamiliar.precio());
		System.out.println("------------------------------------------------------------");
		System.out.println("Combo Espacial con Pedido extra de Papas y Tomate");
		System.out.println("DESCRIPCION:" + comboEspecial.obtenerDescripcion());
		System.out.println("PRECIO:" + comboEspecial.precio());

	}

}
