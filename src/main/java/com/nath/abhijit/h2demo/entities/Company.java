package com.nath.abhijit.h2demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "company", schema = "sys")
public class Company {

    @Id
    @Column(name = "COMPANYID")
    private String companyId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "PINCODE")
    private String pincode;
}
