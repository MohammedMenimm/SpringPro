package com.SpringPro.SpringPro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // No need to add any method; JpaRepository already provides CRUD operations
}
