package com.example.backend.service;

import com.example.backend.dto.RegisterDTO;
import com.example.backend.model.Usuario;
import com.example.backend.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private AuthRepository authRepository;

    // Se devuelve el usuario si es válido (para obtener su rol)
    public Usuario validateUser(String username, String password) {
        Usuario user = authRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public boolean registerUser(RegisterDTO registerDTO) {
        if (authRepository.findByUsername(registerDTO.getUsername()) != null) {
            return false;
        }
        // Nota: para que veterinario tenga acceso al menú, asegúrate de que al registrarlo se le asigne el rol "veterinario"
        Usuario usuario = new Usuario(registerDTO.getUsername(), registerDTO.getPassword(), registerDTO.getRol());
        authRepository.save(usuario);
        return true;
    }
}
