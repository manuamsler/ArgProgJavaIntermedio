/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veterinaria1;

import com.mycompany.veterinaria1.clases.Gato;
import com.mycompany.veterinaria1.clases.Mascota;
import com.mycompany.veterinaria1.clases.Perro;
import com.mycompany.veterinaria1.clases.ProfesionalMedico;
import com.mycompany.veterinaria1.clases.Turno;
import com.mycompany.veterinaria1.persistencia.ControladoraPersistencia;
import com.mycompany.veterinaria1.veterinariaDao.GatoDAO;
import com.mycompany.veterinaria1.veterinariaDao.GatoRepository;
import com.mycompany.veterinaria1.veterinariaDao.MascotaDAO;
import com.mycompany.veterinaria1.veterinariaDao.MascotaRepository;
import com.mycompany.veterinaria1.veterinariaDao.PerroDAO;
import com.mycompany.veterinaria1.veterinariaDao.PerroRepository;
import com.mycompany.veterinaria1.veterinariaDao.ProfesionalMedicoDAO;
import com.mycompany.veterinaria1.veterinariaDao.ProfesionalMedicoRepository;
import com.mycompany.veterinaria1.veterinariaDao.TurnoDAO;
import com.mycompany.veterinaria1.veterinariaDao.TurnoRepository;

/**
 *
 * @author Manu
 */
public class Veterinaria1 {

    public static void main(String[] args) {
       // ControladoraPersistencia ctrlPersis = new ControladoraPersistencia();
       
       //-----------------Perro-pruebas-----------------------------------------------
       PerroDAO pDAO = new PerroRepository();
       
       //Perro perro = new Perro("Gran Danes",158,"Katana","perro");
       
      
       //----------------gato-pruebas--------------------------------------------------
       GatoDAO gDAO = new GatoRepository();
       
       //Gato gato = new Gato("Callejero");
       
      // Gato gato = new Gato("Callejero",155,"Playero","gato");
       //--------------Mascota-pruebas-------------------
        
       System.out.println("--------------------------------------------------");
       
       MascotaDAO mDAO = new MascotaRepository();
       
       //Mascota mascota = new Mascota();
       Mascota mascota = new Mascota(177 ,"Playero","Gato");  
       
       
      // pDAO.guardar(perro);
       //gDAO.guardar(gato);
       mDAO.guardar(mascota);
       
       System.out.println("Mascotas encontradas: " + mDAO.obtenerTodos());
       

       //--------------Medico-pruebas--------------------
       
       System.out.println("--------------------------------------------------");
       
       ProfesionalMedicoDAO pMDAO = new ProfesionalMedicoRepository();
       
       ProfesionalMedico profesionalMedico = new ProfesionalMedico(15,"Dr Ivan");  
       
       pMDAO.guardar(profesionalMedico);
       
       System.out.println("El Id del Profesional corresponde a : " + pMDAO.obtenerPorId(2));
       
       //-------------Turno-pruebas-----------------------
       
       System.out.println("--------------------------------------------------");
       
       TurnoDAO tDAO = new TurnoRepository();
       
      
       
       Turno turno = new Turno();
       
       turno.setId(5);
       turno.setMascota(mascota);
       turno.setMedico(profesionalMedico);
       //tDAO.aprobarTurno(turno.getId()); //funcion para saber si el turno esta ocupado
       turno.setAprobado(true);//Prueba de turno aprobado
       tDAO.guardar(turno);
       
       System.out.println("Detalles del turno : " + tDAO.obtenerPorId(turno.getId()));

    }
}
