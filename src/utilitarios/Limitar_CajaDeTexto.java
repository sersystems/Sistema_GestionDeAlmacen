package utilitarios;

import javax.swing.JTextField;

import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Limitar_CajaDeTexto{
	
	public static void limitar(JTextField cajaDeTexto, int longitudMaxima){
		cajaDeTexto.addKeyListener(new KeyAdapter(){
			public void keyTyped(KeyEvent e) {
				int longitud = cajaDeTexto.getText().length();
				if(longitud>longitudMaxima){
					e.consume();
					emitirSonido();
				}
			}
		});
	}
	public static void emitirSonido(){
		Toolkit tk = Toolkit.getDefaultToolkit();
	    tk.beep();
	}
}
