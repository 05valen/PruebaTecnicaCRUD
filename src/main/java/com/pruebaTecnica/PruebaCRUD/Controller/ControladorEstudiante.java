package com.pruebaTecnica.PruebaCRUD.Controller;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Service.EstudianteServiceIMPL.EstudianteIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepository")
public class ControladorEstudiante {

    @Autowired
    private EstudianteIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarEstudiantes",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarEstudiantes(){
        List<Estudiante> ListaEstudiante = this.impl.ConsultarEstudiante();
        return ResponseEntity.ok(ListaEstudiante);
    }

    @PostMapping
    @RequestMapping(value = "CrearEstudiante",method = RequestMethod.POST)
    public ResponseEntity<?> CrearEstudiante(@RequestBody Estudiante estudiante){
        Estudiante EstudianteCreado = this.impl.CrearEstudiante(estudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstudianteCreado);
    }

    @PutMapping
    @RequestMapping(value = "ModificarEstudiante",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarEstudiante(@RequestBody Estudiante estudiante){
        Estudiante EstudianteModificado = this.impl.ModificarEstudiante(estudiante);
        return ResponseEntity.status(HttpStatus.CREATED).body(EstudianteModificado);
    }

    @GetMapping
    @RequestMapping(value = "BuscarEstudiante/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarEstudiante(@PathVariable int id){
        Estudiante estudiante = this.impl.BuscarEstudiante(id);
        return ResponseEntity.ok(estudiante);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarEstudiante/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarEstudiante(@PathVariable int id){
        this.impl.EliminarEstudiante(id);
        return ResponseEntity.ok().build();
    }





}
