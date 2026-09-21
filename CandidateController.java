package com.Jobprofile.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Jobprofile.demo.Dto.CandidateRegisterDto;
import com.Jobprofile.demo.Dto.ResponseStructure;
import com.Jobprofile.demo.Entity.Candidate;
import com.Jobprofile.demo.Service.CadidateService;
import com.Jobprofile.demo.Service.CompanyService;

@RestController
public class CandidateController {
@Autowired
public CadidateService candidateService;
@PostMapping("Candidate/register")
public ResponseStructure<Candidate>  Createaccount (@RequestBody CandidateRegisterDto candidateRegisterDto) {

    return candidateService.Createaccount(candidateRegisterDto);
}
@GetMapping("Candidate/{id}")
public CandidateRegisterDto getCandidateById(@PathVariable int id) {
return candidateService.getCandidateById(id);
}
@DeleteMapping("Candidate/{id}")
public String  deleteCandidateById (@PathVariable int id) {
	return candidateService.deleteCandidateById(id);
}
}