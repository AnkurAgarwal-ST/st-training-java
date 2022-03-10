package com.symphonytalent.candidate.service;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.symphonytalent.candidate.bean.Candidate;


@SpringBootTest
class CandidateServiceImplTest {

  @Autowired
  CandidateService candidateService;


  @Test
  void test_GetAllCandidate_shouldReturnSixCandidates() {
    List<Candidate> candidates = candidateService.getAll();
    Assertions.assertEquals(6, candidates.size());
  }

}
