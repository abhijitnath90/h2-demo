package com.nath.abhijit.h2demo.id;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Getter
@Setter
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class CompanyRelationshipID implements Serializable {

    @Column(name = "CHILDID")
    private String childId;
    @Column(name = "PARENTID")
    private String parentId;

}
