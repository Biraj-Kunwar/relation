package com.nextstep.relation.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Address {

//    relations
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city, province, zipcode;

    @OneToOne
    private Student student;  // The Address has a reference to Student
}
