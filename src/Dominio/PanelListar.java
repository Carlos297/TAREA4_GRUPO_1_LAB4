package Dominio;

import javax.swing.JPanel;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListar extends JPanel {
	
	private JLabel lblPeliculas;
	private JList<Pelicula> list;
	private DefaultListModel<Pelicula> listModel;
	
	
	public PanelListar() {
		setLayout(null);
		
		lblPeliculas = new JLabel("PELICULAS:");
		lblPeliculas.setBounds(10, 120, 83, 14);
		add(lblPeliculas);
		
		list = new JList<Pelicula>();
		list.setBounds(115, 42, 325, 193);
		add(list);
	}
	
	//Ver Ordenamiento
	@SuppressWarnings("unchecked")
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel2)
	{
		this.listModel = listModel2;
		Collections.sort((List<Pelicula>) this.listModel, (x, y) -> x.getNombrePelicula().compareToIgnoreCase(y.getNombrePelicula()));
		list.setModel(this.listModel);
		
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
