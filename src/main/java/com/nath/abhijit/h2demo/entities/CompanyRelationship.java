package com.nath.abhijit.h2demo.entities;

import com.nath.abhijit.h2demo.id.CompanyRelationshipID;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "CompanyRelationship", schema = "SYS")
public class CompanyRelationship implements Serializable {

    @EmbeddedId
    private CompanyRelationshipID companyRelationshipID;
    @Column(name = "COMPANYSTARTDATE")
    private Date companyStartDate;
}
