package com.example.backend.service;

import com.example.backend.dto.MascotaDTO;
import com.example.backend.model.Mascota;
import com.example.backend.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    private AtomicLong idGenerator = new AtomicLong(1);

    public void guardarMascota(MascotaDTO mascotaDTO) {
        Long id = idGenerator.getAndIncrement();
        Mascota mascota = new Mascota(id, mascotaDTO.getNombre(), mascotaDTO.getEspecie(), mascotaDTO.getRaza(),
                mascotaDTO.getEdad(), mascotaDTO.getNombreDueno(), mascotaDTO.getSintomas());
        mascotaRepository.save(mascota);
    }

    public java.util.List<Mascota> obtenerHistorial() {
        return mascotaRepository.getHistorial();
    }
}
