package crud.spring.service.impl;

import org.springframework.stereotype.Service;

import crud.spring.model.Employee;
import crud.spring.repository.EmployeeRepository;
import crud.spring.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

}
