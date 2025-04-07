package com.example.backend.service;

import com.example.backend.dto.FacturaDTO;
import com.example.backend.model.Factura;
import com.example.backend.repository.FacturacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturacionService {

    @Autowired
    private FacturacionRepository facturacionRepository;

    public void generarFactura(FacturaDTO dto) {
        Factura factura = new Factura(dto.getIdFactura(), dto.getNombreCliente(), dto.getNombreMascota(),
                dto.getServicioRealizado(), dto.getFecha(), dto.getTotal(), dto.getMetodoPago());
        facturacionRepository.save(factura);
    }

    public java.util.List<Factura> obtenerHistorial() {
        return facturacionRepository.getHistorial();
    }
}
