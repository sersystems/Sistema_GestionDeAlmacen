package menu;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

import gestionDeProveedores.Proveedor_Formulario;

public class Menu_Formulario extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -440952368272313590L;
	private JPanel formulario, panelDeBotones;
	private JButton btnArticulos, btnProveedore, btnAbastecimiento, btnSolicitudCotizacion,
		btnRecepcionCotizacion, btnOrdenCompra, btnCalificaciones, btnTrazabilidad,btnListas;
	
	public Menu_Formulario(){
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
				setTitulo(lblTituloPrincipal, "Arial", 28, 50,110,110, "Menú Principal", 10, 0, 700, 36);
				lblTituloPrincipal.setHorizontalAlignment(SwingConstants.LEFT);
			JLabel lblSalir = new JLabel();
				setTitulo(lblSalir, "Arial", 12, 0,0,255, "<HTML><U>Salir Del Sistema<U><HTML>", 744, 8, 139, 17);
				lblSalir.setHorizontalAlignment(SwingConstants.RIGHT);
				lblSalir.addMouseListener(new MouseAdapter() {
				    public void mouseClicked(MouseEvent e) {if(e.getClickCount()==1) System.exit(0);}});

			
			JLabel lblOpcion = new JLabel();
				setTitulo(lblOpcion, "Arial", 12, 50,110,110, "Elija una opción:", 180, 94, 95, 17);
			JLabel lblEmpresa = new JLabel();
				setTitulo(lblEmpresa, "Arial", 12, 254,254,254, "Red de Farmacias FarmaSalud S.R.L.", 648, 599, 250, 17);
				lblEmpresa.setHorizontalAlignment(SwingConstants.RIGHT);

				
			JSeparator separadorSup = new JSeparator();
				separadorSup.setBounds(10, 36, 875, 2);
				add(separadorSup);
			JSeparator separadorInf = new JSeparator();
				separadorInf.setBounds(0, 588, 913, 2);
				add(separadorInf);


			panelDeBotones = new JPanel();
				FlowLayout disposicionDeBotones = (FlowLayout) panelDeBotones.getLayout();
				disposicionDeBotones.setVgap(7);
				disposicionDeBotones.setHgap(3);
				disposicionDeBotones.setAlignment(FlowLayout.LEFT);
				panelDeBotones.setBackground(new Color(50,110,110));
				panelDeBotones.setBounds(0, 588, 913, 38);
				add(panelDeBotones);


			btnArticulos = new JButton("Gestión De Artículos");
				setBoton(btnArticulos, 180, 96, 534, 46);
			btnProveedore = new JButton("Gestión De Proveedores");
				setBoton(btnProveedore, 180, 144, 534, 46);
			btnAbastecimiento = new JButton("Gestión De Solicitudes De Abastecimiento");
				setBoton(btnAbastecimiento, 180, 192, 534, 46);			
			btnSolicitudCotizacion = new JButton("Gestión De Solicitudes De Cotización");
				setBoton(btnSolicitudCotizacion, 180, 240, 534, 46);	
			btnRecepcionCotizacion = new JButton("Gestión De Recepciones De Cotización");
				setBoton(btnRecepcionCotizacion, 180, 288, 534, 46);				
			btnOrdenCompra = new JButton("Gestión De Ordenes De Compras");
				setBoton(btnOrdenCompra, 180, 336, 534, 46);			
			btnCalificaciones = new JButton("Gestión De Calificaciones A Proveedores");
				setBoton(btnCalificaciones, 180, 384, 534, 46);				
			btnTrazabilidad = new JButton("Trazabilidad De Medicamento");
				setBoton(btnTrazabilidad, 180, 432, 534, 46);		
			btnListas = new JButton("Consulta e Impresión De Listas");
				setBoton(btnListas, 180, 480, 534, 46);		

			//EVENTO DE OPCION GESTION DE PROVEEDORES --------------------------------------
			btnProveedore.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Proveedor_Formulario frameProveedor = new Proveedor_Formulario();
					frameProveedor.setVisible(true);
					cerrarFormulario();
				}
			});
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
	
	public void setBoton(JButton nom, 
		int horizontal, int vertical, int ancho, int alto) {
		nom.setHorizontalAlignment(SwingConstants.CENTER);
		nom.setFont(new Font("Arial", Font.PLAIN, 22));
		nom.setForeground(new Color(0, 0, 0));
		nom.setBounds(horizontal, vertical, ancho, alto);
		add(nom);
	}
}
