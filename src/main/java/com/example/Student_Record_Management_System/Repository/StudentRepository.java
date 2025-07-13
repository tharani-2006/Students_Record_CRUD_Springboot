package com.example.Student_Record_Management_System.Repository;

import com.example.Student_Record_Management_System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {}
