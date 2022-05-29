package com.nhnacademy.springjpa.centerservice.controller.restcontroller;

import com.nhnacademy.springjpa.centerservice.domain.ResidentRegisterRequest;
import com.nhnacademy.springjpa.centerservice.entity.Resident;
import com.nhnacademy.springjpa.centerservice.repository.ResidentRepository;
import javax.persistence.criteria.CriteriaBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/residents")
public class ResidentsController {
    private final ResidentRepository residentRepository;


    public ResidentsController(
        ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @PutMapping("/{residentSerialNumber}")
    public ResponseEntity<Integer> modifyResident(@PathVariable Integer residentSerialNumber,
                                                  @RequestBody ResidentRegisterRequest residentRequest) {
//        Resident resident = new Resident(residentSerialNumber, residentRequest.getName(), residentRequest.getResidentRegistrationNumber(),
//            residentRequest.getGenderCode(), residentRequest.getBirthDate(), residentRequest.getBirthPlaceCode(),
//            residentRequest.getRegistrationBaseAddress(), residentRequest.getDeathDate(),
//            residentRequest.getDeathPlaceCode(), residentRequest.getDeathPlaceAddress());

        Integer modifyResident = residentRepository.modifyResident(residentSerialNumber, residentRequest.getName(),
            residentRequest.getResidentRegistrationNumber(), residentRequest.getGenderCode(), residentRequest.getBirthDate(),
            residentRequest.getBirthPlaceCode(), residentRequest.getRegistrationBaseAddress(), residentRequest.getDeathDate(),
            residentRequest.getDeathPlaceCode(), residentRequest.getDeathPlaceAddress());
        return  ResponseEntity.ok().body(modifyResident);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Resident registerResident(@RequestBody ResidentRegisterRequest residentRequest) {

        Resident resident = residentRepository.registerResident(residentRequest.getResidentSerialNumber(), residentRequest.getName(),
            residentRequest.getResidentRegistrationNumber(), residentRequest.getGenderCode(), residentRequest.getBirthDate(),
            residentRequest.getBirthPlaceCode(), residentRequest.getRegistrationBaseAddress(), residentRequest.getDeathDate(),
            residentRequest.getDeathPlaceCode(), residentRequest.getDeathPlaceAddress());
        return  resident;
    }
}

