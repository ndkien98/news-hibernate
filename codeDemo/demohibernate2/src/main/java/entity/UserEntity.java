package com.t3h.hibernate.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "USER")
@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String fullName;



}
