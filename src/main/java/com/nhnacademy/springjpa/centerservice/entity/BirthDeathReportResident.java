package com.nhnacademy.springjpa.centerservice.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "birth_death_report_resident")
public class BirthDeathReportResident {
    @EmbeddedId
    private Pk pk;

//    @Id
//    @Column(name = "birth_death_type_code")
//    String birthDeathTypeCode;
//
//    @Id
//    @Column(name = "report_resident_serial_number")
//    Integer reportResidentSerialNumber;

//    @Id
//    @Column(name = "resident_serial_number")
//    Integer residentSerialNumber;

    @MapsId(value = "residentSerialNumber")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "resident_serial_number")
    Resident resident;

    @Column(name = "birth_death_report_date")
    LocalDateTime birthDeathReportDate;

    @Column(name = "birth_report_qualifications_code")
    String birthReportQualificationsCode;


    @Column(name = "death_report_qualifications_code")
    String deathReportQualificationsCode;


    @Column(name = "email_address")
    String emailAddress;

    @Column(name = "phone_number")
    String phoneNumber;


    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Getter
    @Setter
    @Embeddable
    public static class Pk implements Serializable {

        @Column(name = "birth_death_type_code")
        String birthDeathTypeCode;

        @Column(name = "report_resident_serial_number")
        Integer reportResidentSerialNumber;

        @Column(name = "resident_serial_number")
        Integer residentSerialNumber;
    }
}

