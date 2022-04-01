package crud.spring.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import crud.spring.exception.ResourceNotFoundException;
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

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		} else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
//	}

		// /\expression
	return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Empployee", "Id", id));
	
}
	
}
