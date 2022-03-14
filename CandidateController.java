package com.symphonytalent.candidate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
  
  @PostMapping(value = "/add")
  public String add(@RequestBody Candidate candidate) {
    //String candidates = candidateService.add(candidate);
    return candidateService.add(candidate) ;
  }
  
  @PutMapping(value = "/edit")
  public String edit(@RequestBody Candidate candidate) {
    return candidateService.edit(candidate) ;
  }
  @DeleteMapping(value = "/del")
  public String del(@RequestParam int candidateId) {
    return candidateService.del(candidateId) ;
  }
  @GetMapping(value = "/getbyid")
  public Candidate getCandidate(@RequestParam int canID) {

    //Candidate candidates = candidateService.getbyID();
    return candidateService.getbyID(canID);
  }

}
