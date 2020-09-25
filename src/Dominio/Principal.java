package Dominio;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame
{
	private static final long serialVersionUID = 1L;
	private JPanel JPPanelPrincipal;
	private JMenuBar JMBMenu;
	private JMenu JMMenuPelicula;
	private JMenuItem JMIPeliculaAgregar;
	private JMenuItem JMIPeliculaListar;
	private DefaultListModel<Pelicula> listModel;

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Programa");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMBMenu = new JMenuBar();
		setJMenuBar(JMBMenu);
		
		JMMenuPelicula = new JMenu("Peliculas");
		JMBMenu.add(JMMenuPelicula);
		listModel = new DefaultListModel<Pelicula>();
		
		JMIPeliculaAgregar = new JMenuItem("Agregar");
		JMIPeliculaAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				JPPanelPrincipal.removeAll();
				PanelAgregar pAgregar= new PanelAgregar();
				pAgregar.setDefaultListModel(listModel);
				JPPanelPrincipal.add(pAgregar);
				JPPanelPrincipal.repaint();
				JPPanelPrincipal.revalidate();
			}
		});
		JMMenuPelicula.add(JMIPeliculaAgregar);
		
		JMIPeliculaListar = new JMenuItem("Listar");
		JMIPeliculaListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JPPanelPrincipal.removeAll();
				PanelListar pListar = new PanelListar();
				pListar.setDefaultListModel(listModel);
				JPPanelPrincipal.add(pListar);
				JPPanelPrincipal.repaint();
				JPPanelPrincipal.revalidate();
			}
		});
		JMMenuPelicula.add(JMIPeliculaListar);
		
		JPPanelPrincipal = new JPanel();
		JPPanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		JPPanelPrincipal.setLayout(new BorderLayout(0, 0));
		setContentPane(JPPanelPrincipal);
	}
	

}
