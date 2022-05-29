package com.nhnacademy.springjpa.centerservice.repository;

import com.nhnacademy.springjpa.centerservice.entity.Household;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdRepository extends JpaRepository<Household, Integer> {
}
