package com.pruebaTecnica.PruebaCRUD.Controller;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Entity.Examen;
import com.pruebaTecnica.PruebaCRUD.Entity.Pregunta;
import com.pruebaTecnica.PruebaCRUD.Service.EstudianteServiceIMPL.EstudianteIMPL;
import com.pruebaTecnica.PruebaCRUD.Service.ExamenIMPL.ExamenIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("CRUDRepository")
public class ControllerExamen {


    @Autowired
    private ExamenIMPL impl;
    @GetMapping
    @RequestMapping(value = "ConsultarExamen",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarExamen(){
        List<Examen> ListaExamenes = this.impl.ConsultarExamen();
        return ResponseEntity.ok(ListaExamenes);
    }

    @PostMapping
    @RequestMapping(value = "CrearExamen",method = RequestMethod.POST)
    public ResponseEntity<?> CrearExamen(@RequestBody Examen examen){


        Examen ExamenCreado = this.impl.CrearExamen(examen);
         return ResponseEntity.status(HttpStatus.CREATED).body(ExamenCreado);
    }


    @PutMapping
    @RequestMapping(value = "ModificarExamen",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarExamen(@RequestBody Examen examen){
        Examen ExamenModificado = this.impl.ModificarExamen(examen);
        return ResponseEntity.status(HttpStatus.CREATED).body(ExamenModificado);
    }

    @GetMapping
    @RequestMapping(value = "BuscarExamen/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarExamen(@PathVariable int id){
        Examen examen = this.impl.BuscarExamen(id);
        return ResponseEntity.ok(examen);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarExamen/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarExamen(@PathVariable int id){
        this.impl.EliminarExamen(id);
        return ResponseEntity.ok().build();
    }









}
