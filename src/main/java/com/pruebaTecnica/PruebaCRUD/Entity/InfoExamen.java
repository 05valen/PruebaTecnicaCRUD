package com.pruebaTecnica.PruebaCRUD.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pruebaTecnica.PruebaCRUD.Utilities.StringConverter;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "InfoExamen")
public class InfoExamen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="estudiante_id")
    private Estudiante estudiante;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="examen_id")
    private Examen examen;
    @Convert(converter = StringConverter.class)
    @Column(name = "respuestas")
    private List<String> respuestas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }
}
