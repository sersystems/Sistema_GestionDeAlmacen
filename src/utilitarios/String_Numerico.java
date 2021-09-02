package utilitarios;

public class String_Numerico {
	
	//DETERMINA SI UN STRING CONTIENE UNICAMENTE NUMEROS
	public static boolean esNumerico(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException e){
			return false;
		}
	}
	
}
