package utilitarios;

import java.util.regex.*;
import javax.swing.JOptionPane;

public class Validar_Correo {
	 
	private static final String PATRON_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			 + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	    
	    public static boolean validar(String correo) {
	        Pattern pattern = Pattern.compile(PATRON_EMAIL);
	        Matcher matcher = pattern.matcher(correo);
	        if(!matcher.matches()){
				JOptionPane.showMessageDialog(null, "El formato del correo ingresado es erróneo.");
	        }
	        return matcher.matches();
	    }
}
