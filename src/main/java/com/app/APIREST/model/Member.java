package com.app.APIREST.model;

import lombok.Data;

@Data
public class Member {
    private String name;
    private Integer DNI;

    public Member(String name, Integer DNI) {
        this.name = name;
        this.DNI = DNI;
    }
}
