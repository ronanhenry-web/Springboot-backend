package fr.ronan.backendspringboot;

import fr.ronan.backendspringboot.entity.Employee;
import fr.ronan.backendspringboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendSpringbootApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BackendSpringbootApplication.class, args);
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {

        Employee employee1 = Employee.builder()
                .firstName("Ronan")
                .lastName("HENRY")
                .email("blabla@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("Sully")
                .lastName("AIGRIS")
                .email("coucou@gmail.com")
                .build();

        Employee employee3 = Employee.builder()
                .firstName("Johan")
                .lastName("SASUKE")
                .email("riri@gmail.com")
                .build();

        employeeRepository.save(employee1);
        employeeRepository.save(employee2);
        employeeRepository.save(employee3);
    }
}
