package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("Test 1: findById");
		
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\nTest 2: findByDepartment");
		
		List<Seller> sellers = new ArrayList<>();
		Department dep = new Department (2, null);
		
		sellers = sellerDao.findByDepartment(dep);
		for (Seller s : sellers) {
			System.out.println(s);
		}
		
		System.out.println("\nTest 3: findAll");
		
		List<Seller> allSellers = new ArrayList<>();
		
		allSellers = sellerDao.findAll();
		for (Seller s : allSellers) {
			System.out.println(s);
		}
		
		/*
		System.out.println("\nTest 4: Insert");
		
		Seller newSeller = new Seller(null, "Bruno", "bruno@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("New seller inserted! New id is: " + newSeller.getId());
		
		System.out.println("\nTest 5: Update seller");
		
		seller = sellerDao.findById(12);
		seller.setName("Bruno Marinho");
		seller.setEmail("brunohenrique94@outlook.com");
		sellerDao.update(seller);
		System.out.println("Seller info updated");
		
		
		System.out.println("\nTest 6: Delete seller");
		sellerDao.deleteById(9);
		System.out.println("Seller deleted!");
		*/
	}
}