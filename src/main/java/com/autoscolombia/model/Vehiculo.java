package com.autoscolombia.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehiculo")
@Data // Esto de Lombok te crea los Getters y Setters automáticamente
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_vehiculo;

    @Column(unique = true, nullable = false, length = 10)
    private String placa;

    @Column(nullable = false, length = 20)
    private String tipo;

    @Column(length = 50)
    private String marca;

    @Column(length = 50)
    private String modelo;

    @Column(length = 30)
    private String color;

    //  Por ahora profe para la Iteración 1, dejaremos la relación con Usuario simple
    @Column(name = "id_user")
    private Integer idUser;
}