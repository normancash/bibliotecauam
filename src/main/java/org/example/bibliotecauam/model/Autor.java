package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Autor extends Identificable {

    private String nombre;

    private String apellido;
}
