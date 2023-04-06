package com.pruebaTecnica.PruebaCRUD.Controller;

import com.pruebaTecnica.PruebaCRUD.Entity.Estudiante;
import com.pruebaTecnica.PruebaCRUD.Entity.Examen;
import com.pruebaTecnica.PruebaCRUD.Entity.InfoExamen;
import com.pruebaTecnica.PruebaCRUD.Service.EstudianteServiceIMPL.EstudianteIMPL;
import com.pruebaTecnica.PruebaCRUD.Service.InfoExamServiceIMPL.InfoExamenIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("CRUDRepository")
public class InfoExamController {

    @Autowired
    private InfoExamenIMPL impl;

    @GetMapping
    @RequestMapping(value = "ConsultarInfoExamen",method = RequestMethod.GET)
    public ResponseEntity<?> ConsultarInfoExamen(){
        List<InfoExamen> ListaInfoExamen = this.impl.ConsultarInfoExamen();
        return ResponseEntity.ok(ListaInfoExamen);
    }

    @PostMapping
    @RequestMapping(value = "CrearInfoExamen",method = RequestMethod.POST)
    public ResponseEntity<?> CrearInfoExamenCreado(@RequestBody InfoExamen infoExamen){
        InfoExamen InfoExamenCreado = this.impl.CrearInfoExamen(infoExamen);
        return ResponseEntity.status(HttpStatus.CREATED).body(InfoExamenCreado);
    }

    @GetMapping
    @RequestMapping(value = "/BuscarInformacionExamen/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> BuscarInformacionExamen(@PathVariable int id){
        InfoExamen BuscarInfoExamen = this.impl.BuscarInfoExamen(id);
        return ResponseEntity.ok(BuscarInfoExamen);
    }

    @PutMapping
    @RequestMapping(value = "ModificarInformacionExamen",method = RequestMethod.PUT)
    public ResponseEntity<?> ModificarInformacionExamen(@RequestBody InfoExamen InformacionExamen){
        InfoExamen InformacionExamenModificado = this.impl.ModificarInfoExamen(InformacionExamen);
        return ResponseEntity.status(HttpStatus.CREATED).body(InformacionExamenModificado);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarInformacionExamen/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> EliminarInformacionExamen(@PathVariable int id){
        this.impl.EliminarInfoExamen(id);
        return ResponseEntity.ok().build();
    }




}
