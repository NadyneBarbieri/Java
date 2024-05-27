package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {
	
	void inset(Departament obj);
	void update(Departament obj);
	void deletebyId(Integer obj);
	Departament findbyId(Integer id);
	List<Departament> findAll();

}
