package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;
import com.symphonytalent.candidate.service.impl.CandidateServiceImpl;

public interface CandidateService {

  List<Candidate> getAll();

String add(Candidate candidate);

String edit(Candidate candidate);

String del(int candidateId);

Candidate getbyID(int canID);

  

  
	  
   
}
