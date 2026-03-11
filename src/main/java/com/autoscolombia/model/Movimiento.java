package com.autoscolombia.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "movimiento")
@Data
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_movimiento;

    @ManyToOne // Muchos movimientos pueden pertenecer a un mismo vehículo
    @JoinColumn(name = "id_vehiculo", referencedColumnName = "id_vehiculo")
    private Vehiculo vehiculo;

    @Column(name = "id_celda", nullable = false)
    private Integer idCelda;

    @Column(name = "fecha_entrada", nullable = false)
    private LocalDateTime fechaEntrada;

    @Column(name = "fecha_salida")
    private LocalDateTime fechaSalida;

    private String observaciones;

    @Enumerated(EnumType.STRING)
    private EstadoMovimiento estado = EstadoMovimiento.ACTIVO;

    // Dentro de la clase Movimiento.java
    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setEstado(EstadoMovimiento estado) {
        this.estado = estado;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public enum EstadoMovimiento {
        ACTIVO, FINALIZADO
    }
}