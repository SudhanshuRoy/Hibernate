package jpql_practice;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class _7MultipleColunmOneRow {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="select name,balance from Account where accno=:an";
		Query q=em.createQuery(jpql);
		q.setParameter("an", 2);
		Object obj=  q.getSingleResult();
		Object [] arr=(Object []) obj;
		System.out.println("Name is : "+(String)arr[0]);
		System.out.println("Balance is : "+(int)arr[1]);

	}

}
