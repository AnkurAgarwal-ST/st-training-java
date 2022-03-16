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

	@GetMapping("/getAll")
	public List<Candidate> getAllCandidates() {

		List<Candidate> candidates = candidateService.getAll();
		return candidates;
	}

	/*
	 * @GetMapping("/get") public Candidate getCandidateById(@RequestParam(name =
	 * "id") Integer candidateId) {
	 * 
	 * Candidate candidate = candidateService.getById(candidateId);
	 * 
	 * return candidate; }
	 */

	@GetMapping("/get/{candidateId}")
	public Candidate getCandidateId(@PathVariable(name = "candidateId") Integer candidateId) {

		Candidate candidate = candidateService.getById(candidateId);

		return candidate;
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

		Candidate candidate = candidateService.getById(candidateId);
		candidateService.update(candidateId, email, fname, lname, phone);


		return candidate;

	}
	@PostMapping("/delete")
	public Candidate deleteCandidateById(@RequestParam(name = "id") Integer candidateId) {

		Candidate candidate = candidateService.getById(candidateId);
		candidateService.deleteById(candidateId);

		return candidate;

	}



}
