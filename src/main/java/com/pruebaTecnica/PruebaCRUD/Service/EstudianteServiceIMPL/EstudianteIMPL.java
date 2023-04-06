package com.pruebaTecnica.PruebaCRUD.Service.EstudianteServiceIMPL;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Repository.EstudianteRepository;
import com.pruebaTecnica.PruebaCRUD.Service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteIMPL implements EstudianteService {

    @Autowired
    private EstudianteRepository repository;
    @Override
    public List<Estudiante> ConsultarEstudiante() {
        return (List<Estudiante>) this.repository.findAll();
    }

    @Override
    public Estudiante CrearEstudiante(Estudiante estudiante) {
        return this.repository.save(estudiante);
    }

    @Override
    public Estudiante ModificarEstudiante(Estudiante estudiante) {
        return this.repository.save(estudiante);
    }

    @Override
    public Estudiante BuscarEstudiante(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public void EliminarEstudiante(int id) {
          this.repository.deleteById(id);
    }
}
