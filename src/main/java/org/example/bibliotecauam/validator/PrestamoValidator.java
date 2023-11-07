package org.example.bibliotecauam.validator;

import lombok.Getter;
import lombok.Setter;
import org.example.bibliotecauam.model.DetallePrestamo;
import org.openxava.util.Messages;
import org.openxava.validators.IValidator;

import java.util.Collection;

@Getter
@Setter
public class PrestamoValidator implements IValidator {

    private Collection<DetallePrestamo> detalle;
    @Override
    public void validate(Messages messages) throws Exception {
         if (detalle.size() > 3) {
             messages.add("La cantidad de libros prestamos no debe ser mayor que 3");
         }
    }
}
