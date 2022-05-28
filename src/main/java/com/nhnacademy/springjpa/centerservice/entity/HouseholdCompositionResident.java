//package com.nhnacademy.springjpa.centersevice.entity;
//
//import java.io.Serializable;
//import java.time.LocalDateTime;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.EmbeddedId;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.MapsId;
//import javax.persistence.Table;
//import lombok.AllArgsConstructor;
//import lombok.EqualsAndHashCode;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
//@Entity
//@Table(name = "household_composition_resident")
//public class HouseholdCompositionResident {
//    @EmbeddedId
//    private Pk pk;
//
////    @Id
////    @Column(name = "household_serial_number")
////    int householdSerialNumber;
//
//    @MapsId(value = "householdSerialNumber")
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "household_serial_number")
//    Household household;
//
////    @Id
////    @Column(name = "resident_serial_number")
////    int residentSerialNumber;
//
//    @MapsId(value = "residentSerialNumber")
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "resident_serial_number")
//    Resident resident;
//
//
//    @Column(name = "report_date")
//    LocalDateTime reportDate;
//
//    @Column(name = "household_relationship_code")
//    String householdRelationshipCode;
//
//    @Column(name = "household_composition_change_reason_code")
//    String householdCompositionChangeReasonCode;
//
//
//    @NoArgsConstructor
//    @AllArgsConstructor
//    @EqualsAndHashCode
//    @Getter
//    @Setter
//    @Embeddable
//    public static class Pk implements Serializable {
//
//        @Column(name = "household_serial_number")
//        Integer householdSerialNumber;
//
//        @Column(name = "resident_serial_number")
//        Integer residentSerialNumber;
//    }
//}
