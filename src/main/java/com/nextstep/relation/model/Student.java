package com.nextstep.relation.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name, contact;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adrees_id")
    private Address address;  // The Student has an Address
}
