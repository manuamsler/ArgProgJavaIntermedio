/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.Mascota;
import com.mycompany.veterinaria1.persistencia.MascotaJpaController;
import com.mycompany.veterinaria1.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Manu
 */
public class MascotaRepository implements MascotaDAO{
    public MascotaJpaController controllerMascotaJpa;
    
    public MascotaRepository() {
        this.controllerMascotaJpa = new MascotaJpaController();
    }
    
    
    
  

    @Override
    public List<Mascota> obtenerTodos() {
        return controllerMascotaJpa.findMascotaEntities();    }

    @Override
    public void guardar(Mascota mascota) {
        controllerMascotaJpa.create(mascota);    }

    @Override
    public void actualizar(Mascota mascota) {
        try {
            controllerMascotaJpa.edit( mascota);
            } catch (Exception e) {
            e.printStackTrace();
            }    }

    @Override
    public void eliminar(int id) {
    try {
            controllerMascotaJpa.destroy(id);
        } catch (NonexistentEntityException e) {
            e.printStackTrace();
        }    }

    @Override
    public Mascota obtenerPorId(int id) {
        return controllerMascotaJpa.findMascota(id);    }

    

  
    
}
