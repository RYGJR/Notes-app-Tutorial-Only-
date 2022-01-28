package com.example.demo.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="table_notes")
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String body;
    private String category;
}
