package com.nath.abhijit.h2demo.controllers;

import com.nath.abhijit.h2demo.entities.CompanyRelationship;
import com.nath.abhijit.h2demo.services.CompanyRelationshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyRelationshipService companyRelationshipService;
    @GetMapping("/getorgrelationshipsbycompanyId/{companyId}")
    public ResponseEntity<List<CompanyRelationship>> getListOfOrgRelationships(@PathVariable(name = "companyId") String companyId) {
        return new ResponseEntity<List<CompanyRelationship>>(companyRelationshipService.getListOfCompanyRelationships(companyId), HttpStatus.OK);
    }

    @GetMapping("/getorgrelationshipsbyparentid/{companyId}")
    public ResponseEntity<List<CompanyRelationship>> getListOfOrgRelationshipsByParentId(@PathVariable(name = "companyId") String companyId) {
        return new ResponseEntity<List<CompanyRelationship>>(companyRelationshipService.getListOfCompanyRelationshipsByParentId(companyId), HttpStatus.OK);
    }

    @GetMapping("/getorgrelationshipsbychildid/{companyId}")
    public ResponseEntity<List<CompanyRelationship>> getListOfOrgRelationshipsByChildId(@PathVariable(name = "companyId") String companyId) {
        return new ResponseEntity<List<CompanyRelationship>>(companyRelationshipService.getListOfCompanyRelationshipsByChildId(companyId), HttpStatus.OK);
    }
}
