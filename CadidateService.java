package com.Jobprofile.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Jobprofile.demo.Dto.CandidateRegisterDto;
import com.Jobprofile.demo.Dto.ResponseStructure;
import com.Jobprofile.demo.Entity.Candidate;
import com.Jobprofile.demo.Repository.CandidateRepository;
@Service
public class CadidateService {
	@Autowired
	CandidateRepository candidateRepo;
	public ResponseStructure<Candidate> Createaccount(CandidateRegisterDto candidatedto) {
		ResponseStructure<Candidate> responseStructure=new ResponseStructure<>();
		if(candidateRepo.existsByMail(candidatedto.getMail())) {
		responseStructure.setStatus(400);
		responseStructure.setMessage("Invalide");
		responseStructure.setData(null);
		return responseStructure;
	}
	if(candidateRepo.existsByPhone(candidatedto.getPhone())) {
	responseStructure.setStatus(400);
	responseStructure.setMessage("Invalide");
	responseStructure.setData(null);
	return responseStructure;
	}
		Candidate candidate= new Candidate();
		candidate.setName(candidatedto.getName());
		candidate.setMail(candidatedto.getMail());
		candidate.setPhone(candidatedto.getPhone());
		candidate.setGender(candidatedto.getGender());
		candidate.setAge(candidatedto.getAge());
		Candidate saveCandidate=candidateRepo.save(candidate);
		responseStructure.setStatus(201);
		responseStructure.setMessage("Candidate registered successfully");
		responseStructure.setData(saveCandidate);
		return responseStructure;
	}
	public CandidateRegisterDto getCandidateById(int id) {
		Optional <Candidate>candidate = candidateRepo.findById(id);
		if (candidate.isEmpty()) {

	        return null;

	    }
		Candidate candidate1=candidate.get();
		CandidateRegisterDto candidatedto = new CandidateRegisterDto();
		 candidatedto.setName(candidate1.getName());
		 candidatedto.setAge(candidate1.getAge());
		 candidatedto.setMail(candidate1.getMail());
		 candidatedto.setPhone(candidate1.getPhone());
		 candidatedto.setGender(candidate1.getGender());
		 
		return candidatedto;
		 
}
	public  String deleteCandidateById(int id) {
	   Optional	<Candidate> candidate=candidateRepo.findById(id);
			   if (candidate.isEmpty()) {

			        return "Candidate not found with id: " + id;

			    }

			    candidateRepo.delete(candidate.get());

			    return "Candidate deleted successfully";

			}		
}


