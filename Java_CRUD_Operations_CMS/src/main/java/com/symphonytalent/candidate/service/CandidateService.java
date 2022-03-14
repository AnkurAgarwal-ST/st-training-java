package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();
  
  Candidate getCandidateById(Integer candidateId);
  
  public void addCandidate(Candidate candidate);
  public void updateCandidate(Candidate candidate,Integer candidateId);
  public void deleteCandidate(Integer candidateId);


}
