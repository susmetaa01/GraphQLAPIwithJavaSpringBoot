package com.example.demo.repository;

import com.example.demo.model.VarianceData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface VarianceDataRepository extends JpaRepository<VarianceData, Long> {
}
