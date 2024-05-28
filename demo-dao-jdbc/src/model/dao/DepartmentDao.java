package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void inset(Department obj);
	void update(Department obj);
	void deletebyId(Integer obj);
	Department findbyId(Integer id);
	List<Department> findAll();

}
