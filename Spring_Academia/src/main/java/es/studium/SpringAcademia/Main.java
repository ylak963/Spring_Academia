package es.studium.SpringAcademia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		//Abrimos el contenedor de IoC (Control de Inversión) indicando la ruta exacta de donde se encuentra el fichero beans.xml
		 
		@SuppressWarnings("resource")
		ApplicationContext appContext = new ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		List<Centro> centros = new ArrayList<Centro>();
		System.out.println("Direcciones de todos los centros"+"-->"+"\n");
		//El parámetro que se le pasa al método getBean es el id que indicamos en el documento beans.xml, para esta clase Centro id="centro"
		Centro c1 = (Centro) appContext.getBean("centro");
		c1.setDireccionCentro("Reyes Católicos nº 14");
		c1.setNombreCentro("Escuela de inglés");
		centros.add(c1);
		System.out.println(c1.getNombreCentro() + ", con direccion en: " + c1.getDireccionCentro());
		Centro c2 = (Centro) appContext.getBean("centro");
		c2.setDireccionCentro("Cristóbal Colón nº 92");
		c2.setNombreCentro("Escuela de francés");
		centros.add(c2);
		System.out.println(c2.getNombreCentro() + ", con direccion en: " + c2.getDireccionCentro());
		
		System.out.println("");
		//El parámetro que se le pasa al método getBean es el id que indicamos en el documento beans.xml, para esta clase Alummno id="alumno"
		Alumno a1 = (Alumno) appContext.getBean("alumno");
		a1.setCentroAlumno(new Centro("Escuela de inglés", "Reyes Católicos, 14", 1, new ArrayList<Alumno>()));
		System.out.println("Direccion del centro donde está matriculada Carmen: "+ a1.getDireccionCentro() );
		
		System.out.println("");
		Alumno a2 = (Alumno) appContext.getBean("alumno");
		a2.setNombreAlumno("Benito Bueno");
		a2.asignatura.setNota(6.0);
		System.out.println("Nota que Benito ha sacado en el B2: " + a2.asignatura.getNota());
		/*Cerramos el contenedor abierto utilizando un configurable, porque la interfaz ApplicationContext no tiene método close().*/
		((ConfigurableApplicationContext) appContext).close();
	}
}
