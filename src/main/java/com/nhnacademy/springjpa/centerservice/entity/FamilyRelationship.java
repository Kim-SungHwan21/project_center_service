//package com.nhnacademy.springjpa.centersevice.entity;
//
//import java.io.Serializable;
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
//@Table(name = "family_relationship")
//public class FamilyRelationship {
//    @EmbeddedId
//    private Pk pk;
//
//    @Id
//    @Column(name = "family_resident_serial_number")
//    Integer familyResidentSerialNumber;
//
////    @Id
////    @Column(name = "base_resident_serial_number")
////    Integer baseResidentSerialNumber;
//
//    @MapsId(value = "baseResidentSerialNumber")
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "resident_serial_number")
//    Resident resident;
//
//    @Column(name = "family_relationship_code")
//    String familyRelationshipCode;
//
//    @NoArgsConstructor
//    @AllArgsConstructor
//    @EqualsAndHashCode
//    @Getter
//    @Setter
//    @Embeddable
//    public static class Pk implements Serializable {
//
//        @Column(name = "family_resident_serial_number")
//        Integer familyResidentSerialNumber;
//
//        @Column(name = "base_resident_serial_number")
//        Integer baseResidentSerialNumber;
//    }
//}
