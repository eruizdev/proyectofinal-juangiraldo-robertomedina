package com.example.backend.controller;

import com.example.backend.dto.FacturaDTO;
import com.example.backend.service.FacturacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facturacion")
public class FacturacionController {

    @Autowired
    private FacturacionService facturacionService;

    @PostMapping("/generar")
    public ResponseEntity<?> generarFactura(@RequestBody FacturaDTO dto) {
        facturacionService.generarFactura(dto);
        return ResponseEntity.ok("Factura generada exitosamente");
    }

    @GetMapping("/historial")
    public ResponseEntity<?> getHistorial() {
        return ResponseEntity.ok(facturacionService.obtenerHistorial());
    }
}
