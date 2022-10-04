package com.example.airline.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




import com.example.airline.bean.*;
import com.example.airline.repository.*;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
public class UserController {
    @Autowired
    private UserRepository bankRepository;
    @GetMapping("/date1/")
    public ResponseEntity<List<User>> getStudents() {
        List<User> days1 = bankRepository.findAll();
        return new ResponseEntity<>(days1, HttpStatus.OK);
    }
    @PostMapping("/date1/")
    public ResponseEntity<User> createStudent(@RequestBody User student) {
        User std = bankRepository.save(student);
        return new ResponseEntity<>(std, HttpStatus.OK);
    }
    @PutMapping("/date1/{id}")
    public ResponseEntity<User> updateStudent(@RequestBody User student) {
        Optional<User> std = bankRepository.findById(student.getId());
        User stdUpdated = std.get();
        stdUpdated.setDays(student.getDate1());
        User studentUpdated = bankRepository.save(stdUpdated);
        return new ResponseEntity<>(studentUpdated, HttpStatus.OK);
    }
    @DeleteMapping("/date1/{id}")
    public ResponseEntity<String> createStudent(@PathVariable(name = "id") Long id) {
        bankRepository.deleteById(id);
        return new ResponseEntity<>("user id: "+ id + " deleted successfully", HttpStatus.OK);
    }
   
}