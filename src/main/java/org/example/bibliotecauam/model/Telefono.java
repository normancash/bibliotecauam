package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@Setter
public class Telefono {

    private String identificadorPais;
    private String numeroTelefono;
}
