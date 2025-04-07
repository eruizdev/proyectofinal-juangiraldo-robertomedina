package com.example.backend.repository;

import com.example.backend.model.Usuario;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AuthRepository {
    private Map<String, Usuario> usuarios = new HashMap<>();

    public AuthRepository() {
        // Usuario admin por defecto con rol "admin"
        usuarios.put("admin", new Usuario("admin", "admin", "admin"));
    }

    public Usuario findByUsername(String username) {
        return usuarios.get(username);
    }

    public void save(Usuario usuario) {
        usuarios.put(usuario.getUsername(), usuario);
    }
}
