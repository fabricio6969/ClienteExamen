package ec.edu.ups.appdis.g1.negocio;

import java.sql.SQLException;

import ec.edu.ups.appdis.g1.modelo.Solicitud;

public interface GestionSolicitudONRemoto  {
	public boolean registrarSolicitud(Solicitud solicitud) throws SQLException;
}
