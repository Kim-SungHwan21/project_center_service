package com.nhnacademy.springjpa.centerservice.repository;

import com.nhnacademy.springjpa.centerservice.entity.Resident;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.query.Param;

public interface ResidentRepository extends JpaRepository<Resident, Integer>,
    QuerydslPredicateExecutor<Resident> {

    @Modifying
    @Query("update Resident r set r.name = :name, r.residentRegistrationNumber = :residentRegistrationNumber, " +
        "r.genderCode = :genderCode, r.birthDate = :birthDate, r.birthPlaceCode = :birthPlaceCode," +
        "r.registrationBaseAddress = :registrationBaseAddress, r.deathDate = :deathDate," +
        "r.deathPlaceCode = :deathPlaceCode, r.deathPlaceAddress = :deathPlaceAddress where r.residentSerialNumber = :residentSerialNumber")
    Integer modifyResident(@Param("resident_serial_number") Integer residentSerialNumber
        , @Param("name") String name, @Param("resident_registration_number") String residentRegistrationNumber
        , @Param("gender_code") String genderCode, @Param("birth_date") Date birthDate, @Param("birth_place_code") String birthPlaceCode
        , @Param("registration_base_address") String registrationBaseAddress, @Param("death_date") Date deathDate
        , @Param("death_place_code") String deathPlaceCode, @Param("death_place_address") String deathPlaceAddress);

    @Modifying
    @Query(value = "insert into Resident (residentSerialNumber, name, university, residentRegistrationNumber, genderCode, birthDate," +
        "birthPlaceCode, registrationBaseAddress, deathDate, deathPlaceCode, deathPlaceAddress) "
        + "VALUES(:id,:studentName,:rollNumber,:university)", nativeQuery = true)
    Resident registerResident(@Param("resident_serial_number") Integer residentSerialNumber
        , @Param("name") String name, @Param("resident_registration_number") String residentRegistrationNumber
        , @Param("gender_code") String genderCode, @Param("birth_date") Date birthDate, @Param("birth_place_code") String birthPlaceCode
        , @Param("registration_base_address") String registrationBaseAddress, @Param("death_date") Date deathDate
        , @Param("death_place_code") String deathPlaceCode, @Param("death_place_address") String deathPlaceAddress);

}
