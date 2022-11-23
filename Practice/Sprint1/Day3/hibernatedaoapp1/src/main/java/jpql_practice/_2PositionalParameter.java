package jpql_practice;

import javax.persistence.EntityManager;

import com.masai.utility.EMUtil;

import javax.persistence.Query;

public class _2PositionalParameter {

	public static void main(String[] args) {

		EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "update Account set balance=balance+?1 where name=?2";
		
		Query q= em.createQuery(jpql);
		
		q.setParameter(1, 1000);
		q.setParameter(2, "Suresh");
		
		em.getTransaction().begin();
		int x=q.executeUpdate();
		em.getTransaction().commit();
		
		em.close();
		System.out.println(x+" record updated...");

	}

}
