package com.nextstep.relation.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String dueDate;

    @ManyToOne()
    @JoinColumn(name = "teacher_id")
    @JsonBackReference("teacherAssignment")
    private Teacher teacher;
}


