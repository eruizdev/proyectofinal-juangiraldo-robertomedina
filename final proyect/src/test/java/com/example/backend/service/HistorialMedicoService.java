package com.example.backend.service;

import com.example.backend.dto.HistorialMedicoDTO;
import com.example.backend.model.HistorialMedico;
import com.example.backend.repository.HistorialMedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialMedicoService {

    @Autowired
    private HistorialMedicoRepository historialMedicoRepository;

    public void guardarHistorial(HistorialMedicoDTO dto) {
        HistorialMedico hm = new HistorialMedico(dto.getIdMascota(), dto.getFecha(), dto.getDiagnostico(), dto.getTratamiento());
        historialMedicoRepository.save(hm);
    }

    public java.util.List<HistorialMedico> obtenerHistorial() {
        return historialMedicoRepository.findAll();
    }
}
