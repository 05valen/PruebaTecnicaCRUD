package com.pruebaTecnica.PruebaCRUD.Service;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;

import java.util.List;

public interface EstudianteService {

    public List<Estudiante> ConsultarEstudiante();
    public Estudiante CrearEstudiante(Estudiante estudiante);
    public Estudiante ModificarEstudiante(Estudiante estudiante);
    public Estudiante BuscarEstudiante(int id);
    public void EliminarEstudiante(int id);




}
