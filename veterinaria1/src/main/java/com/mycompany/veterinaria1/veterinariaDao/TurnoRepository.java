/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.Turno;
import com.mycompany.veterinaria1.persistencia.TurnoJpaController;
import com.mycompany.veterinaria1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Manu
 */
public class TurnoRepository implements TurnoDAO{

    public TurnoJpaController controllerTurnoJpa;
    
    public TurnoRepository() {
        this.controllerTurnoJpa = new TurnoJpaController();
    }
    
    
    
  

    @Override
    public List<Turno> obtenerTodos() {
        return controllerTurnoJpa.findTurnoEntities();    }

    @Override
    public void guardar(Turno turno) {
        controllerTurnoJpa.create(turno);    }

    @Override
    public void actualizar(Turno turno) {
try {
            controllerTurnoJpa.edit( turno);
        } catch (Exception e) {
            e.printStackTrace();
        }    }

    @Override
    public void eliminar(int id) {
try {
            controllerTurnoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }    }

    @Override
    public Turno obtenerPorId(int id) {
        return controllerTurnoJpa.findTurno(id);    }

    
   // @Override
   //  public void aprobarTurno(int id) {
   //    Turno turno = controllerTurnoJpa.findTurno(id);
   //    if (controllerTurnoJpa.findTurno(id) == null) {
   //       //turno.setAprobado(true);
   //       controllerTurnoJpa.create(turno);
   //       System.out.println("Turno aprobado ");
   //    }
   //    else{ 
   //        System.out.println("Turno Ocupado");
//}

    //  }
}
