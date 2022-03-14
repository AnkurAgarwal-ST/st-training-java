package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();
  Candidate getById(Integer candidateId);
  void deleteCandidate(Integer candidateId);
  void add(Candidate candidate);
  void updateCandidate(Candidate candidate, Integer candidateId);
}
