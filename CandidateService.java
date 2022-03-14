package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();
  
  String add(Candidate can);

  String edit(Candidate can);

  String delete(int canID);

  Candidate getbyID(int canID);
}
