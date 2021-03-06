package es.studium.SpringAcademia;

import java.util.ArrayList;
import java.util.List;

public class Centro 
{
	//Declaración de atributos
	private String nombreCentro;
	private String direccionCentro;
	private int codigoCentro;
	private List<Alumno> alumnoCentro;

	//Constructor sin parámetros, donde inicializamos los atributos
	public Centro() 
	{		
		nombreCentro="";
		direccionCentro="";
		codigoCentro=0;
		this.alumnoCentro=new ArrayList<Alumno>();
	}
	//Constructor con parámetros
	public Centro(String nomCen, String dirCen, int codCen, List<Alumno> alumnCen) 
	{
		this.nombreCentro=nomCen;
		this.direccionCentro=dirCen;
		this.codigoCentro=codCen;
		this.alumnoCentro=alumnCen;
	}
	
	//Métodos getters y setters
	public String getNombreCentro()
	{
		return nombreCentro;
	}


	public void setNombreCentro(String nombreCentro)
	{
		this.nombreCentro = nombreCentro;
	}


	public String getDireccionCentro()
	{
		return direccionCentro;
	}


	public void setDireccionCentro(String direccionCentro)
	{
		this.direccionCentro = direccionCentro;
	}


	public int getCodigoCentro()
	{
		return codigoCentro;
	}


	public void setCodigoCentro(int codigoCentro)
	{
		this.codigoCentro = codigoCentro;
	}


	public List<Alumno> getAlumnoCentro()
	{
		return alumnoCentro;
	}

	public void setAlumnoCentro(List<Alumno> alumnoCentro)
	{
		this.alumnoCentro = alumnoCentro;
	}
}
