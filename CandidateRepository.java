package com.Jobprofile.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Jobprofile.demo.Entity.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Integer> {
boolean existsByMail(String mail);
boolean existsByPhone(Long phone);
}