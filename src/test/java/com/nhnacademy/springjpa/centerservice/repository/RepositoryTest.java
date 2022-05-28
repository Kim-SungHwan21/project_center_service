package com.nhnacademy.springjpa.centerservice.repository;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.nhnacademy.springjpa.centerservice.config.RootConfig;
import com.nhnacademy.springjpa.centerservice.config.WebConfig;
import com.nhnacademy.springjpa.centerservice.entity.Resident;
import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@Transactional
@ContextHierarchy({
    @ContextConfiguration(classes = RootConfig.class),
    @ContextConfiguration(classes = WebConfig.class)
})
public class RepositoryTest {

    @Autowired
    ResidentRepository residentRepository;

    @Test
    public void studentTest() {

        //2, '남석환', '540514-1234562', '남', '19540514173000', '병원',
        // '경기도 성남시 분당구 대왕판교로645번길', null, null, null
        Resident resident1 = new Resident();
        resident1.setResidentSerialNumber(8);
        resident1.setName("남석환");
        resident1.setResidentRegistrationNumber("540514-1234562");
        resident1.setGenderCode("남");
        resident1.setBirthDate(LocalDateTime.now());
        resident1.setBirthPlaceCode("병원");
        resident1.setRegistrationBaseAddress("경기도 성남시 분당구 대왕판교로645번길");
        resident1.setDeathDate(null);
        resident1.setDeathPlaceAddress(null);
        resident1.setDeathPlaceAddress(null);

        residentRepository.saveAndFlush(resident1);

        assertThat(resident1.getName()).isEqualTo("남석환");
    }
}
