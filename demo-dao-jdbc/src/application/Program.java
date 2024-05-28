package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findbyId(3);
		System.out.println(seller);
		
		System.out.println("\n === TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list ) {
			System.out.println(obj);
		}
		System.out.println("\n === TEST 3: seller findAll ===");
	
		list = sellerDao.findAll();
		for (Seller obj : list ) {
			System.out.println(obj);
		}
		System.out.println("\n === TEST 4: seller findAll ===");
		Seller newSeller = new Seller(null, "Nadye", "nadyne@gmail.com", new Date(), 10000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Insert! New id = " + newSeller.getId());
		
		System.out.println("\n === TEST 5: seller findAll ===");
		seller = sellerDao.findbyId(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}

}
