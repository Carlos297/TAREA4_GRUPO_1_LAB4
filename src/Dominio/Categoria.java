package Dominio;

public class Categoria 
{
	private String categoria;

	public String getCategoria() 
	{
		return categoria;
	}

	public void setCategoria(String categoria) 
	{
		this.categoria = categoria;
	}

	public Categoria()
	{
		
	}
	
	public Categoria(String nombre)
	{
		this.categoria=nombre;
	}

	@Override
	public String toString() {
		return  categoria;
	}
	
	
	
}
