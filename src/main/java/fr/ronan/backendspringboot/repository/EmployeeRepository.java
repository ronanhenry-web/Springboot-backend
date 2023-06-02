package fr.ronan.backendspringboot.repository;

import fr.ronan.backendspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
