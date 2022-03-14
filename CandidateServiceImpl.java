package com.symphonytalent.candidate.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
  public Candidate getbyID(int canID) {

    Candidate can=candidates.stream().filter(c->c.getCandidateId()==canID).findFirst().orElse(null);
    return can;
  }
  @Override
  public String add(Candidate can) {
	  candidates.add(can);
	  return "Successfully added";
  }
  @Override
  public String edit(Candidate can) {
	  candidates.stream().filter(c->c.getCandidateId()==can.getCandidateId()).forEach(c->{
		  c.setEmail(can.getEmail());
		  c.setFirstName(can.getFirstName());
		  c.setLastName(can.getLastName());
		  c.setPhone(can.getPhone());
	  });;
	  return "Successfully edited";
  }
  @Override
  public String delete(int canID) {
	  candidates.removeIf(c->c.getCandidateId()==canID);
	  //candidates.stream().filter(c->c.getCandidateId()==can.getCandidateId()).remove();
	  //candidates.remove(canID);
	  return "Successfully deleted";
  }
}
