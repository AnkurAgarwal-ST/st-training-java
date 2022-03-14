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
  public Candidate get(Integer id) {
	  int index=-1;
	  for(int i=0;i<candidates.size();i++) {
		  Candidate temp = candidates.get(i);
		  if(temp.getCandidateId()==id)
		  {
			  index = candidates.indexOf(temp);
			  
		  }
	  }
	  return candidates.get(index);
  }
  @Override
  public List<Candidate> delete(Integer id) {
	  int index=-1;
	  for(int i=0;i<candidates.size();i++) {
		  Candidate temp = candidates.get(i);
		  if(temp.getCandidateId()==id)
		  {
			  index = candidates.indexOf(temp);
			  
		  }
	  }
	  candidates.remove(index);
	  return candidates;
  }
  @Override
  public List<Candidate> add(Candidate newCandidate){
	  candidates.add(newCandidate);
	  return candidates;
  }
  @Override
  public List<Candidate> update(Integer id,Candidate newCandidate){
	  int index=-1;
	  for(int i=0;i<candidates.size();i++) {
		  Candidate temp = candidates.get(i);
		  if(temp.getCandidateId()==id)
		  {
			  index = candidates.indexOf(temp);
			  
		  }
	  }
	  candidates.set(index, newCandidate);
	  return candidates;
  }
}
