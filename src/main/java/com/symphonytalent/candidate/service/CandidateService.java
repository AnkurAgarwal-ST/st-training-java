package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();

  Candidate get(Integer id);

  List<Candidate> add(Candidate cand);

  List<Candidate> update(Candidate cand);
  List<Candidate> delete(Candidate cand);

  
}
