package com.chen.pro.zoo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    private String size;

    private Integer age;
}
