package saif.projects;

import java.sql.ResultSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
    	Session s=sf.getCurrentSession();
    	Transaction tx=s.beginTransaction();
    	reg m= new reg();
    	m.setFirstname("Jabir");
    	s.save(m);
    	tx.commit();   	
        System.out.println( "Hello World!" );
    }
}
