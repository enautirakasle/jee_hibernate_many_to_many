package programa;

import org.hibernate.Session;
import org.hibernate.Transaction;

import modelo.Libros;
import utils.HibernateUtils;

public class Prueba {

	private static Session session;
	
	public static void main(String[] args) {
		session = HibernateUtils.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();
		
		Libros libro = new Libros();
		libro.setTitulo("tituloa");
		libro.setAutor("autorea");
		
		session.save(libro);
		tx.commit();
		
		session.close();
	}

}
