package es.studium.SpringAcademia;

public class Asignatura 
{
	//Declaración de atributos
	private String nombreAsig;
	private int horasAsig;
	private double nota;
	private int codeAsig;

	//Constructor sin parámetros, donde inicializamos los atributos
	public Asignatura()
	{

		this.nombreAsig = "";
		this.horasAsig = 0;
		this.nota = 0.0;
		this.codeAsig=0;
	}
	//Constructor con parámetros
	public Asignatura(String nA, int horAs, double nota, int cA)
	{		
		this.nombreAsig = nA;
		this.horasAsig = horAs;
		this.nota = nota;
		this.codeAsig=cA;
	}
	//Métodos getters y setters
	public String getNombreAsig()
	{
		return nombreAsig;
	}

	public void setNombreAsig(String nombreAsig)
	{
		this.nombreAsig = nombreAsig;
	}

	public int getHorasAsig()
	{
		return horasAsig;
	}

	public void setHorasAsig(int horasAsig)
	{
		this.horasAsig = horasAsig;
	}

	public double getNota()
	{
		return nota;
	}

	public void setNota(double nota)
	{
		this.nota = nota;
	}

	public int getCodeAsig()
	{
		return codeAsig;
	}

	public void setCodeAsig(int codeAsig)
	{
		this.codeAsig = codeAsig;
	}	
}
