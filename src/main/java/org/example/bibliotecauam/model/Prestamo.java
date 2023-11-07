package org.example.bibliotecauam.model;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.*;
import org.openxava.calculators.CurrentDateCalculator;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;

@Entity
@Getter
@Setter
@View(members = "datosprestamos[fechaPrestamo,fechaDevolucion];" +
        "estudiante{estudiante},libros{detalle}")
@EntityValidator(value=org.example.bibliotecauam.validator.PrestamoValidator.class,
                 properties = {
                    @PropertyValue(name="detalle")
                 })
public class Prestamo extends Identificable{

    @DefaultValueCalculator(CurrentDateCalculator.class)
    @ReadOnly
    private Date fechaPrestamo;

    private LocalDate fechaDevolucion;

    @ManyToOne
    @ReferenceView("Simple")
    private Estudiante estudiante;

    @ElementCollection
    @ListProperties("libro.id,libro.nombre,libro.autor.nombre")
    private Collection<DetallePrestamo> detalle;


}
