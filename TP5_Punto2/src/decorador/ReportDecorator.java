package decorador;

import java.io.File;

//decorador
public class ReportDecorator implements Report {

	private Report reportInicial;

	public ReportDecorator(Report reportInicial) {
		this.reportInicial = reportInicial;
	}

	@Override
	public void export(File file) {
		// TODO Auto-generated method stub
		if (file.exists()) {
			throw new IllegalArgumentException("El archivo ya existe...");
		}
		this.reportInicial.export(file);

	}

}
