package main;

import modelo.MotorComun;
import modelo.MotorEconomico;
import modelo.Motor;
import modelo.MotorElectricoAdaptador;

public class Main {

	public static void main(String args[]) {

		System.out.println("Motor Comun:");
		Motor motorComun = new MotorComun();
		motorComun.arrancar();
		motorComun.acelerar();
		motorComun.apagar();
		System.out.println("----------------------");

		System.out.println("Motor Economico:");
		Motor motorEconomico = new MotorEconomico();
		motorEconomico.arrancar();
		motorEconomico.acelerar();
		motorEconomico.apagar();
		System.out.println("----------------------");

		System.out.println("Motor Electrico:");
		Motor motorElectrico = new MotorElectricoAdaptador();
		motorElectrico.arrancar();
		motorElectrico.acelerar();
		motorElectrico.apagar();

	}

}
