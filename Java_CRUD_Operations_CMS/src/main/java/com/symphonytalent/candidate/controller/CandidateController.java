package com.symphonytalent.candidate.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
  
 @GetMapping(value = "/get/{candidateId}")
  public Candidate getCandidateById(@PathVariable("candidateId") Integer candidateId)
{
	 
return candidateService.getCandidateById(candidateId);
}  
 @PostMapping(value = "/add")
 
	public void addCandidate(@RequestBody Candidate candidate) {
		candidateService.addCandidate(candidate);
	}
 @PutMapping(value = "/update/{candidateId}")
 public void updateCandidate(@RequestBody Candidate candidate,@PathVariable("candidateId") Integer candidateId){
	 candidateService.updateCandidate(candidate, candidateId);
 }
 @DeleteMapping(value = "/delete/{candidateId}")
 public void deleteCandidate(@PathVariable("candidateId") Integer candidateId) {
	candidateService.deleteCandidate(candidateId);
 
	 
	    
 }

 
}