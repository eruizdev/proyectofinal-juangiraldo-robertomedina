package com.example.backend.repository;

import com.example.backend.model.Cliente;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class ClienteRepository {
    private Map<Long, Cliente> clientes = new HashMap<>();
    private List<Cliente> historial = new ArrayList<>();

    public void save(Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        historial.add(cliente);
    }

    public List<Cliente> findAll() {
        return new ArrayList<>(clientes.values());
    }

    public List<Cliente> getHistorial() {
        return historial;
    }
}
