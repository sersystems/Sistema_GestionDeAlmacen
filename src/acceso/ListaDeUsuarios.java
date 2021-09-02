package acceso;

import java.util.ArrayList;

public class ListaDeUsuarios {
	
	private static ArrayList<Usuario> listaDeUsuarios = new ArrayList<>();

	public static ArrayList<Usuario> getLista(){
		return listaDeUsuarios;
	}
	
	public static void agregarElemento(Usuario u){
		listaDeUsuarios.add(u);
	}

	public static void modificarElemento(int indice, Usuario u){
		listaDeUsuarios.remove(indice);
		listaDeUsuarios.add(indice, u);
	}

	public static Usuario mostrarElemento(int indice){
		return listaDeUsuarios.get(indice);
	}

	public static void eliminarElemento(int indice){
		listaDeUsuarios.remove(indice);
	}
	
	public static int buscarElementoPorCodigo(int id) {
		int resultado = -1;
		for(int i=0; i<listaDeUsuarios.size(); i++) {
				int listaCodigo = listaDeUsuarios.get(i).getIdUsuario();
				if (listaCodigo==(id)){
					resultado = i;
				}
			}
		return resultado;
	}

	public static int buscarElementoPorNombre(String usuario) {
		int resultado = -1;
		for(int i=0; i<listaDeUsuarios.size(); i++) {
				String listaNombre = listaDeUsuarios.get(i).getUsuario().trim();
				if (listaNombre.equalsIgnoreCase(usuario)){
					resultado = i;
				}
			}
		return resultado;
	}

	public static boolean sinElementos(){
		if(listaDeUsuarios.size()<=0){
			return true;
		}
		return false;
	}
}
