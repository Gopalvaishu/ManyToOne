package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Controller {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student s=new Student();
		
		s.setEmailid("vaishu123@gmail.com");
		s.setName("vaishnavi");
		s.setPhone(98765432);
		
		Facebook f=new Facebook();
		f.setAccountid(7897);
		f.setName("vaishnavi");
		f.setPhone(98765432);
		
		Facebook f1=new Facebook();
		f1.setAccountid(7898);
		f1.setName("vaishnavi");
		f1.setPhone(98765432);
		
		Facebook f2=new Facebook();
		f2.setAccountid(7837);
		f2.setName("vaishnavi");
		f2.setPhone(98765432);
		
		Facebook f3=new Facebook();
		f3.setAccountid(3897);
		f3.setName("vaishnavi");
		f3.setPhone(98765432);
		
		f.setId(s);
		f1.setId(s);
		f2.setId(s);
		f3.setId(s);
		entityTransaction.begin();
		entityManager.persist(s);
		entityManager.persist(f);
		entityManager.persist(f1);
		entityManager.persist(f2);
		entityManager.persist(f3);
		entityTransaction.commit();
		
		System.out.println("Unidirection done");
		}

}
