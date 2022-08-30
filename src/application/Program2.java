package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Test 1: findById");
		
		Department dep = departmentDao.findById(5);
		System.out.println(dep);
		

		System.out.println("\nTest 2: findAll");
		
		List<Department> allDepartments = new ArrayList<>();
		
		allDepartments = departmentDao.findAll();
		for (Department d : allDepartments) {
			System.out.println(d);
		}
		
		/*
		System.out.println("\nTest 3: Insert");
		
		Department newDepartment = new Department(null, "Games");
		departmentDao.insert(newDepartment);
		System.out.println("New department inserted! New id is: " + newDepartment.getId());
		
		
		System.out.println("\nTest 4: Update department");
		
		dep = departmentDao.findById(5);
		dep.setName("Sports");
		departmentDao.update(dep);
		System.out.println("Department info updated");
		
		
		System.out.println("\nTest 5: Delete department");
		departmentDao.deleteById(6);
		System.out.println("Department deleted!");
		*/
	}
}
