package com.southwind.repository;

import com.southwind.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;

public interface StudentRepository {
    Collection<Student> findAll();

    Student findById(Integer id);

    void saveOrUpdate(Student student);

    void deleteById(Integer id);
}
