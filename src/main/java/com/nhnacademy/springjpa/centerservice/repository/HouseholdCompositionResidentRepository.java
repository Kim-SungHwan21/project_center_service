package com.nhnacademy.springjpa.centerservice.repository;

import com.nhnacademy.springjpa.centerservice.entity.HouseholdCompositionResident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdCompositionResidentRepository extends JpaRepository<HouseholdCompositionResident, HouseholdCompositionResident.Pk> {
}
