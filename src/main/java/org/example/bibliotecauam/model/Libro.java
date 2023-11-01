package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.DescriptionsList;
import org.openxava.annotations.Stereotype;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class Libro extends Identificable{

    private String nombre;

    @Stereotype("MEMO")
    private String descripcion;

    @ManyToOne
    @DescriptionsList
    private Autor autor;
}
