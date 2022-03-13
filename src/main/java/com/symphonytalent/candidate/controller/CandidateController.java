package com.symphonytalent.candidate.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

  @GetMapping("/get")
  public Candidate get(@RequestParam int id) {
    Candidate candidates = candidateService.get(id);
    return candidates;
  }

  @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Candidate> add(@RequestBody Candidate cand) {
    List<Candidate> candidates = candidateService.add(cand);
    return candidates;
  }

  @PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Candidate> update(@RequestBody Candidate cand) {
    List<Candidate> candidates = candidateService.update(cand);
    return candidates;
  }

  @PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public List<Candidate> delete(@RequestBody Candidate cand) {
    List<Candidate> candidates = candidateService.delete(cand);
    return candidates;
  }

}
