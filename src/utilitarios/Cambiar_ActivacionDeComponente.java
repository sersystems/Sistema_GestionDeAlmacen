package utilitarios;

import java.awt.Component;

public class Cambiar_ActivacionDeComponente {
	public static void setEnableContainer(Component[] componentes, boolean estado) {
        
		//CAMBIAR ACTIVIDAD DE UNO O MAS COMPONENTES DEL FORMULARIO
		for(int i = 0; i < componentes.length; i++){            
		 componentes[i].setEnabled(estado);
		}        
	} 
}
