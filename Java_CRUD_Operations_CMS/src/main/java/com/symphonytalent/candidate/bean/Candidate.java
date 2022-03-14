package com.symphonytalent.candidate.bean;

public class Candidate {

  private Integer candidateId;

  private String email;

  private String firstName;

  private String lastName;

  private String phone;



  //default constructor
  public Candidate() {

  }

  public Candidate(Integer candidateId, String email, String firstName, String lastName,
      String phone) {
    this.candidateId = candidateId;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
  }

  public Integer getCandidateId() {
    return candidateId;
  }

  public void setCandidateId(Integer candidateId) {
    this.candidateId = candidateId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  
  }

