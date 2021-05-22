package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Documento;

public class RegistrarEnBD extends Documento {

	private Connection conexionBd;
	private String ubicacion;
	private Documento documento;

	public RegistrarEnBD(String ubicacion, Documento documento) {
		this.ubicacion = ubicacion;
		this.documento = documento;
	}

	@Override
	public String run() {
		// TODO Auto-generated method stub
		Conexion();
		String sqlUpdate = "Insert into informacion(info) values(?)";

		try {

			PreparedStatement ps = conexionBd.prepareStatement(sqlUpdate);
			String texto = documento.run();
			ps.setString(1, texto);
			ps.executeUpdate();
			ps.close();
			return texto;
		} catch (SQLException e) {
			throw new RuntimeException("Error No se pudo Guardar la informacion");
		}

	}

	public void Conexion() {
		String user = "root";
		String password = "";
		try {
			this.conexionBd = DriverManager.getConnection(this.ubicacion, user, password);
		} catch (SQLException ex) {
			throw new RuntimeException(ex);
		}

	}

}
