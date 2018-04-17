package com.cuteBrick.javaPractice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "units")
public class Units {

    @Id
    @Column(name = "name", nullable = false)
    private String name;
}
