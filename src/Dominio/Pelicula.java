package Dominio;

public class Pelicula 
{
	private static int idPelicula =1;
	private String nombrePelicula;
	private String categoria;
	
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
	public String getCategoria() 
	{
		return categoria;
	}
	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Pelicula [id: "+idPelicula+ ", nombrePelicula=" + nombrePelicula + ", categoria=" + categoria + "]";
	}
	
	public Pelicula ()
	{
		idPelicula++;
	}
	
	public Pelicula(String nombre, String cate) 
	{
		idPelicula++;
		this.nombrePelicula= nombre;
		this.categoria=cate;
	}

	
	
}
