package gestionDeProveedores;


public class Proveedor{

	private String estadoOperativo, nombre, regimenIva, tipoProveedor, 
	domicilio, localidad, provincia, correo, paginaWeb;
	private int codigo, codigoPostal, prefijo;
	private long cuit, telefono, celular;
	private float calificacionPromedio;
	

	//METODOS GETTER Y SETTER
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstadoOperativo() {
		return estadoOperativo;
	}

	public void setEstadoOperativo(String estadoOperativo) {
		this.estadoOperativo = estadoOperativo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCuit() {
		return cuit;
	}

	public void setCuit(long cuit) {
		this.cuit = cuit;
	}

	public String getRegimenIva() {
		return regimenIva;
	}

	public void setRegimenIva(String regimenIva) {
		this.regimenIva = regimenIva;
	}

	public String getTipoProveedor() {
		return tipoProveedor;
	}

	public void setTipoProveedor(String tipoProveedor) {
		this.tipoProveedor = tipoProveedor;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

	public float getCalificacionPromedio() {
		return calificacionPromedio;
	}

	public void setCalificacionPromedio(float calificacionPromedio) {
		this.calificacionPromedio = calificacionPromedio;
	}
}
