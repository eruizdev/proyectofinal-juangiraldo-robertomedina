package com.example.backend.repository;

import com.example.backend.model.Mascota;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class MascotaRepository {
    private Map<Long, Mascota> mascotas = new HashMap<>();
    private List<Mascota> historial = new ArrayList<>();

    public void save(Mascota mascota) {
        mascotas.put(mascota.getId(), mascota);
        historial.add(mascota);
    }

    public List<Mascota> findAll() {
        return new ArrayList<>(mascotas.values());
    }

    public List<Mascota> getHistorial() {
        return historial;
    }
}
