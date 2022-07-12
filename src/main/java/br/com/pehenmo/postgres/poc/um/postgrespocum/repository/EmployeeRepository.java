package br.com.pehenmo.postgres.poc.um.postgrespocum.repository;

import br.com.pehenmo.postgres.poc.um.postgrespocum.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
