package net.javaguides.ems.repository;

import net.javaguides.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRespository extends JpaRepository<Employee, Long> {
    boolean existsByEmail(String email);
}
