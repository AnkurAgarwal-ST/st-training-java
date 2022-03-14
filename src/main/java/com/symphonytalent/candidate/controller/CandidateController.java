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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
  
  @GetMapping(value = "/get/{id}")
  public Candidate getCandidateById(@PathVariable("id") Integer id) {
    Candidate c = candidateService.getCandidate(id);
    return c;
  }
  
  @PostMapping(value="/add")
  public List<Candidate> addCandidate(@RequestBody Candidate c) {
    candidateService.add(c);
    List<Candidate> candidates = candidateService.getAll();
    return candidates;
  }
  
  @PutMapping(value="/update")
  public List<Candidate> updateCandidate(@RequestBody Candidate c){
	  candidateService.update(c);
	  List<Candidate> candidates = candidateService.getAll();
	  return candidates;
  }
  
  
  @DeleteMapping(value = "/delete/{id}")
  public List<Candidate> deleteCandidate(@PathVariable("id") Integer id) {

	candidateService.delCandidate(id);
    List<Candidate> candidates = candidateService.getAll();
    return candidates;
  }
}
