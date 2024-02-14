package com.nath.abhijit.h2demo.services;

import com.nath.abhijit.h2demo.entities.CompanyRelationship;

import java.util.List;

public interface CompanyRelationshipService {

    public List<CompanyRelationship> getListOfCompanyRelationships(String orgId);

    public List<CompanyRelationship> getListOfCompanyRelationshipsByParentId(String orgId);

    public List<CompanyRelationship> getListOfCompanyRelationshipsByChildId(String orgId);
}
