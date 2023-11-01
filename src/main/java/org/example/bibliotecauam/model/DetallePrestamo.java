package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Embeddable
@Getter
@Setter
public class DetallePrestamo {

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    private Libro libro;
}
