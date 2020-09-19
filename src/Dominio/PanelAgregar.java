package Dominio;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class PanelAgregar extends JPanel 
{
	private static final long serialVersionUID = 1L;
	
	JLabel lblNewLabel = new JLabel("ID");
	JLabel lblNewLabel_1 = new JLabel("NOMBRE");
	JLabel lblNewLabel_2 = new JLabel("GENERO");
	JLabel lblID = new JLabel("id_autonumerico");
	JComboBox<Categoria> cbGenero = new JComboBox<Categoria>();
	JTextField txtNombre = new JTextField();
	JButton btnAceptar = new JButton("ACEPTAR");
	
	public PanelAgregar()
	{
		setLayout(null);

		
		lblNewLabel.setBounds(38, 28, 46, 14);
		add(lblNewLabel);
		
		lblNewLabel_1.setBounds(38, 53, 128, 14);
		add(lblNewLabel_1);
		
		lblNewLabel_2.setBounds(38, 78, 128, 14);
		add(lblNewLabel_2);
		
		btnAceptar.setBounds(150, 117, 89, 23);
		add(btnAceptar);
		
		cbGenero.setBounds(176, 75, 176, 20);
		cbGenero.addItem(new Categoria("Seleccione un género"));
		cbGenero.addItem(new Categoria("Terror"));
		cbGenero.addItem(new Categoria("Accion"));
		cbGenero.addItem(new Categoria("Suspenso"));
		cbGenero.addItem(new Categoria("Romantica"));
		cbGenero.addItem(new Categoria("Thriller"));
		add(cbGenero);
		
		lblID.setBounds(176, 28, 111, 14);
		lblID.setText(""+ Pelicula.getIdPelicula());
		add(lblID);
		
		txtNombre.setBounds(176, 50, 176, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
	}
	
	
}
