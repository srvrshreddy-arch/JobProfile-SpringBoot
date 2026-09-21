package com.Jobprofile.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Jobprofile.demo.Entity.Candidate;
import com.Jobprofile.demo.Entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {
	boolean existsByMail(String mail);
	boolean existsByPhone(Long phone);
}


