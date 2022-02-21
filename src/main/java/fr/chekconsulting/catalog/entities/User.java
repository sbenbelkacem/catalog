package fr.chekconsulting.catalog.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import static javax.persistence.EnumType.STRING;

@Entity(name = "people")
@Data
@NoArgsConstructor
public class User {

    @Id
    private String username;
    @Enumerated(STRING)
    private Role role;

}
