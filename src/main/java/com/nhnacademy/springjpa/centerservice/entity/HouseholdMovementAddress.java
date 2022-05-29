package com.nhnacademy.springjpa.centerservice.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
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
@Table(name = "household_movement_address")
public class HouseholdMovementAddress {
    @EmbeddedId
    private Pk pk;

//    @Id
//    @Column(name = "house_movement_report_date")
//    LocalDateTime house_movement_report_date;

    @MapsId(value = "householdSerialNumber")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "household_serial_number")
    Household household;

    @Column(name = "house_movement_address")
    String house_movement_address;

    @Column(name = "last_adress_yn")
    String last_adress_yn;

    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Getter
    @Setter
    @Embeddable
    public static class Pk implements Serializable {

        @Column(name = "house_movement_report_date")
        LocalDateTime house_movement_report_date;

        @Column(name = "household_serial_number")
        Integer householdSerialNumber;
    }
}
