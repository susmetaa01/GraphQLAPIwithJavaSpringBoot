package com.example.demo.repository;

import com.example.demo.model.VarianceAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface VarianceActionRepository extends JpaRepository<VarianceAction, Long> {
}
