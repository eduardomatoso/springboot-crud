package crud.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import crud.spring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
