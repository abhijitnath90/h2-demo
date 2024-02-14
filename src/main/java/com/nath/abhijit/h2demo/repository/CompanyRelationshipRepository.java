package com.nath.abhijit.h2demo.repository;

import com.nath.abhijit.h2demo.entities.CompanyRelationship;
import com.nath.abhijit.h2demo.id.CompanyRelationshipID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRelationshipRepository extends JpaRepository<CompanyRelationship, CompanyRelationshipID> {

    List<CompanyRelationship> findByCompanyRelationshipIDChildId(String parentId);

    List<CompanyRelationship> findByCompanyRelationshipIDParentId(String childId);
}
