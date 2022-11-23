package jpql_practice;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class _3NamedParameter {

	public static void main(String[] args) {
EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "update Account set balance=balance+:bal where name=:nam";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter("bal", 1000);
		q.setParameter("nam", "Suresh");
		
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
		
		em.close();
		System.out.println(x+" record updated...");


	}

}
