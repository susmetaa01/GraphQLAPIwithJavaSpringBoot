package com.example.demo.repository;

import com.example.demo.model.VarianceMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface VarianceMasterRepository extends JpaRepository<VarianceMaster, Long> {
}
