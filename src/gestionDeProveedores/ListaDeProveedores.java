package gestionDeProveedores;

import java.util.ArrayList;

public class ListaDeProveedores {
	
	private static ArrayList<Proveedor> listaDeProveedores = new ArrayList<>();

	public static ArrayList<Proveedor> getLista(){
		return listaDeProveedores;
	}
	
	public static void agregarElemento(Proveedor p){
		listaDeProveedores.add(p);
	}

	public static void modificarElemento(int indice, Proveedor p){
		listaDeProveedores.remove(indice);
		listaDeProveedores.add(indice, p);
	}

	public static Proveedor mostrarElemento(int indice){
		return listaDeProveedores.get(indice);
	}

	public static void eliminarElemento(int indice){
		listaDeProveedores.remove(indice);
	}
	
	public static int buscarElementoPorCodigo(int codigo) {
		int resultado = -1;
		for(int i=0; i<listaDeProveedores.size(); i++) {
				int listaCodigo = listaDeProveedores.get(i).getCodigo();
				if (listaCodigo==(codigo)){
					resultado = i;
				}
			}
		return resultado;
	}

	public static int buscarElementoPorNombre(String nombre) {
		int resultado = -1;
		for(int i=0; i<listaDeProveedores.size(); i++) {
				String listaNombre = listaDeProveedores.get(i).getNombre().trim();
				if (listaNombre.equalsIgnoreCase(nombre)){
					resultado = i;
				}
			}
		return resultado;
	}

	public static boolean verificarCuit(long cuit) {
		for(int i=0; i<listaDeProveedores.size(); i++) {
				long listaCuit = listaDeProveedores.get(i).getCuit();
				if (listaCuit==(cuit)){
					return true;
				}
			}
		return false;
	}

	public static boolean sinElementos(){
		if(listaDeProveedores.size()<=0){
			return true;
		}
		return false;
	}
}
