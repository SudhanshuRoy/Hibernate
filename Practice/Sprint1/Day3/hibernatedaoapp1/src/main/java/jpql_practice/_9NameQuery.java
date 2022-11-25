package jpql_practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.model.Account;
import com.masai.utility.EMUtil;
 

public class _9NameQuery {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Query q=em.createNamedQuery("account.getBalance");
		q.setParameter("bal", 18000);
		List<Account> list= q.getResultList();
		for(Account acc:list) {
			System.out.println(acc);
		}

	}

}
