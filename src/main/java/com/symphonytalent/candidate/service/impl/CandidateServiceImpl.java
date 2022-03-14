package com.symphonytalent.candidate.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.symphonytalent.candidate.bean.Candidate;
import com.symphonytalent.candidate.service.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {

  private static List<Candidate> candidates = new ArrayList<>();

  static{
    candidates.add(new Candidate(100, "ankur.agarwal@example.com", "Ankur", "Agarwal", "987654320"));
    candidates.add(new Candidate(101, "alok.sharma@example.com", "Alok", "Sharma", "987654321"));
    candidates.add(new Candidate(102, "farhan.qureshi@example.com", "Farhan", "Qureshi", "987654322"));
    candidates.add(new Candidate(103, "raju.rastogi@example.com", "Raju", "Rastogi", "987654323"));
    candidates.add(new Candidate(104, "chatur.ramalingam@example.com", "Chatur", "Ramalingam", "987654324"));
    candidates.add(new Candidate(105, "rancho@example.com ", "Ranchhoddas Shamaldas", "Chanchad", "987654325"));

  }

  @Override
  public List<Candidate> getAll() {
    return candidates;
  }

  @Override
public Candidate getCandidate(Integer id) {
	for(Candidate c: candidates) {
		int i = c.getCandidateId();
		if(i==id.intValue()) {
			return c;
		}
	}
	Candidate c = new Candidate();
	return c;
}
  
@Override 
public void add(Candidate c) {
	  candidates.add(c);
  }  
  
@Override
  public  void update(Candidate c) {
	  for(Candidate cd: candidates) {
			if(cd.getCandidateId()==c.getCandidateId()) {
				cd.setEmail(c.getEmail());
				cd.setFirstName(c.getFirstName());
				cd.setLastName(c.getLastName());
				cd.setPhone(c.getPhone());
				return;
			}
		}
  }
  
  
  @Override
  public void delCandidate(Integer id){
		for(int idx =0; idx<candidates.size(); idx++) {
			int i = candidates.get(idx).getCandidateId();
			if(i==id.intValue()) {
				candidates.remove(idx);
			}
		}
	}
 
  
}
