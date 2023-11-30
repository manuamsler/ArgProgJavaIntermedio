/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria1.persistencia;

/**
 *
 * @author Manu
 */
public class ControladoraPersistencia {
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    
    TurnoJpaController turnoJpa = new TurnoJpaController();
    
    ProfesionalMedicoJpaController proMedJpa = new ProfesionalMedicoJpaController();
    
    PerroJpaController perroJpa = new PerroJpaController();
    
    GatoJpaController gatoJpa = new GatoJpaController();
}
