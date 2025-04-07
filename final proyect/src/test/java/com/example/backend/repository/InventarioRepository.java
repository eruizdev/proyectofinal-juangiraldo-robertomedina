package com.example.backend.repository;

import com.example.backend.model.Producto;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class InventarioRepository {
    private Map<Long, Producto> productos = new HashMap<>();
    private long idGenerator = 1;

    public Producto save(Producto producto) {
        producto.setId(idGenerator++);
        productos.put(producto.getId(), producto);
        System.out.println("Producto agregado: " + producto);
        return producto;
    }

    public void deleteById(Long id) {
        System.out.println("Antes de eliminar: " + productos);
        productos.remove(id);
        System.out.println("Después de eliminar: " + productos);
    }

    public List<Producto> getHistorial() {
        System.out.println("Consultando historial: " + productos);
        return new ArrayList<>(productos.values());
    }
}
