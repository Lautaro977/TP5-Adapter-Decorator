package Persistencia;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Documento;

public class RegistrarEnArchivo extends Documento {

	private String ubicacion;
	private Documento documento;

	public RegistrarEnArchivo(String ubicacion, Documento documento) {
		this.ubicacion = ubicacion;
		this.documento = documento;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		File file = new File(this.ubicacion);

		try {
			FileWriter fil = new FileWriter(file);
			String texto = documento.run();
			fil.write(texto);
			fil.close();
			return texto;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
