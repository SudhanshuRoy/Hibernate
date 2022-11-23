package jpql_practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;

public class _6FewColunmAllRows {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		String jpql="select name,balance from Account";
		Query q=em.createQuery(jpql);
		 List<Object[]> list=  q.getResultList();
		for(Object [] arr:list) {
			String name=(String)arr[0];
			int balance=(int) arr[1];
			System.out.println("Name is : "+name);
			System.out.println("Balance is : "+balance);
			System.out.println("********************");
		}
	}

}
