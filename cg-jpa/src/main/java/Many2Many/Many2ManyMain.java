package Many2Many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Many2ManyMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		Bank b1 = new Bank();
		b1.setName("SVC");
		b1.setBranchName("bangalore");
		b1.setSwiftCode("SVC123");
		
		Bank b2 = new Bank();
		b2.setName("Axis");
		b2.setBranchName("mangalore");
		b2.setSwiftCode("Axis123");
		
		Set<Bank> banks = new HashSet<Bank>();
		banks.add(b1);
		banks.add(b2);
		
		
		Customer c1 = new Customer();
		c1.setName("Tilak");
		c1.setMobileNo(8899776777L);
		
		Customer c2 = new Customer();
		c2.setName("Rilak");
		c2.setMobileNo(8399776727L);
		
		Customer c3 = new Customer();
		c3.setName("Vilak");
		c3.setMobileNo(8446772200L);
		
		Customer c4 = new Customer();
		c4.setName("Malik");
		c4.setMobileNo(8883377777L);
		
		Set<Customer> cs = new HashSet<Customer>();
		cs.add(c1);
		cs.add(c2);
		b1.setCustomer(cs);
		
		Set<Customer> cs2 = new HashSet<Customer>();
		cs2.add(c2);
		cs2.add(c3);
		cs2.add(c4);
		b2.setCustomer(cs2);
		
		tran.begin();
		manager.persist(b1);
		manager.persist(b2);
		tran.commit();
		manager.close();
		
	}

}
