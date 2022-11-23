package jpql_practice;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.utility.EMUtil;

public class _4ForSingleOutput {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
//		String jpql="select name from Account where accno=:an";
//		TypedQuery<String> query=em.createQuery(jpql,String.class);
//		query.setParameter("an", 2);
//		String name=query.getSingleResult();
//		System.out.println("Name is : "+name);
		
		String jpql="select balance from Account where accno=:an";
		TypedQuery<Integer> query=em.createQuery(jpql,Integer.class);
		query.setParameter("an", 2);
		Integer bal=query.getSingleResult();
		System.out.println("Balance is : "+bal);
		

		
		
		

	}
	

}
