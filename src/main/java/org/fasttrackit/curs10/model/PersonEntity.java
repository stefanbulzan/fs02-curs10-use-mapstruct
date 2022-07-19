package org.fasttrackit.curs10.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonEntity {
    private String firstName;
    private String lastName;
    private String city;
    private int age;
}
