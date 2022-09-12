package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	//Operação para inserir no banco de dados o objeto que enviar como parâmetro de entrada
	void insert(Department obj);
	void update(Department obj);
	void deletebyId(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
