package Dominio;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel JPPanelPrincipal;
	private JMenuBar JMBMenu;
	private JMenu JMMenuPelicula;
	private JMenuItem JMIPeliculaAgregar;
	private JMenuItem JMIPeliculaListar;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Programa");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMBMenu = new JMenuBar();
		setJMenuBar(JMBMenu);
		
		JMMenuPelicula = new JMenu("Peliculas");
		JMBMenu.add(JMMenuPelicula);
		
		JMIPeliculaAgregar = new JMenuItem("Agregar");
		JMMenuPelicula.add(JMIPeliculaAgregar);
		
		JMIPeliculaListar = new JMenuItem("Listar");
		JMMenuPelicula.add(JMIPeliculaListar);
		
		JPPanelPrincipal = new JPanel();
		JPPanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		JPPanelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(JPPanelPrincipal);
	}
	

}
