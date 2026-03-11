package com.autoscolombia.repository;

import com.autoscolombia.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {
    // Esto nos permitirá buscar un vehículo por su placa fácilmente
    Optional<Vehiculo> findByPlaca(String placa);
}