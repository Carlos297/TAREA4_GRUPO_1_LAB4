package Dominio;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;


public class App {
	private static DefaultListModel<Pelicula> listModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					
					Principal frame = new Principal();
					listModel = new DefaultListModel<Pelicula>();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
