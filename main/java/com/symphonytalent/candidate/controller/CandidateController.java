package com.symphonytalent.candidate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
  
  @GetMapping(value = "/get/{candidateId}")
  public Candidate getCandidateByID(@PathVariable("candidateId") Integer candidateId) {
	  return candidateService.getCandidateByID(candidateId);
		
  }  
  
  
  @PostMapping("/add")
	public void addCandidate(@RequestParam(name = "id") Integer candidateId, @RequestParam(name = "email") String email,
			@RequestParam(name = "fname") String fname, @RequestParam(name = "lname") String lname,
			@RequestParam(name = "phone") String phone) {
		
		candidateService.add(candidateId, email, fname, lname, phone);

	}
  
  @PostMapping("/update")
	public Candidate updateCandidate(@RequestParam(name = "id") Integer candidateId, @RequestParam(name = "email") String email,
			@RequestParam(name = "fname") String fname, @RequestParam(name = "lname") String lname,
			@RequestParam(name = "phone") String phone) {
		
		Candidate candidate = candidateService.getCandidateByID(candidateId);
		candidateService.update(candidateId, email, fname, lname, phone);
		

		return candidate;

	}
	@PostMapping("/delete")
	public Candidate deleteCandidateById(@RequestParam(name = "id") Integer candidateId) {

		Candidate candidate = candidateService.getCandidateByID(candidateId);
		candidateService.deleteById(candidateId);

		return candidate;

	}
}
