package com.example.backend.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer>{

}