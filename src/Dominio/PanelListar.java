package Dominio;

import javax.swing.JPanel;

import java.lang.reflect.Array;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;

public class PanelListar extends JPanel {
	
	private JLabel lblPeliculas;
	private JList<Pelicula> list;
	private DefaultListModel<Pelicula> listModel;
	public static ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>();
	
	
	public PanelListar() {
		setLayout(null);
		
		lblPeliculas = new JLabel("PELICULAS:");
		lblPeliculas.setBounds(10, 87, 76, 14);
		add(lblPeliculas);
		
		list = new JList<Pelicula>();
		list.setBounds(83, 11, 331, 198);
		add(list);
		//listModel = new DefaultListModel<Pelicula>();
	}
	

	public void setDefaultListModel(DefaultListModel<Pelicula> listModel2)
	{
		this.listModel = listModel2;
		int tamaño = this.listModel.size();
		Pelicula[] vect = new Pelicula[tamaño];
		for (int cont=0;cont<tamaño;cont++)
		{
			vect[cont]= this.listModel.getElementAt(cont);
		}

		for(int i=0;i<(vect.length-1);i++){
			   for(int j=i+1;j<vect.length;j++){
				   	if(vect[i].getNombrePelicula().compareTo(vect[j].getNombrePelicula())>0){
				   		String aux=vect[i].getNombrePelicula();
				   		vect[i].setNombrePelicula(vect[j].getNombrePelicula());
				   		vect[j].setNombrePelicula(aux);
				   	}
			   }
		}
			
		this.list.setModel(new javax.swing.AbstractListModel()
				{
					Pelicula[] vector = vect;
					@Override
					public Object getElementAt(int i) {
						return vector[i] ;
					}

					@Override
					public int getSize() {
						return vector.length;
					}
				});
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
