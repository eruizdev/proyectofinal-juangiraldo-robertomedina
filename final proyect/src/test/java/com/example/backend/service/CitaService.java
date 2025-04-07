package com.example.backend.service;

import com.example.backend.dto.CitaDTO;
import com.example.backend.model.Cita;
import com.example.backend.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public void guardarCita(CitaDTO dto) {
        // Limpiar el ID antes de crear la cita
        Cita cita = new Cita(
            dto.getIdCita().trim(),
            dto.getNombreDueno(),
            dto.getHora(),
            dto.getVeterinarioAsignado(),
            dto.getNombreMascota(),
            dto.getFecha(),
            dto.getMotivo()
        );
        citaRepository.save(cita);
    }

    public List<Cita> obtenerHistorial() {
        return citaRepository.getHistorial();
    }

    // Buscar una cita por ID
    public Cita buscarPorId(String idCita) {
        return citaRepository.findByIdCita(idCita);
    }
}
