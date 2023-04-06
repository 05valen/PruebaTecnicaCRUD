package com.pruebaTecnica.PruebaCRUD.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "edad")
    private int edad;
    @Column(name = "cuidad")
    private String cuidad;
    @Column(name = "zona_Horaria")
    private int zonaHoraria;

    @OneToMany(mappedBy = "estudiante")
    private List<InfoExamen> examenes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public int getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(int zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public List<InfoExamen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<InfoExamen> examenes) {
        this.examenes = examenes;
    }
}
