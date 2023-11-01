package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Municipio extends Identificable{

    private String nombre;

    private String descripcion;
}
