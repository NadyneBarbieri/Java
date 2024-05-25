package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void inset(Seller obj);
	void update(Seller obj);
	void deletebyId(Integer obj);
	Seller findbyId(Integer id);
	List<Seller> findAll();
}
