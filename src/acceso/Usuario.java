package acceso;

public class Usuario {
	
	private int idUsuario;
	private String usuario, sesion;
	private byte[] clave;

	//METODOS GETTERS Y SETTERS
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public byte[] getClave() {
		return clave;
	}
	public void setClave(byte[] clave) {
		this.clave = clave;
	}
	public String getSesion() {
		return sesion;
	}
	public void setSesion(String sesion) {
		this.sesion = sesion;
	}
}
