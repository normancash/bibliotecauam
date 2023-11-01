package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
@Getter
@Setter
public class Direccion {

    private String nombreBarrio;

    private String domicilio;

    @ManyToOne
    @DescriptionsList
    private Municipio municipio;
}
