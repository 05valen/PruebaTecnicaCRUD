package com.pruebaTecnica.PruebaCRUD.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pruebaTecnica.PruebaCRUD.Utilities.StringConverter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Preguntas")
public class Pregunta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "enunciado")
    private String enunciado;
    @Convert(converter = StringConverter.class)
    @Column(name = "opciones")
    private List<String> opciones;

    @Column(name = "correcta")
    private String correcta;

    @Column(name = "puntos")
    private int puntos;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Examen examen;

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getCorrecta() {
        return correcta;
    }

    public void setCorrecta(String correcta) {
        this.correcta = correcta;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        this.examen = examen;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
