package com.nhnacademy.springjpa.centerservice.repository;

import com.nhnacademy.springjpa.centerservice.entity.BirthDeathReportResident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirthDeathReportResidentRepository extends JpaRepository<BirthDeathReportResident, BirthDeathReportResident.Pk> {
}
