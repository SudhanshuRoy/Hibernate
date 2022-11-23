package jpql_practice;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.utility.EMUtil;

public class _5MultipleRowOneColumn {

	public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();
		
		String jpql="select balance from Account";
		Query q=  em.createQuery(jpql);
		List<Integer> list= q.getResultList();
		for(Integer i:list) System.out.println(i);
		

	}

}
