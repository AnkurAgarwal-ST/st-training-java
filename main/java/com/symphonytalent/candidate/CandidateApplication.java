package com.symphonytalent.candidate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class CandidateApplication
{
public static void main(String[] args) 
{

SpringApplication.run(CandidateApplication.class, args);
System.out.println("Open Application ->  http://localhost:8080");
}
}
