package jpql_practice;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.masai.utility.EMUtil;

public class _8AggregrateFunction {
	public static void main(String[] args) {
		EntityManager em= EMUtil.provideEntityManager();
		
		
		String jpql= "select sum(balance) from Account";
		
		TypedQuery<Long> q=em.createQuery(jpql,Long.class);
		
		long result= q.getSingleResult();
		
		System.out.println(result);
	}
}

