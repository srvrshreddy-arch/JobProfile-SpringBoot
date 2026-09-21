package com.Jobprofile.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Jobprofile.demo.Dto.CandidateRegisterDto;
import com.Jobprofile.demo.Dto.CompanyRegisterDto;
import com.Jobprofile.demo.Dto.ResponseStructure;
import com.Jobprofile.demo.Entity.Company;
import com.Jobprofile.demo.Service.CompanyService;

@RestController
public class CompanyController {
@Autowired
public CompanyService companyservice;
@PostMapping("Company/register")
public ResponseStructure<Company> Createaccount(@RequestBody CompanyRegisterDto companyRegisterDto) {
	return companyservice.Createaccount(companyRegisterDto);
}
@GetMapping("Company/{id}")
public CompanyRegisterDto getCompanyByid(@PathVariable int id) {
return companyservice.getCompanyById(id);
}
@DeleteMapping("Company/{id}")
public String deleteComapanyId(@PathVariable int id) {
	return companyservice.deleteCompanyBYId(id);
}
}


