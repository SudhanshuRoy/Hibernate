package com.masai.main;

import com.masai.model.Address;
import com.masai.model.Customer;
import com.masai.utility.EMUtil;
import javax.persistence.EntityManager;

import org.hibernate.internal.build.AllowSysOut;

import java.util.List;


public class GetAllAddressByCid {

	public static void main(String[] args) {
		EntityManager em=EMUtil.provideEntityManager();
		Customer customer=em.find(Customer.class,2);
		List<Address> address=customer.getAddresses();
		address.forEach(add->System.out.println(add));
		
		System.out.println("done..");
		

	}

}
