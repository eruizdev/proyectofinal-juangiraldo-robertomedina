package com.example.backend.repository;

import com.example.backend.model.Factura;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class FacturacionRepository {
    private Map<String, Factura> facturas = new HashMap<>();
    private List<Factura> historial = new ArrayList<>();

    public void save(Factura factura) {
        facturas.put(factura.getIdFactura(), factura);
        historial.add(factura);
    }

    public List<Factura> findAll() {
        return new ArrayList<>(facturas.values());
    }

    public List<Factura> getHistorial() {
        return historial;
    }
}
