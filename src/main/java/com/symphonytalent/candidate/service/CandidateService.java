package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();
  Candidate get(Integer id);
  List<Candidate> delete(Integer id);
  List<Candidate> add(Candidate newCandidate);
  List<Candidate> update(Integer id,Candidate newCandidate);
}
