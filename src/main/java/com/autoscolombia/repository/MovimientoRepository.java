package com.autoscolombia.repository;

import com.autoscolombia.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {
    // Este método nos servirá para buscar un vehículo que aún no ha salido
    Optional<Movimiento> findByVehiculoPlacaAndEstado(String placa, Movimiento.EstadoMovimiento estado);
}