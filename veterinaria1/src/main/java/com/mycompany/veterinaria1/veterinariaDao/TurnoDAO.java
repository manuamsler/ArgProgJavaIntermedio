/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.Mascota;
import com.mycompany.veterinaria1.clases.Turno;
import java.util.List;

/**
 *
 * @author Manu
 */
public interface TurnoDAO {
     Turno obtenerPorId(int id);
    List<Turno> obtenerTodos();
    void guardar(Turno turno);
    void actualizar(Turno turno);
    void eliminar(int id);
   // void aprobarTurno(int id);
    
   
}
