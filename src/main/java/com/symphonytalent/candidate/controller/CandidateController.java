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
  
  @GetMapping(value = "/getCandidateByID")
  public List<Candidate> getByID(@RequestParam(value="id") String id) {
	Integer candidateID = Integer.parseInt(id);
	List<Candidate> cand = candidateService.getCandidateByID(candidateID);
	  
	return cand;	  
  }
  
  @PostMapping("/add")
  public String getAll(@RequestBody Candidate cand) {
	  return candidateService.add(cand);
  }
  
  @PutMapping("/update")
  public String edit(@RequestBody Candidate cand) {
	  return candidateService.update(cand);
  }
  
  @DeleteMapping("/delete")
  public String delete(@RequestParam(value="id") String id) {
	  Integer cid = Integer.parseInt(id);
	  return candidateService.delete(cid);
  }
  
  
}
