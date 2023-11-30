package com.mycompany.veterinaria1.clases;

import com.mycompany.veterinaria1.clases.Mascota;
import com.mycompany.veterinaria1.clases.ProfesionalMedico;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-30T15:47:19", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Turno.class)
public class Turno_ { 

    public static volatile SingularAttribute<Turno, ProfesionalMedico> medico;
    public static volatile SingularAttribute<Turno, Mascota> mascota;
    public static volatile SingularAttribute<Turno, Boolean> aprobado;
    public static volatile SingularAttribute<Turno, Integer> id;

}