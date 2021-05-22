package main;

import Persistencia.RegistrarEnArchivo;
import Persistencia.RegistrarEnBD;
import modelo.Documento;
import modelo.RestCall;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Documento documento = new RestCall("https://jsonplaceholder.typicode.com/posts");
		System.out.println(documento.run());

		Documento documentoArchivo = new RegistrarEnArchivo(
				"C:\\Users\\lauta\\Desktop\\Archivos Tipo Documento de POO 2\\Archivo-tp5-Punto4.txt", documento);

		documentoArchivo.run();

		Documento documentoBD = new RegistrarEnBD("jdbc:mysql://localhost:3306/documentos", documento);

		documentoBD.run();

		Documento documentoBD2 = new RegistrarEnBD("jdbc:mysql://localhost:3306/documentos", new RegistrarEnArchivo(
				"C:\\Users\\lauta\\Desktop\\Archivos Tipo Documento de POO 2\\Archivo-tp5-Punto4.txt", documento));

		documentoBD2.run();

	}

}
