package com.Jobprofile.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jobprofile.demo.Dto.CompanyRegisterDto;
import com.Jobprofile.demo.Dto.ResponseStructure;
import com.Jobprofile.demo.Entity.Company;
import com.Jobprofile.demo.Repository.CompanyRepository;

@Service
public class CompanyService {
@Autowired
CompanyRepository companyRepo;
public ResponseStructure<Company> Createaccount(CompanyRegisterDto comapnyRegisterDto) {
	ResponseStructure<Company>responseStructure=new ResponseStructure<Company>();
	if(companyRepo.existsByMail(comapnyRegisterDto.getMail())) {
	responseStructure.setStatus(400);
	responseStructure.setMessage("Inavliade");
	responseStructure.setData(null);
	return responseStructure;
	}
	if(companyRepo.existsByPhone(comapnyRegisterDto.getPhone())) {
		responseStructure.setStatus(400);
		responseStructure.setMessage("Inavliade");
		responseStructure.setData(null);
		return responseStructure;
		}
	Company company=new Company();
	company.setName(comapnyRegisterDto.getName());
	company.setMail(comapnyRegisterDto.getMail());
	company.setPhone(comapnyRegisterDto.getPhone());
	company.setAddress(comapnyRegisterDto.getAddress());
	company.setTypeofcompany(comapnyRegisterDto.getTypeofcomapany());
	company.setNoofemployess(comapnyRegisterDto.getNoofemployess());
	Company saveCompany=companyRepo.save(company);
	responseStructure.setStatus(201);
	responseStructure.setMessage("Company registered successfully");
	responseStructure.setData(saveCompany);
	return responseStructure;
	
}
public CompanyRegisterDto getCompanyById(int id) {
Optional<Company> company = companyRepo.findById(id);
if (company.isEmpty()) {
	return null;
}	
  Company company1=company.get();
	CompanyRegisterDto companydto= new CompanyRegisterDto();
	companydto.setName(company1.getName());
	companydto.setAddress(company1.getAddress());
	companydto.setMail(company1.getMail());
	companydto.setPhone(company1.getPhone());
	companydto.setTypeofcomapany(company1.getTypeofcompany());
	companydto.setNoofemployess(company1.getNoofemployess());
	
	return companydto;
}
public String deleteCompanyBYId(int id) {
	Optional <Company> company=companyRepo.findById(id);
			if(company.isEmpty()) {
				return "Company not found with id: "+id;
			}
	return"Company deleted successfully";
	
}

}

