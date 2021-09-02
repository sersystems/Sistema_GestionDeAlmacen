package utilitarios;

public class Asignar_Codigo {

	static int ultimoCodigoRegistrado = 100;
	
	public static void setCodigo(int codigo){
		int nuevoCodigo = codigo+1;
		ultimoCodigoRegistrado = nuevoCodigo;
	}
	
	public static int getCodigo(){
		return ultimoCodigoRegistrado;
	}	
}
