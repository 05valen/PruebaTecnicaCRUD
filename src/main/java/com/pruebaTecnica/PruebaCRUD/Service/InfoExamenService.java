package com.pruebaTecnica.PruebaCRUD.Service;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Entity.InfoExamen;

import java.util.List;

public interface InfoExamenService {

    public List<InfoExamen> ConsultarInfoExamen();
    public InfoExamen CrearInfoExamen(InfoExamen infoExamen);
    public InfoExamen ModificarInfoExamen(InfoExamen infoExamen);
    public InfoExamen BuscarInfoExamen(int id);
    public void EliminarInfoExamen(int id);
}
