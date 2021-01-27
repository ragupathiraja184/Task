package com.assignment.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.demo.modal.Login;
import com.assignment.demo.modal.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long>{
	Manager findByEmail(String email);
}
