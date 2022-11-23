package usecases;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.entities.Product;

public class Demo {

	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("productUnite");
	EntityManager em= emf.createEntityManager();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter product Id to search product: ");
	int pid=sc.nextInt();
	Product product= em.find(Product.class, pid);
	if(product!=null)
	System.out.println(product);
	else
    System.out.println("Product not found with product id "+pid);
	em.close();


	}

}
