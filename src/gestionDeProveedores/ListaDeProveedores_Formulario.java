package gestionDeProveedores;

import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import utilitarios.*;

public class ListaDeProveedores_Formulario extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5324357507684223172L;
	private JPanel formulario, panelDeBotones;
	static JTextField textBuscador;
	private JButton btnSeleccionar, btnCerrar;

	public ListaDeProveedores_Formulario(){
		setTitle("");
		setResizable(false);
		setUndecorated(true);
		setBounds(650, 430, 440, 220);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		formulario = new JPanel();
		formulario.setLayout(null);
		formulario.setBorder(new TitledBorder(null, "", TitledBorder.CENTER, TitledBorder.BELOW_BOTTOM, null, null));
		formulario.setLayout(null);
		setContentPane(formulario);
	
		
		JLabel lblTituloPrincipal = new JLabel();
			setTitulo(lblTituloPrincipal, "Arial", 28, 50,110,110, "Lista de Proveedores", 10, 0, 340, 36);
			lblTituloPrincipal.setHorizontalAlignment(SwingConstants.LEFT);
		JSeparator separadorSup = new JSeparator();
			separadorSup.setBounds(10, 36, 418, 2);
			add(separadorSup);

		//CAJA DE TEXTO PARA REALIZAR BUSQUEDA	
		textBuscador = new JTextField();
			setCajaDeTexto(textBuscador, 255,240,225, 2, "Numero", 6, 7, 190, 52, 21);

		
		JList lstLista = new JList();
		lstLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lstLista.setBounds(10, 47, 418, 124);
		lstLista.setFont(new Font("Arial", Font.PLAIN, 12));
		lstLista.setForeground(new Color(0, 0, 0));
		lstLista.setBackground(new Color(255,240,225));
		lstLista.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		lstLista.setModel(datosLista());
		lstLista.setSelectedIndex(0);
		add(lstLista);
		lstLista.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {if(arg0.getKeyCode() == KeyEvent.VK_ENTER) btnSeleccionar.doClick();}});
		lstLista.addMouseListener(new MouseAdapter() {
		    public void mouseClicked(MouseEvent e) {if(e.getClickCount()==2) btnSeleccionar.doClick();}});
	
		panelDeBotones = new JPanel();
			FlowLayout disposicionDeBotones = (FlowLayout) panelDeBotones.getLayout();
			disposicionDeBotones.setVgap(7);
			disposicionDeBotones.setHgap(3);
			disposicionDeBotones.setAlignment(FlowLayout.RIGHT);
			panelDeBotones.setBackground(new Color(50,110,110));
			panelDeBotones.setBounds(0, 180, 438, 38);
			add(panelDeBotones);

		
		btnSeleccionar = new JButton("Seleccionar");
			setBoton(btnSeleccionar, true);
		btnCerrar = new JButton("Cerrar");
			setBoton(btnCerrar, true);

			
		//EVENTO BUSCADOR ---------------------------------------------------------------
		textBuscador.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
					if(arg0.getKeyCode() == KeyEvent.VK_ENTER){
						int indice;
						String mensaje = "";
						if(String_Numerico.esNumerico(textBuscador.getText().trim())){
							int codigo = Integer.parseInt(textBuscador.getText());
							indice = ListaDeProveedores.buscarElementoPorCodigo(codigo);
							mensaje = "El código ingresado No figura registrado.";
						}else{
							String nombre = textBuscador.getText().trim();
							indice = ListaDeProveedores.buscarElementoPorNombre(nombre);
							mensaje = "El nombre ingresado No figura registrado.";
						}
							if(indice<0){
								lstLista.setSelectedIndex(0);
								JOptionPane.showMessageDialog(null, mensaje);
								textBuscador.setText("");
								textBuscador.requestFocus();
							}else{
								lstLista.setSelectedIndex(indice);
								lstLista.requestFocus();
							}
					} 
			}
		});

	
		//EVENTO DE BOTON SELECCIONAR ----------------------------------------------------
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Proveedor_Formulario.cargarBusqueda(lstLista.getSelectedIndex());
				cerrarFormulario();
	
			}
		});
	
		
		//EVENTO DE BOTON CERRAR ---------------------------------------------------------
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrarFormulario();
			}
		});
				
}
	
	
	//METODO CERRAR
	public void cerrarFormulario(){
		this.dispose();
	}

	//METODOS DE MANIPULACION DE DATOS
	public DefaultListModel datosLista(){
		DefaultListModel  miarray = new DefaultListModel();
		Iterator<Proveedor> iteradorProveedor = ListaDeProveedores.getLista().iterator();
			while(iteradorProveedor.hasNext()){
				Proveedor proveedor = iteradorProveedor.next();
				String codigo = Proveedor_Formulario.rellenarCodigo(Integer.toString(proveedor.getCodigo()));
				String datos = codigo+" --- "+proveedor.getNombre()+"  --- Calificación: "+proveedor.getCalificacionPromedio();
				miarray.addElement(datos);
			}
			return miarray;
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
	
	public void setCajaDeTexto(JTextField nom, int r, int g, int b, int alineacion, 
			String tipoDeDato, int longitud, int horizontal, int vertical, int ancho, int alto) {
		nom.setFont(new Font("Arial", Font.PLAIN, 12));
		nom.setHorizontalAlignment(alineacion);
		nom.setForeground(new Color(0, 0, 0));
		nom.setBackground(new Color(r, g, b));
		Limitar_CajaDeTexto.limitar(nom, longitud);
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
