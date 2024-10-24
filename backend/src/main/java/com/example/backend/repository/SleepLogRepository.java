package com.example.backend.repository;

import com.example.backend.model.SleepLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SleepLogRepository extends JpaRepository<SleepLogEntity, Long> {
}
