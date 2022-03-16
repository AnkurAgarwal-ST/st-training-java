package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();
  Candidate getById(Integer candidateId);
  void add(Integer candidateId, String email, String fname, String lname,String phone);
  void update(Integer candidateId, String email, String fname, String lname,String phone);
  void deleteById(Integer candidateId);
  
}
