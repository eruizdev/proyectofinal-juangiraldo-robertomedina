package com.example.backend.controller;

import com.example.backend.dto.ClienteDTO;
import com.example.backend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/guardar")
    public ResponseEntity<?> guardarCliente(@RequestBody ClienteDTO clienteDTO) {
        clienteService.guardarCliente(clienteDTO);
        return ResponseEntity.ok("Cliente guardado exitosamente");
    }

    @GetMapping("/historial")
    public ResponseEntity<?> getHistorial() {
        return ResponseEntity.ok(clienteService.obtenerHistorial());
    }
}
