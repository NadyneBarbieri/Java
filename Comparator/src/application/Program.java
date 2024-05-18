package application;

import java.util.ArrayList;
import java.util.List;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 9000.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
//		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toLowerCase()));
//		list.removeIf(p -> p.getPrice()<= 100);
//		list.removeIf(new ProductPredicate());
		
//		Predicate<Product> pred = p -> p.getPrice() >= 100.0;
//		list.removeIf(pred);
		
		list.removeIf(p -> p.getPrice() >= 100.0);
		
//		list.removeIf(Product::nonstaticProductPredicate);
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
