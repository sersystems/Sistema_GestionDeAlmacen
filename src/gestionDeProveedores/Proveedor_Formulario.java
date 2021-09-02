package gestionDeProveedores;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

import menu.Menu_Formulario;
import utilitarios.*;

public class Proveedor_Formulario extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6463803073651928380L;
	private JPanel formulario, panelDeBotones;
	private JButton btnNuevo;
	private String botonAccionado;
	private ButtonGroup grupoDeOpciones = new ButtonGroup();
	static JTextField textCodigo, textNombre, textCuit, textDomicilio, textCodigoPostal,
			textLocalidad, textProvincia, textPrefijo, textTelefono, textCelular, textCorreo,
			textPaginaWeb, textCalificacionPromedio;
	static JComboBox comboEstadoOperativo, comboRegimenIVA;
	static JRadioButton opcion1_TipoDeProveedor, opcion2_TipoDeProveedor;
	

	public Proveedor_Formulario(){
		setTitle("");
		setResizable(false);
		setBounds(200, 50, 913, 654);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		formulario = new JPanel();
		formulario.setLayout(null);
		formulario.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		formulario.setLayout(null);
		setContentPane(formulario);

			JLabel lblTituloPrincipal = new JLabel();
				setTitulo(lblTituloPrincipal, "Arial", 28, 50,110,110, "Gestión de Proveedores", 10, 0, 700, 36);
				lblTituloPrincipal.setHorizontalAlignment(SwingConstants.LEFT);
			JLabel lblVolver = new JLabel();
				setTitulo(lblVolver, "Arial", 12, 0,0,255, "<HTML><U>Volver al Menú Principal<U><HTML>", 744, 8, 139, 17);
				lblVolver.setHorizontalAlignment(SwingConstants.RIGHT);
				lblVolver.addMouseListener(new MouseAdapter() {
					public void mouseClicked(MouseEvent e) {if(e.getClickCount()==1) cerrarFormulario();}});
	
	
			JSeparator separadorSup = new JSeparator();
				separadorSup.setBounds(10, 36, 875, 2);
				add(separadorSup);
			JSeparator separadorInf = new JSeparator();
				separadorInf.setBounds(0, 588, 913, 2);
				add(separadorInf);
		
			
			int t = 12, c1 = 50, c2 = 110, c3 = 110;
			JLabel lblCodigo = new JLabel();
				setTitulo(lblCodigo, "Arial", t, c1,c2,c3, "Código", 10, 50, 200, 17);
			JLabel lblEstadoOperativo = new JLabel();
				setTitulo(lblEstadoOperativo, "Arial", t, c1,c2,c3, "Estado Operativo del Proveedor", 370, 50, 200, 17);
			JLabel lblNombre = new JLabel();
				setTitulo(lblNombre, "Arial", t, c1,c2,c3, "Nombre", 10, 86, 200, 17);
			JLabel lblCuit = new JLabel();
				setTitulo(lblCuit, "Arial", t, c1,c2,c3, "CUIT", 10, 122, 200, 17);
			JLabel lblRegimeIVA = new JLabel();
				setTitulo(lblRegimeIVA, "Arial", t, c1,c2,c3, "Régimen IVA", 348, 122, 150, 17);
			JLabel lblTipoProveedor = new JLabel();
				setTitulo(lblTipoProveedor, "Arial", t, c1,c2,c3, "Tipo de Proveedor", 10, 158, 200, 17);
			JLabel lblDomicilio = new JLabel();
				setTitulo(lblDomicilio, "Arial", t, c1,c2,c3, "Domicilio", 10, 194, 200, 17);
			JLabel lblCodigoPostal = new JLabel();
				setTitulo(lblCodigoPostal, "Arial", t, c1,c2,c3, "Código Postal", 10, 230, 200, 17);
			JLabel lblLocalidad = new JLabel();
				setTitulo(lblLocalidad, "Arial", t, c1,c2,c3, "Localidad", 10, 266, 200, 17);
			JLabel lblProvincia = new JLabel();
				setTitulo(lblProvincia, "Arial", t, c1,c2,c3, "Provincia", 10, 302, 200, 17);
			JLabel lblPrefijo = new JLabel();
				setTitulo(lblPrefijo, "Arial", t, c1,c2,c3, "Prefijo", 10, 338, 200, 17);
			JLabel lblTelefono = new JLabel();
				setTitulo(lblTelefono, "Arial", t, c1,c2,c3, "Teléfono", 10, 374, 200, 17);
			JLabel lblCelular = new JLabel();
				setTitulo(lblCelular, "Arial", t, c1,c2,c3, "Celular", 10, 410, 200, 17);
			JLabel lblCorreo = new JLabel();
				setTitulo(lblCorreo, "Arial", t, c1,c2,c3, "Correo Electrónico", 10, 446, 200, 17);
			JLabel lblPaginaWeb = new JLabel();
				setTitulo(lblPaginaWeb, "Arial", t, c1,c2,c3, "Página Web", 10, 482, 200, 17);
			JLabel lblCalificacionPromedio = new JLabel();
				setTitulo(lblCalificacionPromedio, "Arial", t, c1,c2,c3, "Calificación Promedio", 10, 518, 200, 17);
		
			
			textCodigo = new JTextField();
				setCajaDeTexto(textCodigo, 220,220,220, 0, "Numero", 6, 216, 48, 52, 21);
				textCodigo.setFont(new Font("Arial", Font.BOLD, 12));
			textNombre= new JTextField();
				setCajaDeTexto(textNombre, 255,240,225, 2, "Letra", 50, 216, 84, 492, 21);
			textCuit= new JTextField();
				setCajaDeTexto(textCuit, 255,240,225, 4, "Numero", 11, 216, 120, 96, 21);
			textDomicilio= new JTextField();
				setCajaDeTexto(textDomicilio, 255,240,225, 2, "", 50, 216, 192, 492, 21);
			textCodigoPostal= new JTextField();
				setCajaDeTexto(textCodigoPostal, 255,240,225, 4, "Numero", 5, 216, 228, 60, 21);
			textLocalidad= new JTextField();
				setCajaDeTexto(textLocalidad, 255,240,225, 2, "Letra", 30, 216, 264, 204, 21);
			textProvincia= new JTextField();
				setCajaDeTexto(textProvincia, 255,240,225, 2, "Letra", 25, 216, 300, 204, 21);
			textPrefijo= new JTextField();
				setCajaDeTexto(textPrefijo, 255,240,225, 4, "Numero", 5, 216, 336, 49, 21);
			textTelefono= new JTextField();
				setCajaDeTexto(textTelefono, 255,240,225, 4, "Numero", 8, 216, 372, 84, 21);
			textCelular= new JTextField();
				setCajaDeTexto(textCelular, 255,240,225, 4, "Numero", 10, 216, 408, 96, 21);
			textCorreo= new JTextField();
				setCajaDeTexto(textCorreo, 255,240,225, 2, "", 50, 216, 444, 492, 21);
			textPaginaWeb= new JTextField();
				setCajaDeTexto(textPaginaWeb, 255,240,225, 2, "", 50, 216, 480, 492, 21);
			textCalificacionPromedio= new JTextField();
				setCajaDeTexto(textCalificacionPromedio, 255,240,225, 4, "Decimal", 2, 216, 516, 32, 21);
			
		
			comboEstadoOperativo = new JComboBox();
				comboEstadoOperativo.setModel(new DefaultComboBoxModel(new String[] {"ACTIVO", "SUSPENDIDO"}));
				setComboDeTexto(comboEstadoOperativo, 255,240,225, 576, 48, 132, 21);
			comboRegimenIVA = new JComboBox();
				comboRegimenIVA.setModel(new DefaultComboBoxModel(new String[] {"IVA RESPONSABLE INSCRIPTO", "IVA RESPONSABLE NO INSCRIPTO",	"IVA SUJETO EXENTO", "RESPONSABLE MONOTRIBUTO"}));
				setComboDeTexto(comboRegimenIVA, 255,240,225, 504, 120, 204, 21);
		
						
			opcion1_TipoDeProveedor = new JRadioButton("Laboratorio");
				setOpcion(opcion1_TipoDeProveedor, 216, 156, 90, 21);	
				opcion1_TipoDeProveedor.setSelected(true);
			opcion2_TipoDeProveedor = new JRadioButton("Proveedor General");
				setOpcion(opcion2_TipoDeProveedor, 316, 156, 150, 21);	
				
			
			panelDeBotones = new JPanel();
				FlowLayout disposicionDeBotones = (FlowLayout) panelDeBotones.getLayout();
				disposicionDeBotones.setVgap(7);
				disposicionDeBotones.setHgap(3);
				disposicionDeBotones.setAlignment(FlowLayout.LEFT);
				panelDeBotones.setBackground(new Color(50,110,110));
				panelDeBotones.setBounds(0, 588, 913, 38);
				add(panelDeBotones);
				
			btnNuevo = new JButton("Nuevo");
				setBoton(btnNuevo, 9, 595, 67, 24, true);
			JButton btnModificar = new JButton("Modificar");
				setBoton(btnModificar, 78, 595, 67, 24, true);
			JButton btnRegistrar = new JButton("Registrar");
				setBoton(btnRegistrar, 146, 595, 67, 24, false);			
			JButton btnCancelar = new JButton("Cancelar");
				setBoton(btnCancelar, 214, 595, 67, 24, false);	
			JButton btnBuscar = new JButton("Buscar");
				setBoton(btnBuscar, 282, 595, 67, 24, true);				
			JButton btnImprimir = new JButton("Imprimir");
				setBoton(btnImprimir, 350, 595, 67, 24, true);			
			JButton btnEliminar = new JButton("Eliminar");
				setBoton(btnEliminar, 418, 595, 67, 24, true);				
		
		
		//EVENTO VERIFICACION DE CUIT ------------------------------------------------
		textCuit.addFocusListener(new FocusAdapter() {
			public void focusLost(FocusEvent arg0) {
				if(textCuit.getText().trim().length()>0){
					long cuit = Long.parseLong(textCuit.getText().trim());
					if (ListaDeProveedores.verificarCuit(cuit)){
						JOptionPane.showMessageDialog(null, "Se ha verificado que el CUIT ingresado figura registrado.");
						textCuit.setText("");
					}
				}
			}
		});
			
	
		//EVENTO DE BOTON NUEVO ------------------------------------------------------
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonAccionado = btnNuevo.getText();
				Component[] activarComponente = {comboEstadoOperativo, textNombre, textCuit,
						comboRegimenIVA, opcion1_TipoDeProveedor, opcion2_TipoDeProveedor,
						textDomicilio, textCodigoPostal, textLocalidad, textProvincia,
						textPrefijo, textTelefono, textCelular, textCorreo,	textPaginaWeb,
						textCalificacionPromedio, btnRegistrar, btnCancelar};
					Cambiar_ActivacionDeComponente.setEnableContainer(activarComponente, true);
				Component[] desactivarComponente = {btnNuevo, btnModificar, btnBuscar, btnImprimir, btnEliminar};
					Cambiar_ActivacionDeComponente.setEnableContainer(desactivarComponente, false);
					
				limpiarFormulario();
				textNombre.requestFocus();	
				
				textCodigo.setText(rellenarCodigo(Integer.toString(Asignar_Codigo.getCodigo())));
				comboEstadoOperativo.setSelectedIndex(0);
				comboRegimenIVA.setSelectedIndex(0);
				opcion1_TipoDeProveedor.setSelected(true);
				textCalificacionPromedio.setText("7.0");
				}
		});
		
		
		//EVENTO DE BOTON MODIFICAR --------------------------------------------------
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				botonAccionado = btnModificar.getText();
				if(textCodigo.getText().trim().length()>0){
					Component[] activarComponente = {comboEstadoOperativo, textNombre, textCuit,
							comboRegimenIVA, opcion1_TipoDeProveedor, opcion2_TipoDeProveedor,
							textDomicilio, textCodigoPostal, textLocalidad, textProvincia,
							textPrefijo, textTelefono, textCelular, textCorreo,	textPaginaWeb,
							textCalificacionPromedio, btnRegistrar, btnCancelar};
						Cambiar_ActivacionDeComponente.setEnableContainer(activarComponente, true);
					Component[] desactivarComponente = {btnNuevo, btnModificar, btnBuscar, btnImprimir, btnEliminar};
						Cambiar_ActivacionDeComponente.setEnableContainer(desactivarComponente, false);
					textNombre.requestFocus();	
				}
			}
		});
		
		
		//EVENTO DE BOTON REGISTRAR --------------------------------------------------
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if(!verificarIngreso()){
				int confirmacionRegistro = JOptionPane.showConfirmDialog(null,
						"Desea registrar los datos del Proveedor "+textNombre.getText().trim(),
						"Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(confirmacionRegistro == JOptionPane.YES_OPTION){
				
					Component[] activarComponente = {btnNuevo, btnModificar, btnBuscar, btnImprimir, btnEliminar};
						Cambiar_ActivacionDeComponente.setEnableContainer(activarComponente, true);
					Component[] desactivarComponente = {comboEstadoOperativo, textNombre, textCuit,
						comboRegimenIVA, opcion1_TipoDeProveedor, opcion2_TipoDeProveedor,
						textDomicilio, textCodigoPostal, textLocalidad, textProvincia,
						textPrefijo, textTelefono, textCelular, textCorreo,	textPaginaWeb,
						textCalificacionPromedio, btnRegistrar, btnCancelar};
					Cambiar_ActivacionDeComponente.setEnableContainer(desactivarComponente, false);
					
					Proveedor setProveedor = new Proveedor();
					setProveedor.setCodigo(Integer.parseInt(textCodigo.getText().trim()));
					setProveedor.setEstadoOperativo((String) comboEstadoOperativo.getSelectedItem());
					setProveedor.setNombre(textNombre.getText().trim().toUpperCase());
					setProveedor.setCuit(Long.parseLong(textCuit.getText().trim()));
					setProveedor.setRegimenIva((String) comboRegimenIVA.getSelectedItem());
					setProveedor.setTipoProveedor((opcion1_TipoDeProveedor.isSelected()==true ? opcion1_TipoDeProveedor.getText() : opcion2_TipoDeProveedor.getText()));
					setProveedor.setDomicilio(textDomicilio.getText().trim());
					setProveedor.setCodigoPostal(Integer.parseInt(textCodigoPostal.getText().trim()));
					setProveedor.setLocalidad(textLocalidad.getText().trim().toUpperCase());
					setProveedor.setProvincia(textProvincia.getText().trim().toUpperCase());
					setProveedor.setPrefijo((textPrefijo.getText().trim().length()<=0) ? 0 : Integer.parseInt(textPrefijo.getText().trim()));
					setProveedor.setTelefono((textTelefono.getText().trim().length()<=0) ? 0 : Long.parseLong(textTelefono.getText().trim()));
					setProveedor.setCelular((textCelular.getText().trim().length()<=0) ? 0 : Long.parseLong(textCelular.getText().trim()));
					setProveedor.setCorreo((textCorreo.getText().trim().length()<=0) ? null : textCorreo.getText().trim());
					setProveedor.setPaginaWeb((textPaginaWeb.getText().trim().length()<=0) ? null : textPaginaWeb.getText().trim());
					setProveedor.setCalificacionPromedio(Float.parseFloat(textCalificacionPromedio.getText().trim()));
					
					//REGISTRA DATOS SUGUN ACCION
					if(botonAccionado=="Nuevo"){
						ListaDeProveedores.agregarElemento(setProveedor);
						Asignar_Codigo.setCodigo(Integer.parseInt(textCodigo.getText().trim()));
					}else if(botonAccionado=="Modificar"){
						int intCodigo = Integer.parseInt(textCodigo.getText());
						int indice = ListaDeProveedores.buscarElementoPorCodigo(intCodigo);
						ListaDeProveedores.modificarElemento(indice, setProveedor);
					}
				}
			}
			}
		});
		
		
		//EVENTO DE BOTON CANCELAR ---------------------------------------------------
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Component[] activarComponente = {btnNuevo, btnModificar, btnBuscar, btnImprimir, btnEliminar};
					Cambiar_ActivacionDeComponente.setEnableContainer(activarComponente, true);
				Component[] desactivarComponente = {comboEstadoOperativo, textNombre, textCuit,
						comboRegimenIVA, opcion1_TipoDeProveedor, opcion2_TipoDeProveedor,
						textDomicilio, textCodigoPostal, textLocalidad, textProvincia,
						textPrefijo, textTelefono, textCelular, textCorreo,	textPaginaWeb,
						textCalificacionPromedio, btnRegistrar, btnCancelar};
				Cambiar_ActivacionDeComponente.setEnableContainer(desactivarComponente, false);
				if(botonAccionado=="Nuevo"){
					limpiarFormulario();
				}else if(botonAccionado=="Modificar"){
					int intCodigo = Integer.parseInt(textCodigo.getText());
					int indice = ListaDeProveedores.buscarElementoPorCodigo(intCodigo);
					cargarBusqueda(indice);
				}
			}
		});
	
		
		//EVENTO DE BOTON BUSCAR ---------------------------------------------------------
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListaDeProveedores_Formulario frameLista = new ListaDeProveedores_Formulario();
				frameLista.setVisible(true);
			}
		});
		
		
		//EVENTO DE BOTON ELIMINAR ---------------------------------------------------
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textCodigo.getText().trim().length()>0){
					int decision = JOptionPane.showConfirmDialog(null,
							"¿Desea suprimir el registro del Proveedor "+textNombre.getText().trim()+"?",
							"Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(decision == JOptionPane.YES_OPTION){
						int intCodigo = Integer.parseInt(textCodigo.getText());
						int indice = ListaDeProveedores.buscarElementoPorCodigo(intCodigo);
						ListaDeProveedores.eliminarElemento(indice);
						limpiarFormulario();
					}
				}else{
					JOptionPane.showMessageDialog(null, "No ha seleccionado un registro de Proveedor en pantalla. Selecciónelo e intente nuevamente.");
					
				}
			}
		});
		
		
		//EVENTO DE BOTON IMPRIMIR ---------------------------------------------------
		btnImprimir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textCodigo.getText().trim().length()>0){
					int decision = JOptionPane.showConfirmDialog(null,
							"¿Desea imprimir el registro del Proveedor "+textNombre.getText().trim()+"?",
							"Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					if(decision == JOptionPane.YES_OPTION){
	
					}
				}else{
					JOptionPane.showMessageDialog(null, "No ha seleccionado un registro de Proveedor en pantalla. Selecciónelo e intente nuevamente.");
					
				}
			}
		});
	
	}
	
	//METODO DE BUSQUEDA
	public static void cargarBusqueda(int indice){
		if(ListaDeProveedores.sinElementos()==false){
			Proveedor proveedorSeleccionado = ListaDeProveedores.mostrarElemento(indice);
	
			textCodigo.setText(rellenarCodigo(Integer.toString(proveedorSeleccionado.getCodigo())));
			comboEstadoOperativo.setSelectedItem(proveedorSeleccionado.getEstadoOperativo());
			textNombre.setText(proveedorSeleccionado.getNombre());
			textCuit.setText(String.valueOf(proveedorSeleccionado.getCuit()));
			comboRegimenIVA.setSelectedItem(proveedorSeleccionado.getRegimenIva());
			opcion1_TipoDeProveedor.setSelected(proveedorSeleccionado.getTipoProveedor()=="Laboratorio" ? true : false);
			opcion2_TipoDeProveedor.setSelected(proveedorSeleccionado.getTipoProveedor()=="Proveedor General" ? true : false);
			textDomicilio.setText(proveedorSeleccionado.getDomicilio());
			textCodigoPostal.setText(Integer.toString(proveedorSeleccionado.getCodigoPostal()));
			textLocalidad.setText(proveedorSeleccionado.getLocalidad());
			textProvincia.setText(proveedorSeleccionado.getProvincia());
			textPrefijo.setText(Integer.toString(proveedorSeleccionado.getPrefijo()));
			textTelefono.setText(String.valueOf(proveedorSeleccionado.getTelefono()));
			textCelular.setText(String.valueOf(proveedorSeleccionado.getCelular()));
			textCorreo.setText(proveedorSeleccionado.getCorreo());
			textPaginaWeb.setText(proveedorSeleccionado.getPaginaWeb());
			textCalificacionPromedio.setText(Float.toString(proveedorSeleccionado.getCalificacionPromedio()));
		}
	}
	
	//METODO CERRAR
	public void cerrarFormulario(){
		Menu_Formulario frameMenu = new Menu_Formulario();
		frameMenu.setVisible(true);
		this.dispose();
	}
	
	//METODOS UTILES
	public static String rellenarCodigo(String codigo ){
		String rellenar1 = "";
		for(int j=0; j<(6-codigo.length()); j++){ rellenar1 = rellenar1+"0";}
		String rellenar2 = rellenar1+codigo;
		return rellenar2;
	}
	
	public void limpiarFormulario(){
		textCodigo.setText("");
		comboEstadoOperativo.setSelectedIndex(0);
		textNombre.setText("");
		textCuit.setText("");
		comboRegimenIVA.setSelectedIndex(0);
		opcion1_TipoDeProveedor.setSelected(true);
		textDomicilio.setText("");
		textCodigoPostal.setText("");
		textLocalidad.setText("");
		textProvincia.setText("");
		textPrefijo.setText("");
		textTelefono.setText("");
		textCelular.setText("");
		textCorreo.setText("");
		textPaginaWeb.setText("");
		textCalificacionPromedio.setText("");
	}
	
	public boolean verificarIngreso(){
		if(textNombre.getText().trim().length()<=0){
			JOptionPane.showMessageDialog(null, "No ha ingresado el nombre del Proveedor. Ingréselo e intente nuevamente.");
			textNombre.requestFocus();
			return true;
			}
		if(textCuit.getText().trim().length()<=0){
			JOptionPane.showMessageDialog(null, "No ha ingresado el CUIT del Proveedor. Ingréselo e intente nuevamente.");
			textCuit.requestFocus();
			return true;
		}
		if(textDomicilio.getText().trim().length()<=0){
			JOptionPane.showMessageDialog(null, "No ha ingresado el domicilio del Proveedor. Ingréselo e intente nuevamente.");
			textDomicilio.requestFocus();
			return true;
		}
		if(textCodigoPostal.getText().trim().length()<=0){
			JOptionPane.showMessageDialog(null, "No ha ingresado el código postal del Proveedor. Ingréselo e intente nuevamente.");
			textCodigoPostal.requestFocus();
			return true;
		}
		if(textLocalidad.getText().trim().length()<=0){
			JOptionPane.showMessageDialog(null, "No ha ingresado el localidad del Proveedor. Ingréselo e intente nuevamente.");
			textLocalidad.requestFocus();
			return true;
		}
		if(textProvincia.getText().trim().length()<=0){
			JOptionPane.showMessageDialog(null, "No ha ingresado el provincia del Proveedor. Ingréselo e intente nuevamente.");
			textProvincia.requestFocus();
			return true;
		}
		if(textCorreo.getText().trim().length()>0){
			if(!Validar_Correo.validar(textCorreo.getText().trim())){
				textCorreo.requestFocus();
				return true;
			}
		}
		if(textCalificacionPromedio.getText().trim().length()<=0){
			JOptionPane.showMessageDialog(null, "No ha ingresado el calificación promedio del Proveedor. Ingréselo e intente nuevamente.");
			textCalificacionPromedio.requestFocus();			
			return true;
		}
		return false;
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
		nom.setDisabledTextColor(new Color(100, 100, 100));
		nom.setBackground(new Color(r, g, b));
		Validar_CajaDeTexto.validar(nom, tipoDeDato);
		Limitar_CajaDeTexto.limitar(nom, longitud);
		nom.setBounds(horizontal, vertical, ancho, alto);
		nom.setEnabled(false);
		add(nom);
	}
	
	public void setComboDeTexto(JComboBox nom, int r, int g, int b,
			int horizontal, int vertical, int ancho, int alto) {
		nom.setFont(new Font("Arial", Font.BOLD, 11));
		nom.setForeground(new Color(0, 0, 0));
		UIManager.put("ComboBox.disabledForeground", new Color(100, 100, 100));
		nom.setBackground(new Color(r, g, b));
		nom.setBounds(horizontal, vertical, ancho, alto);
		nom.setEnabled(false);
		add(nom);
		nom.setSelectedIndex(0);
	}
	
	public void setOpcion(JRadioButton nom, int horizontal, int vertical, int ancho, int alto) {
		nom.setFont(new Font("Arial", Font.PLAIN, 12));
		nom.setForeground(new Color(50,110,110));
		nom.setBackground(new Color(240, 240, 240));
		nom.setBounds(horizontal, vertical, ancho, alto);
		nom.setEnabled(false);
		grupoDeOpciones.add(nom);
		add(nom);
	}
	
	public void setBoton(JButton nom, 
			int horizontal, int vertical, int ancho, int alto, boolean activacion) {
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Arial", Font.PLAIN, 12));
		nom.setForeground(new Color(0, 0, 0));
		nom.setBounds(horizontal, vertical, ancho, alto);
		nom.setEnabled(activacion);
		panelDeBotones.add(nom);
	}
		
}



		

