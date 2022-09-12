package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {
	
	//Operação para inserir no banco de dados o objeto que enviar como parâmetro de entrada
	void insert(Seller obj);
	void update(Seller obj);
	void deletebyId(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);
}
