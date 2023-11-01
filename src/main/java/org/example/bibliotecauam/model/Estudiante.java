package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.File;
import org.openxava.annotations.ListProperties;
import org.openxava.annotations.View;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Collection;

@Entity
@Getter
@Setter
@View(name="Simple",members = "nombre,apellido")
public class Estudiante extends Identificable{

    private String nombre;

    private String apellido;

    @File
    @Column(length = 32)
    private String foto;

    @ElementCollection
    @ListProperties("nombreBarrio,domicilio,municipio.nombre")
    private Collection<Direccion> direcciones;


    @ElementCollection
    @ListProperties("identificadorPais,numeroTelefono")
    private Collection<Telefono> telefonos;
}
