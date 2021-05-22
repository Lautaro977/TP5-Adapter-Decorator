package Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import decorador.Report;
import decorador.ReportBase;
import decorador.ReportDecorator;

class TestReport {

	@Test
	void testExport() {

		Report reporte = new ReportBase("hola como estas");
		File file = new File("C:\\Users\\lauta\\Desktop\\Archivos Tipo Documento de POO 2\\Archivo-tp5-punto2.txt");
		assertDoesNotThrow(() -> reporte.export(file));

	}

	@Test
	void testFileNull() {

		Report reporte = new ReportBase("hola como Test Archivo es Null");
		File file = null;
		assertThrows(IllegalArgumentException.class, () -> reporte.export(file));

	}

	@Test
	void testFileYaExiste() throws IOException {

		Report reporte = new ReportDecorator(new ReportBase("hola como Test Archivo Existe"));
		File file = new File("C:\\Users\\lauta\\Desktop\\Archivos Tipo Documento de POO 2\\Archivo-tp5-punto2.txt");
		if (file.exists()) {

		} else {
			try {
				file.createNewFile();
			} catch (IOException e) {
				throw new IOException("no anda", e);
			}
		}

		assertThrows(IllegalArgumentException.class, () -> reporte.export(file));

	}

}
