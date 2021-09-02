package utilitarios;

import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Validar_CajaDeTexto{
	
	public static void validar(JTextField cajaDeTexto, String tipoDeDato){
		cajaDeTexto.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				char tecla = e.getKeyChar();
				if(tipoDeDato=="Numero"){
					//DETERMINA SI LA TECLA OPRIMIDA FUE UNA LETRA
					if(Character.isLetter(tecla)){
						e.consume();
						emitirSonido();
					}
				}else if(tipoDeDato=="Letra"){
					//DETERMINA SI LA TECLA OPRIMIDA FUE UN NUMERO
					if(Character.isDigit(tecla)){
						e.consume();
						emitirSonido();
					}					
				}else if(tipoDeDato=="Decimal"){
					//DETERMINA SI LA TECLA OPRIMIDA FUE UNA LETRA
					if(Character.isLetter(tecla)){
						e.consume();
						emitirSonido();
					}else{
						String cadena = cajaDeTexto.getText().trim()+tecla;
						//VALIDA EL INGRESO DE MAS DE UN PUNTO "."
						int contador = 0;
						int posicion = cadena.indexOf(".");
						while(posicion != -1){
							contador++;	
							posicion = cadena.indexOf(".", posicion + 1);
						}
						if(contador>1 || cadena.indexOf(".")==0) {
							e.consume();
							emitirSonido();
						};
						//VALIDA EL INGRESO DE TECLAS ILEGALES
						String textoIlegal = "ª!¡·$%&/()=?¿º|@#~€¬'`+´ç,-;:_¨Ç*^[]{}<>";
						if(teclaIlegalDecimal(cadena, textoIlegal)){
							e.consume();
							emitirSonido();
						}
						//VALIDA EL VALOR MAXIMO
						if(Character.isDigit(tecla)){
							if(valorMaximoDecimal(cadena, 9.9)){
								e.consume();
								emitirSonido();
							}
						}
					}
				}
			}
		});
	}

	public static boolean teclaIlegalDecimal(String texto, String textoIlegal){
		for(int i=0; i<texto.length(); i++){
			for(int j=0; j<textoIlegal.length(); j++){
				if(texto.charAt(i)==textoIlegal.charAt(j)){
			        return true;
				}
			}
		}
		return false;
	}
	
	public static boolean valorMaximoDecimal(String decimal, Double valorMax){
		if(decimal.length()>0){
			double valorIngresado=Double.parseDouble(decimal);
			if(valorIngresado>valorMax){
				return true;
			}
		}
		return false;
	}
	
	public static boolean simboloPermitido(String texto, String simbolo, int simboloMax){
		int contador=0;
		for(int i=0; i<texto.length(); i++){
			for(int j=0; j<simbolo.length(); j++){
				if(texto.charAt(i)==simbolo.charAt(j)){
					contador++;
				}
			}
		}
		if(contador>=simboloMax){
			return true;
		}
		return false;
	}
	
	public static void emitirSonido(){
		Toolkit tk = Toolkit.getDefaultToolkit();
	    tk.beep();
	}
}
