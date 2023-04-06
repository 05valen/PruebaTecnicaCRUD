package com.pruebaTecnica.PruebaCRUD.Service.InfoExamServiceIMPL;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Entity.InfoExamen;
import com.pruebaTecnica.PruebaCRUD.Repository.EstudianteRepository;
import com.pruebaTecnica.PruebaCRUD.Repository.InfoExamenRepository;
import com.pruebaTecnica.PruebaCRUD.Service.InfoExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoExamenIMPL implements InfoExamenService {

    @Autowired
    private InfoExamenRepository repository;
    @Override
    public List<InfoExamen> ConsultarInfoExamen() {

        return (List<InfoExamen>) this.repository.findAll();
    }

    @Override
    public InfoExamen CrearInfoExamen(InfoExamen infoExamen) {

        return this.repository.save(infoExamen);

    }


    @Override
    public InfoExamen ModificarInfoExamen(InfoExamen infoExamen) {
        return this.repository.save(infoExamen);
    }

    @Override
    public InfoExamen BuscarInfoExamen(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public void EliminarInfoExamen(int id) {
        this.repository.deleteById(id);
    }






}
