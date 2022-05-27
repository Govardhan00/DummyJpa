package one2one;



import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class One2OneMain {

	public static void main(String[] args) {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	Person person = new Person();
	person.setPersonName("gags");
	person.setCity("Kolkata");
	
	Passport passport = new Passport();
	passport.setPassportId("K66037");
	Date dateIssued = new Date();
	passport.setDateIssued(dateIssued);
	
	//set expiry date
	Calendar cal = Calendar.getInstance();
	cal.setTime(dateIssued);
	cal.add(Calendar.YEAR, 5);
	
	Date dateExpiry = cal.getTime();
	passport.setExpiryDate(dateExpiry);
	passport.setPerson(person);
	
	transaction.begin();
	manager.persist(passport);
	transaction.commit();
	manager.close();
	}

}
