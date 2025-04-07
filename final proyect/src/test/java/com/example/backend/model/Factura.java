package com.example.backend.model;

import java.time.LocalDate;

public class Factura {
    private String idFactura; // Ingresado manualmente
    private String nombreCliente;
    private String nombreMascota;
    private String servicioRealizado; // "consulta" o "medicación/alimento/accesorio"
    private LocalDate fecha;
    private double total;
    private String metodoPago; // efectivo, tarjeta, transferencia

    public Factura() {}

    public Factura(String idFactura, String nombreCliente, String nombreMascota, String servicioRealizado, LocalDate fecha, double total, String metodoPago) {
        this.idFactura = idFactura;
        this.nombreCliente = nombreCliente;
        this.nombreMascota = nombreMascota;
        this.servicioRealizado = servicioRealizado;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
    }

    // Getters y setters
    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getServicioRealizado() {
        return servicioRealizado;
    }

    public void setServicioRealizado(String servicioRealizado) {
        this.servicioRealizado = servicioRealizado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
}
