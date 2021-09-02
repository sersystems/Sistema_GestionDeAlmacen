package acceso;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import menu.Menu_Formulario;
import utilitarios.Encriptar_Cadena;
import utilitarios.Limitar_CajaDeTexto;

public class Acceso_Formulario extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1452181533421952639L;
	private JPanel formulario, panelDeBotones;
	static JTextField textUsuario, textSesion;
	private JPasswordField passClave;
	private JButton btnAceptar, btnSalir;

	public Acceso_Formulario(){
		setTitle("");
		setResizable(false);
		setUndecorated(true);
		setBounds(450, 300, 440, 220);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		formulario = new JPanel();
		formulario.setLayout(null);
		formulario.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.BELOW_BOTTOM, null, null));
		formulario.setLayout(null);
		setContentPane(formulario);
		

		JLabel lblTituloPrincipal = new JLabel();
			setTitulo(lblTituloPrincipal, "Arial", 28, 50,110,110, "Acceso Al Sistema", 10, 0, 340, 36);
			lblTituloPrincipal.setHorizontalAlignment(SwingConstants.LEFT);
		JSeparator separadorSup = new JSeparator();
			separadorSup.setBounds(10, 36, 418, 2);
			add(separadorSup);

			
		int t = 12, c1 = 50, c2 = 110, c3 = 110;
		JLabel lblUsuario = new JLabel();
			setTitulo(lblUsuario, "Arial", t, c1,c2,c3, "Nombre de Usuario", 16, 79, 130, 17);
		JLabel lblClave = new JLabel();
			setTitulo(lblClave, "Arial", t, c1,c2,c3, "Clave", 16, 115, 130, 17);

		
		textUsuario = new JTextField();
		textUsuario.setFont(new Font("Arial", Font.PLAIN, 12));
		textUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		textUsuario.setForeground(new Color(0, 0, 0));
		textUsuario.setBackground(new Color(255,240,225));
		Limitar_CajaDeTexto.limitar(textUsuario, 10);
		textUsuario.setBounds(150, 78, 150, 21);
		add(textUsuario);
		textUsuario.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {if(arg0.getKeyCode() == KeyEvent.VK_ENTER) passClave.requestFocus();}});

		passClave = new JPasswordField();
		passClave.setFont(new Font("Arial", Font.PLAIN, 12));
		passClave.setHorizontalAlignment(SwingConstants.LEFT);
		passClave.setForeground(new Color(0, 0, 0));
		passClave.setBackground(new Color(255,240,225));
		Limitar_CajaDeTexto.limitar(passClave, 10);
		passClave.setBounds(150, 114, 150, 21);
		add(passClave);
		passClave.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {if(arg0.getKeyCode() == KeyEvent.VK_ENTER) btnAceptar.doClick();}});
		

		panelDeBotones = new JPanel();
		FlowLayout disposicionDeBotones = (FlowLayout) panelDeBotones.getLayout();
		disposicionDeBotones.setVgap(7);
		disposicionDeBotones.setHgap(3);
		disposicionDeBotones.setAlignment(FlowLayout.RIGHT);
		panelDeBotones.setBackground(new Color(50,110,110));
		panelDeBotones.setBounds(0, 180, 438, 38);
		add(panelDeBotones);

	
		btnAceptar = new JButton("Aceptar");
		setBoton(btnAceptar, true);
		btnSalir = new JButton("Salir");
		setBoton(btnSalir, true);

		
		cargarUsuarios();

		//EVENTO DE BOTON ACEPTAR -------------------------------------------------
		btnAceptar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				if(textUsuario.getText().length()>0){
					if(ListaDeUsuarios.sinElementos()==false){
						String nombre = (textUsuario.getText().trim());
						int indice = ListaDeUsuarios.buscarElementoPorNombre(nombre);
						if(indice>=0){
							byte[] byteClave = ListaDeUsuarios.mostrarElemento(indice).getClave();
							String clave = new Encriptar_Cadena().desencriptar("92AE31A79FEEB2A3", byteClave);
							if(passClave.getText().length()>0){
								if(clave.equalsIgnoreCase(passClave.getText().trim()) && passClave.getText().length()>0){
									Menu_Formulario frameMenu = new Menu_Formulario();
									frameMenu.setVisible(true);
									cerrarFormulario();	
								}else{
									JOptionPane.showMessageDialog(null, "La clave ingresada es errónea.","",2);
								}
							}else{
								JOptionPane.showMessageDialog(null, "No ha ingresado la clave del Usuario, ingréselo e intente nuevamente.","",2);
							}
						}else{
							JOptionPane.showMessageDialog(null, "El Usuario ingresado No figura registrado.","",2);
						}
					}	
				}else{
					JOptionPane.showMessageDialog(null, "No ha ingresado el nombre del Usuario, ingréselo e intente nuevamente.","",2);
				}
			}
		});
		
		//EVENTO DE BOTON SALIR --------------------------------------------------
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
	}
	
	
	//METODO TEMPORAL
	public static void cargarUsuarios(){
		Usuario nuevoUsuario1 = new Usuario();
		nuevoUsuario1.setIdUsuario(1);
		nuevoUsuario1.setUsuario("PABLO1");
		nuevoUsuario1.setClave(new Encriptar_Cadena().encriptar("92AE31A79FEEB2A3", "123456"));
		nuevoUsuario1.setSesion("GESTION DE COMPRAS");
		ListaDeUsuarios.agregarElemento(nuevoUsuario1);
		Usuario nuevoUsuario2 = new Usuario();
		nuevoUsuario2.setIdUsuario(2);
		nuevoUsuario2.setUsuario("MARIO1");
		nuevoUsuario2.setClave(new Encriptar_Cadena().encriptar("92AE31A79FEEB2A3", "sergio"));
		nuevoUsuario2.setSesion("DIRECTOR TECNICO");
		ListaDeUsuarios.agregarElemento(nuevoUsuario2);
	}
	
	//METODO CERRAR
	public void cerrarFormulario(){
		this.dispose();
	}

	//METODOS PARA LA CREACIONDE COMPONENTES
	public void setTitulo(JLabel nom, String tipoLetra, int tamanioLetra, int r, int g, int b, 
			String titulo, int horizontal, int vertical, int ancho, int alto) {
		nom.setHorizontalAlignment(SwingConstants.RIGHT);
		nom.setFont(new Font(tipoLetra, Font.PLAIN, tamanioLetra));
		nom.setForeground(new Color(r, g, b));
		nom.setText(titulo);
		nom.setBounds(horizontal, vertical, ancho, alto);
		add(nom);
	}
	
	public void setBoton(JButton nom, boolean activacion) {
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Arial", Font.PLAIN, 12));
		nom.setForeground(new Color(0, 0, 0));
		nom.setEnabled(activacion);
		panelDeBotones.add(nom);
	}
}
