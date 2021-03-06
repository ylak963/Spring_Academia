package es.studium.SpringAcademia;


public class Alumno 
{
	//Declaración de atributos
	private String nombreAlumno;
	private String direccionAlumno;
	private Centro centroAlumno;
	Asignatura asignatura;
	private int numMatricula;
	
	//Constructor sin parámetros, donde inicializamos los atributos
	public Alumno()
	{
		nombreAlumno = "";
		direccionAlumno = "";
		centroAlumno = new Centro();
		asignatura = new Asignatura();
		numMatricula=0;
	}
	//Constructor con parámetros
	public Alumno(String nombreAlumno, String direccionAlumno, Centro centroAlumno, Asignatura asignatura, int numMat)
	{		
		this.nombreAlumno = nombreAlumno;
		this.direccionAlumno = direccionAlumno;
		this.centroAlumno = centroAlumno;
		this.asignatura = asignatura;
		this.numMatricula = numMat;
		
	}
	//Métodos getters y setters
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno = nombreAlumno;
	}

	public String getDireccionAlumno()
	{
		return direccionAlumno;
	}

	public void setDireccionAlumno(String direccionAlumno)
	{
		this.direccionAlumno = direccionAlumno;
	}

	public Centro getCentroAlumno()
	{
		return centroAlumno;
	}

	public void setCentroAlumno(Centro centroAlumno)
	{
		this.centroAlumno = centroAlumno;
	}

	public Asignatura getAsignatura()
	{
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura)
	{
		this.asignatura = asignatura;
	}
	
	public int getNumMatricula()
	{
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula)
	{
		this.numMatricula = numMatricula;
	}
	
	public String getDireccionCentro() 
	{
		return centroAlumno.getDireccionCentro();
	}
}
