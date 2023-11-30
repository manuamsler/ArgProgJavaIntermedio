/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.veterinaria1.clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Manu
 */
@Entity
public class Turno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Mascota mascota;

    @ManyToOne
    private ProfesionalMedico medico;

    private boolean aprobado;

    public Turno() {
    }

    public Turno(int id, Mascota mascota, ProfesionalMedico medico, boolean aprobado) {
        this.id = id;
        this.mascota = mascota;
        this.medico = medico;
        this.aprobado = aprobado;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public ProfesionalMedico getMedico() {
        return medico;
    }

    public void setMedico(ProfesionalMedico medico) {
        this.medico = medico;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return "Turno{" + "id=" + id + ", mascota=" + mascota + ", medico=" + medico + ", aprobado=" + aprobado + '}';
    }
    
    

    
}
