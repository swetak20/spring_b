package com.example.first_toy.repository;

import org.springframework.stereotype.Repository;

import com.example.first_toy.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface StudentRepository extends JpaRepository<Student, Long>{

}
