/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.veterinaria1.veterinariaDao;

import com.mycompany.veterinaria1.clases.Gato;
import java.util.List;

/**
 *
 * @author Manu
 */
public interface GatoDAO {
    Gato obtenerPorId(int id);
    List<Gato> obtenerTodos();
    void guardar(Gato gato);
    void actualizar(Gato gato);
    void eliminar(int id);
}
