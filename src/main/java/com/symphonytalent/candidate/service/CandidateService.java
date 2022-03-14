package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();
  Candidate getCandidate(Integer id);
  void add(Candidate c);
  void update(Candidate c);
  void delCandidate(Integer id);
}
