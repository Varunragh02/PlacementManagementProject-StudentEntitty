package com.project.studententity.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.studententity.entity.Student;
 

 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}