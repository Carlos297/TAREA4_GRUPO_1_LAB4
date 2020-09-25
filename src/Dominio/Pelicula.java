package Dominio;

public class Pelicula 
{
	private static int idPelicula =1;
	private String nombrePelicula;
	public Categoria categoria;
	
	public static int getIdPelicula() 
	{
		return idPelicula;
	}
	public static void setIdPelicula(int idPelicula)
	{
		Pelicula.idPelicula = idPelicula;
	}
	public String getNombrePelicula() 
	{
		return nombrePelicula;
	}
	public void setNombrePelicula(String nombrePelicula)
	{
		this.nombrePelicula = nombrePelicula;
	}
	
	@Override
	public String toString() {
		return "NombrePelicula= " + nombrePelicula + " , Categoria= " + categoria;
	}
	
	public Pelicula ()
	{
		idPelicula++;
	}
	
	public Pelicula(String nombre, Categoria cate) 
	{
		idPelicula++;
		this.nombrePelicula= nombre;
		this.categoria=cate;
	}

	
	
}
