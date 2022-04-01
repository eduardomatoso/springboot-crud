package crud.spring.service;

import java.util.List;

import crud.spring.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();
}
