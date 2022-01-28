package com.example.demo.controllers;

import com.example.demo.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.NoteRepository;

import java.util.List;
@Controller
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NoteController {

    @Autowired
    NoteRepository nRepo;

    @GetMapping("/notes")
    public ResponseEntity<List<Note>> readNotes () {
        return new ResponseEntity<List<Note>>(nRepo.findAll(), HttpStatus.OK);
    }
}
