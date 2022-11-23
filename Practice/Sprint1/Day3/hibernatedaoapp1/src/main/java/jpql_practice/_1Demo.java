package jpql_practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class _1Demo {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		
//	    String jpql="FROM Account where name='Ramesh'";
//	    Query q= em.createQuery(jpql);
//	     List<Account> list=q.getResultList();
//	     list.forEach(a->System.out.println(a));
		
		
		// Typed query
//		String jpql="From Account";
//		
//		TypedQuery q=em.createQuery(jpql,Account.class);
//		List<Account> list=q.getResultList();
//		
//		list.forEach(a->System.out.println(a));
		
		// Bulk update
		
		String jpql="update Account set balance=balance+2000";
		Query q=em.createQuery(jpql);
		
		em.getTransaction().begin();
		int x= q.executeUpdate();
		em.getTransaction().commit();
		 System.out.println(x+" rows get updated");
		
	     em.close();

	}

}
