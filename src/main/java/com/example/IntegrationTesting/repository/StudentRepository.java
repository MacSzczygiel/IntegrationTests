package com.example.IntegrationTesting.repository;

import com.example.IntegrationTesting.domain.StudentEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    public StudentEntity findByName(String name);
    public List<StudentEntity> findAll();

    public StudentEntity findByBirthdayAfter(Date date);

    public StudentEntity findByBirthdayBeforeAndName(Date
                                                             date, String name);
}
