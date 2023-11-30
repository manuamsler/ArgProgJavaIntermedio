/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.Mascota;
import java.util.List;

/**
 *
 * @author Manu
 */
public interface MascotaDAO {
    
    Mascota obtenerPorId(int id);
    List<Mascota> obtenerTodos();
    void guardar(Mascota mascota);
    void actualizar(Mascota mascota);
    void eliminar(int id);
    
}
