package com.pruebaTecnica.PruebaCRUD.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Examenes")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @OneToMany(mappedBy = "examen", cascade = CascadeType.ALL)
    private List<Pregunta> preguntas;
    @OneToMany(mappedBy= "examen")
    private List<InfoExamen> examenes;
    @Column(name = "fecha")
    public Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public List<InfoExamen> getExamenes() {
        return examenes;
    }

    public void setExamenes(List<InfoExamen> examenes) {
        this.examenes = examenes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
