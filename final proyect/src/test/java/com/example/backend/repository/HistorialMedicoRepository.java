package com.example.backend.repository;

import com.example.backend.model.HistorialMedico;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class HistorialMedicoRepository {
    private List<HistorialMedico> historiales = new ArrayList<>();

    public void save(HistorialMedico historialMedico) {
        historiales.add(historialMedico);
    }

    public List<HistorialMedico> findAll() {
        return historiales;
    }
}
