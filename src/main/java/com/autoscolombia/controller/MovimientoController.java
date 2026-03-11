package com.autoscolombia.controller;



import com.autoscolombia.model.Movimiento;
import com.autoscolombia.repository.MovimientoRepository;
import com.autoscolombia.repository.VehiculoRepository; // La crearemos igual que la de movimiento
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/movimientos")
public class MovimientoController {

    @Autowired
    private MovimientoRepository movimientoRepository;

    // REGISTRAR ENTRADA
    @PostMapping("/entrada")
    public Movimiento registrarEntrada(@RequestBody Movimiento nuevoMovimiento) {
        nuevoMovimiento.setFechaEntrada(LocalDateTime.now());
        nuevoMovimiento.setEstado(Movimiento.EstadoMovimiento.ACTIVO);
        return movimientoRepository.save(nuevoMovimiento);
    }

    // REGISTRAR SALIDA
    @PutMapping("/salida/{placa}")
    public Movimiento registrarSalida(@PathVariable String placa) {
        Movimiento mov = movimientoRepository.findByVehiculoPlacaAndEstado(placa, Movimiento.EstadoMovimiento.ACTIVO)
                .orElseThrow(() -> new RuntimeException("El vehículo no se encuentra en el parqueadero"));

        mov.setFechaSalida(LocalDateTime.now());
        mov.setEstado(Movimiento.EstadoMovimiento.FINALIZADO);
        return movimientoRepository.save(mov);
    }
}
