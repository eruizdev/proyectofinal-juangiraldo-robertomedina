package com.example.backend.repository;

import com.example.backend.model.Cita;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CitaRepository {
    private Map<String, Cita> citas = new HashMap<>();
    private List<Cita> historial = new ArrayList<>();

    public void save(Cita cita) {
        String id = cita.getIdCita().trim();
        cita.setIdCita(id);
        citas.put(id, cita);
        historial.add(cita);
        System.out.println("Guardando cita con id: [" + id + "]");
    }

    public List<Cita> getHistorial() {
        return historial;
    }

    // Antes buscaba en el Map; ahora buscamos en la lista historial:
    public Cita findByIdCita(String idCita) {
        String idTrimmed = idCita.trim();
        System.out.println("Buscando cita en historial por id: [" + idTrimmed + "]");
        for (Cita c : historial) {
            if (c.getIdCita().equals(idTrimmed)) {
                return c; // devuelve la primera coincidencia
            }
        }
        return null;
    }
}
