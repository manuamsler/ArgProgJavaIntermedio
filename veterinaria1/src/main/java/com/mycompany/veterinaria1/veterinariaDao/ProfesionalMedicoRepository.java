/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.ProfesionalMedico;
import com.mycompany.veterinaria1.persistencia.ProfesionalMedicoJpaController;
import com.mycompany.veterinaria1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Manu
 */
public class ProfesionalMedicoRepository implements ProfesionalMedicoDAO{
    
    public ProfesionalMedicoJpaController controllerProfesionalMedicoJpa;
    
    public ProfesionalMedicoRepository() {
        this.controllerProfesionalMedicoJpa = new ProfesionalMedicoJpaController();
    }

   

    @Override
    public void guardar(ProfesionalMedico profesionalmedico) {
        controllerProfesionalMedicoJpa.create(profesionalmedico);    }

    @Override
    public void actualizar(ProfesionalMedico profesionalmedico) {
try {
            controllerProfesionalMedicoJpa.edit( profesionalmedico);
        } catch (Exception e) {
            e.printStackTrace();
        }    }    

    @Override
    public void eliminar(int id) {
try {
            controllerProfesionalMedicoJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }    }

    @Override
    public ProfesionalMedico obtenerPorId(int id) {
        return controllerProfesionalMedicoJpa.findProfesionalMedico(id);     }

    @Override
    public List<ProfesionalMedico> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 }
    

