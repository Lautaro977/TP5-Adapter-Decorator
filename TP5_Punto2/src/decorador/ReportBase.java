package decorador;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//decorado
public class ReportBase implements Report {

	private String reporte;

	public ReportBase(String reporte) {
		this.reporte = reporte;
	}

	@Override
	public void export(File file) {
		// TODO Auto-generated method stub

		if (file == null) {
			throw new IllegalArgumentException("File es NULL; no puedo exportar...");
		}

		try {
			Files.write(Paths.get(file.getPath()), this.reporte.getBytes(), StandardOpenOption.CREATE);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo persistir...", e);
		}

	}

}
