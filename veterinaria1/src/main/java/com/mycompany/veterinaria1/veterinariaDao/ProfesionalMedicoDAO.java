/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.ProfesionalMedico;
import java.util.List;

/**
 *
 * @author Manu
 */
public interface ProfesionalMedicoDAO {
     
    
   
    List<ProfesionalMedico> obtenerTodos();
   
    ProfesionalMedico obtenerPorId(int id);
   
    void guardar(ProfesionalMedico profesionalmedico);
    void actualizar(ProfesionalMedico profesionalmedico);
    void eliminar(int id);
    
}
