package com.symphonytalent.candidate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
  @RequestMapping(value="/getById/{candidateId}")
	  public Candidate getById(@PathVariable("candidateId") Integer candidateId) {
		  return candidateService.getById(candidateId);
	  
  }
  
  @RequestMapping(method=RequestMethod.POST,value="/add")
  public void add(@RequestBody Candidate candidate) {
	  candidateService.add(candidate);
  }
  
  @RequestMapping(method=RequestMethod.PUT,value="/updateCandidate/{candidateId}")
  public void updateCandidate(@RequestBody Candidate candidate, @PathVariable("candidateId") Integer candidateId) {
	  candidateService.updateCandidate(candidate,candidateId);
  }
  
  @RequestMapping(method=RequestMethod.DELETE,value="/deleteCandidate/{candidateId}")
  public void deleteCandidate(@PathVariable("candidateId") Integer candidateId) {
	  candidateService.deleteCandidate(candidateId);
  }
}
