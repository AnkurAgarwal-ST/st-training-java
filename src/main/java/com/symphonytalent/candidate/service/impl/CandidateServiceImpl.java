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
}
