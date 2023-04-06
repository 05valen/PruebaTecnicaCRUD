package com.pruebaTecnica.PruebaCRUD.Service.ExamenIMPL;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Entity.Examen;
import com.pruebaTecnica.PruebaCRUD.Entity.Pregunta;
import com.pruebaTecnica.PruebaCRUD.Repository.ExamenRepository;
import com.pruebaTecnica.PruebaCRUD.Service.ExamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExamenIMPL implements ExamenService {

    @Autowired
    private ExamenRepository repository;
    @Override
    public List<Examen> ConsultarExamen() {
        return (List<Examen>) this.repository.findAll();
    }

    int TotalPuntos = 0 ;
    int cont = 0;
    int TotalPuntosSum = 0;

    @Override
    public Examen CrearExamen(Examen examen) {

        List<Pregunta> preguntas = new ArrayList<>();
        for( Pregunta pregunta : examen.getPreguntas() ) {

                pregunta.setExamen( examen );
                preguntas.add(pregunta);

                TotalPuntos= pregunta.getPuntos();
                cont++;
                System.out.println("Pregunta"+cont);
            TotalPuntosSum=pregunta.getPuntos();

            System.out.println("Total de puntos por pregunta:"+TotalPuntos);
            TotalPuntosSum = TotalPuntos;
        }

        System.out.println("Total de puntos por examen:"+ TotalPuntosSum);
        cont = 0;

         if(TotalPuntosSum <= 100){
             System.out.println("GUARDO ");
             examen.setPreguntas(preguntas);
             return this.repository.save(examen);
         }else{

             return null;
         }
    }

    @Override
    public Examen ModificarExamen(Examen examen) {
        return this.repository.save(examen);
    }

    @Override
    public Examen BuscarExamen(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public void EliminarExamen(int id) {
        this.repository.deleteById(id);
    }




}
