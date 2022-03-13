package com.symphonytalent.candidate.service;

import java.util.List;
import com.symphonytalent.candidate.bean.Candidate;

public interface CandidateService {

  List<Candidate> getAll();
  List<Candidate> getCandidateByID(Integer id);
  String add(Candidate c);
  String update(Candidate c);
  String delete(Integer id);
}
