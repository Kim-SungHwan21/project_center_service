//package com.nhnacademy.springjpa.centersevice.entity;
//
//import java.time.LocalDateTime;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.MapsId;
//import javax.persistence.Table;
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
//@Table(name = "household")
//public class Household {
//
//    @Id
//    @Column(name = "household_serial_number")
//    Integer household_serial_number;
//
//    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "household_resident_sirial_number")
//    Resident resident;
//
//
//    @Column(name = "household_composition_date")
//    LocalDateTime household_composition_date;
//
//
//    @Column(name = "household_composition_reson_code")
//    String household_composition_reson_code;
//
//    @Column(name = "current_house_movement_address")
//    String current_house_movement_address;
//
//
//
//}
