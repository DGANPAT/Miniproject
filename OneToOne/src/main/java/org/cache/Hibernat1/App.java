package org.cache.Hibernat1;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Configuration configuration = new Configuration();
    System.out.println("1");
    configuration.configure("hibernate.cfg.xml");
    System.out.println("2");
    SessionFactory sessionFactory = configuration.buildSessionFactory();
    System.out.println("3");
    Session session=sessionFactory.openSession();
    System.out.println("4");
    Transaction t= session.beginTransaction();
    Customer customer=new Customer();
    customer.setFirstName("sohan");
    customer.setMobileNumber("7575858595"); 
    Transection transection= new Transection();
    transection.setDate(new Date());
    transection.setTotal(5000);
    customer.setTransection(transection);
    session.save(customer);
    t.commit();
    session.close();
    sessionFactory.close();
    }

}
