package com.nhnacademy.springjpa.centerservice.entity;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "certificate_issue")
public class CertificateIssue {

    @Id
    @Column(name = "certificate_confirmation_number")
    Long certificate_confirmation_number;

//    @Column(name = "resident_serial_number")
//    int resident_serial_number;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "resident_serial_number")
    Resident resident;

    @Column(name = "certificate_type_code")
    String certificate_type_code;

    @Column(name = "certificate_issue_date")
    LocalDateTime certificate_issue_date;
}
