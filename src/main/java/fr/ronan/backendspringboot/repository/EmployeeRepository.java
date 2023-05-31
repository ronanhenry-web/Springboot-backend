package fr.ronan.backendspringboot.repository;

import fr.ronan.backendspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
