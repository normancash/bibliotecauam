package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.ListProperties;
import org.openxava.annotations.ReferenceView;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Collection;

@Entity
@Getter
@Setter
public class Prestamo extends Identificable{

    private LocalDate fechaPrestamo;

    private LocalDate fechaDevolucion;

    @ManyToOne
    @ReferenceView("Simple")
    private Estudiante estudiante;

    @ElementCollection
    @ListProperties("libro.id,libro.nombre,libro.autor.nombre")
    private Collection<DetallePrestamo> detalle;


}
