package com.pruebaTecnica.PruebaCRUD.Service;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Entity.Examen;

import java.util.List;

public interface ExamenService {


    public List<Examen> ConsultarExamen();
    public Examen CrearExamen(Examen examen);
    public Examen ModificarExamen(Examen examen);
    public Examen BuscarExamen(int id);
    public void EliminarExamen(int id);
}
