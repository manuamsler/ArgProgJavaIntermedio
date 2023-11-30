/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.Perro;
import com.mycompany.veterinaria1.persistencia.PerroJpaController;
import com.mycompany.veterinaria1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

/**
 *
 * @author Manu
 */
public class PerroRepository implements PerroDAO {
    
    public PerroJpaController controllerPerroJpa;
    
    public PerroRepository() {
        this.controllerPerroJpa = new PerroJpaController();
    }

    @Override
    public Perro obtenerPorId(int id) {
        return controllerPerroJpa.findPerro(id);    }
    

    @Override
    public List<Perro> obtenerTodos() {
        return controllerPerroJpa.findPerroEntities();     }

    @Override
    public void guardar(Perro perro) {
        controllerPerroJpa.create(perro);     }

    @Override
    public void actualizar(Perro perro) {
        try {
                controllerPerroJpa.edit( perro);
            } catch (Exception e) {
            e.printStackTrace();
            }    }    

    @Override
    public void eliminar(int id) {
    try {
            controllerPerroJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }    }    
    
}
