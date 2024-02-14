package com.nath.abhijit.h2demo.services.impl;

import com.nath.abhijit.h2demo.entities.CompanyRelationship;
import com.nath.abhijit.h2demo.id.CompanyRelationshipID;
import com.nath.abhijit.h2demo.repository.CompanyRelationshipRepository;
import com.nath.abhijit.h2demo.services.CompanyRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyRelationshipServiceImpl implements CompanyRelationshipService {

    @Autowired
    private CompanyRelationshipRepository companyRelationshipRepository;
    @Override
    public List<CompanyRelationship> getListOfCompanyRelationships(String companyId) {
        CompanyRelationshipID companyRelationshipID = new CompanyRelationshipID();
        companyRelationshipID.setChildId(companyId);
        companyRelationshipID.setParentId(companyId);
        Optional<CompanyRelationship> orgRelationshipOptional = companyRelationshipRepository.findById(companyRelationshipID);
        return orgRelationshipOptional.isPresent() ? List.of(orgRelationshipOptional.get()): null;
    }

    @Override
    public List<CompanyRelationship> getListOfCompanyRelationshipsByParentId(String companyId) {
        return companyRelationshipRepository.findByCompanyRelationshipIDParentId(companyId);
    }

    @Override
    public List<CompanyRelationship> getListOfCompanyRelationshipsByChildId(String companyId) {
        return companyRelationshipRepository.findByCompanyRelationshipIDChildId(companyId);
    }


}
