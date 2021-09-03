package it.vscalcione.springboot.demoapplication.repositories;

import org.springframework.stereotype.Repository;

import it.vscalcione.springboot.demoapplication.models.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
