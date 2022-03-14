package com.symphonytalent.candidate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.symphonytalent.candidate.bean.Candidate;
import com.symphonytalent.candidate.service.CandidateService;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

  @Autowired
  private CandidateService candidateService;


  @GetMapping(value = "/getAll")
  public List<Candidate> getAllCandidates() {

    List<Candidate> candidates = candidateService.getAll();
    return candidates;
  }
  @GetMapping(value="/get/{id}")
  public Candidate get(@PathVariable Integer id) {
	  Candidate res = candidateService.get(id);
	  return res;
	  
  }
  @DeleteMapping(value="/delete/{id}")
  public List<Candidate> delete(@PathVariable Integer id){
	  List<Candidate> res = candidateService.delete(id);
	  return res;
  }
  @PostMapping(value="/add")
  public List<Candidate> add(@RequestBody Candidate newCandidate){
	  List<Candidate> res = candidateService.add(newCandidate);
	  return res;
  }
  @PutMapping(value="/update/{id}")
  public List<Candidate> update(@PathVariable Integer id, @RequestBody Candidate newCandidate)
  {
	  List<Candidate> res = candidateService.update(id,newCandidate);
	  return res;
  }
}
