package com.example.backend.service;

import com.example.backend.dto.ClienteDTO;
import com.example.backend.model.Cliente;
import com.example.backend.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    private AtomicLong idGenerator = new AtomicLong(1);

    public void guardarCliente(ClienteDTO clienteDTO) {
        Long id = idGenerator.getAndIncrement();
        Cliente cliente = new Cliente(id, clienteDTO.getNombre(), clienteDTO.getTelefono(), clienteDTO.getCorreo(), clienteDTO.getNombreMascota());
        clienteRepository.save(cliente);
    }

    public java.util.List<Cliente> obtenerHistorial() {
        return clienteRepository.getHistorial();
    }
}
