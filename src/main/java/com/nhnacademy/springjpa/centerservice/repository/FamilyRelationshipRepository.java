package com.nhnacademy.springjpa.centerservice.repository;

import com.nhnacademy.springjpa.centerservice.entity.FamilyRelationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyRelationshipRepository extends JpaRepository<FamilyRelationship, FamilyRelationship.Pk> {
}

