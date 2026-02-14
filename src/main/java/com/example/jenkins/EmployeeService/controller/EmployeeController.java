package com.example.jenkins.EmployeeService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


      @GetMapping("/status")
       public ResponseEntity<String> status(){
           return ResponseEntity.status(HttpStatus.ACCEPTED).body("working fine");
       }

}
